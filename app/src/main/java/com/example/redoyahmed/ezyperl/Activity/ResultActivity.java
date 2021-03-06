package com.example.redoyahmed.ezyperl.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.redoyahmed.ezyperl.Database.DbHelper;
import com.example.redoyahmed.ezyperl.Model.Result;
import com.example.redoyahmed.ezyperl.Model.ResultItem;
import com.example.redoyahmed.ezyperl.R;
import com.example.redoyahmed.ezyperl.Services.EzyPerlApplication;
import com.example.redoyahmed.ezyperl.Utils.Constants;
import com.github.pavlospt.CircleView;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ResultActivity extends AppCompatActivity implements View.OnClickListener {
    private String mResult;
    private int quizLanguageID, quizCategoryID;
    private List<ResultItem> submittedResult;
    private Gson gson;
    public DbHelper db;
    private List<Result> result;

    @BindView(R.id.your_score)
    public CircleView scoreView;

    @BindView(R.id.correct_answer)
    public TextView correctAnswers;

    @BindView(R.id.wrong_answer)
    public TextView wrongAnswers;

    @BindView(R.id.result_button)
    public Button resultButton;

    @BindView(R.id.main_menu_button)
    public Button mainMenuButton;

    @BindView(R.id.play_again_button)
    public Button playAgainButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ButterKnife.bind(this);

        loadData();
        loadDataIntoWidgets();
    }

    private void loadData() {
        mResult = getIntent().getExtras().getString(Constants.QUIZ_RESULT);
        quizLanguageID = getIntent().getExtras().getInt(Constants.LANGUAGE_ID);
        quizCategoryID = getIntent().getExtras().getInt(Constants.CATEGORY_ID);
        gson = EzyPerlApplication.getGsonObject();
        submittedResult = arrayToListObject(gson.fromJson(mResult, ResultItem[].class));

        db = new DbHelper(getApplicationContext());
        result = db.getResultsByCategory(quizCategoryID);

        int totalQuestion = submittedResult.size();
        int correct = correctCount(submittedResult);

        Result result1;

        if (result.size() > 0) {
            if (result.get(0).getCorrect_answer() <= correct) {
                result1 = new Result(quizLanguageID, quizCategoryID, (result.get(0).getTimes_played() + 1), totalQuestion, correct, 1);
            } else {
                result1 = new Result(quizLanguageID, quizCategoryID, (result.get(0).getTimes_played() + 1), totalQuestion, result.get(0).getCorrect_answer(), 1);
            }
        } else {
            result1 = new Result(quizLanguageID, quizCategoryID, 1, totalQuestion, correct, 1);
        }
        db.addResult(result1);
    }

    private List<ResultItem> arrayToListObject(ResultItem[] response) {
        List<ResultItem> allCategories = new ArrayList();
        Collections.addAll(allCategories, response);
        return allCategories;
    }

    private void loadDataIntoWidgets() {
        int scoreInPercentage = getScorePercent(submittedResult);
        scoreView.setTitleText(scoreInPercentage + "%");

        if (questionCount(submittedResult, true) == 0) {
            correctAnswers.setText(String.format(Locale.getDefault(), "%d correct answer", new Object[]{Integer.valueOf(questionCount(submittedResult, true))}));
        } else {
            correctAnswers.setText(String.format(Locale.getDefault(), "%d correct answers", new Object[]{Integer.valueOf(questionCount(submittedResult, true))}));
        }
        if (questionCount(submittedResult, false) == 0) {
            wrongAnswers.setText(String.format(Locale.getDefault(), "%d wrong answer", new Object[]{Integer.valueOf(questionCount(submittedResult, false))}));
        } else {
            wrongAnswers.setText(String.format(Locale.getDefault(), "%d wrong answers", new Object[]{Integer.valueOf(questionCount(submittedResult, false))}));
        }

        resultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent analysisIntent = new Intent(ResultActivity.this, AnalysisActivity.class);
                analysisIntent.putExtra(Constants.QUIZ_RESULT, mResult);
                startActivity(analysisIntent);
                finish();
            }
        });

        playAgainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), QuizDetailActivity.class);
                intent.putExtra(Constants.LANGUAGE_ID, quizLanguageID);
                intent.putExtra(Constants.CATEGORY_ID, quizCategoryID);
                startActivity(intent);
                finish();
            }
        });

        mainMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ResultActivity.this, MainActivity.class));
                finish();
            }
        });
    }

    private int getScorePercent(List<ResultItem> result) {
        int count = 0;
        if (result == null) {
            return 0;
        }
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i).getIsAnswer() == 1) {
                count++;
            }
        }
        return (count * 100) / result.size();
    }

    private int questionCount(List<ResultItem> result, boolean passed) {
        int correct = 0;
        int wrong = 0;
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i).getIsAnswer() == 1) {
                correct++;
            } else {
                wrong++;
            }
        }
        return passed ? correct : wrong;
    }

    private int correctCount(List<ResultItem> result) {
        int correct = 0;
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i).getIsAnswer() == 1) {
                correct++;
            }
        }
        return correct;
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
