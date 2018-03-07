package com.example.redoyahmed.ezyperl.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.redoyahmed.ezyperl.Database.DbHelper;
import com.example.redoyahmed.ezyperl.Model.Result;
import com.example.redoyahmed.ezyperl.R;
import com.example.redoyahmed.ezyperl.Utils.Constants;
import com.example.redoyahmed.ezyperl.Utils.CustomSweetAlertDialog;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.pedant.SweetAlert.SweetAlertDialog;

public class StartQuizActivity extends AppCompatActivity {

    @BindView(R.id.best_score)
    public TextView bestScore;

    @BindView(R.id.level)
    public TextView level;

    @BindView(R.id.agree)
    public CheckBox quizAgreement;

    @BindView(R.id.percentage)
    public TextView quizCompetedPercentage;

    @BindView(R.id.quiz_description)
    public TextView quizDescription;

    @BindView(R.id.quiz_image)
    public ImageView quizImage;

    @BindView(R.id.quiz_name)
    public TextView quizName;

    @BindView(R.id.time_played)
    public TextView timePlayed;

    @BindView(R.id.total_question)
    public TextView totalQuestion;

    @BindView(R.id.play_button)
    public Button playButton;

    public int totalQuizCount;
    public String quizCategory;
    public int languageID;
    public int quizCategoryID;

    public List<Result> result;

    public CustomSweetAlertDialog customSweetAlertDialog;
    public SweetAlertDialog dialog;
    public DbHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_quiz);
        ButterKnife.bind(this);

        loadData();
        loadDataIntoWidgets();

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (totalQuizCount <= 0) {
                    dialog = customSweetAlertDialog.getAlertDialog(StartQuizActivity.this, SweetAlertDialog.ERROR_TYPE, "Oops...", "No quiz in this quiz group yet!");
                    dialog.show();
                } else if (quizAgreement.isChecked()) {
                    Intent intent = new Intent(getApplicationContext(), QuizDetailActivity.class);
                    intent.putExtra(Constants.LANGUAGE_ID, languageID);
                    intent.putExtra(Constants.CATEGORY_ID, quizCategoryID);
                    startActivity(intent);
                } else {
                    dialog = customSweetAlertDialog.getAlertDialog(StartQuizActivity.this, SweetAlertDialog.ERROR_TYPE, "Oops...", "You must agree to quiz instruction before you start!");
                    dialog.show();
                }
            }
        });
    }

    private void loadData() {
        languageID = getIntent().getExtras().getInt(Constants.LANGUAGE_ID);
        quizCategoryID = getIntent().getExtras().getInt(Constants.CATEGORY_ID);
        quizCategory = getIntent().getExtras().getString(Constants.CATEGORY);

        customSweetAlertDialog = new CustomSweetAlertDialog();

        db = new DbHelper(getApplicationContext());
        result = db.getResultsByCategory(quizCategoryID);
        totalQuizCount = db.questionCount(quizCategoryID);
    }

    private void loadDataIntoWidgets() {
        quizName.setText(quizCategory);
        totalQuestion.setText("TOTAL QUESTION IN " + quizCategory);
        quizCompetedPercentage.setText(totalQuizCount + " QUESTIONS");

        if (result.size() > 0) {
            bestScore.setText(result.get(0).getCorrect_answer() + "");
            timePlayed.setText(result.get(0).getTimes_played() + "");
            level.setText(result.get(0).getLevel() + "");
        } else {
            bestScore.setText("0");
            timePlayed.setText("0");
            level.setText("1");
        }
    }
}
