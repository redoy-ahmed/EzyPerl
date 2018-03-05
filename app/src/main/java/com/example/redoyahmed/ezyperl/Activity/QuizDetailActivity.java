package com.example.redoyahmed.ezyperl.Activity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.redoyahmed.ezyperl.Database.DbHelper;
import com.example.redoyahmed.ezyperl.Model.QuestionItem;
import com.example.redoyahmed.ezyperl.Model.ResultItem;
import com.example.redoyahmed.ezyperl.R;
import com.example.redoyahmed.ezyperl.Services.CustomSharedPreference;
import com.example.redoyahmed.ezyperl.Services.EzyPerlApplication;
import com.example.redoyahmed.ezyperl.Utils.Constants;
import com.example.redoyahmed.ezyperl.Utils.PlayAudio;
import com.example.redoyahmed.ezyperl.Utils.PlaySound;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class QuizDetailActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.answer_one)
    public Button answerOneButton;

    @BindView(R.id.answer_two)
    public Button answerTwoButton;

    @BindView(R.id.answer_three)
    public Button answerThreeButton;

    @BindView(R.id.answer_four)
    public Button answerFourButton;

    public CountDownTimer countDownTimer;
    public int counter = 0;
    public QuestionItem currentQuestion;
    public Gson gson;
    public Handler handler;
    public boolean isMusicActive;
    public boolean isSoundActive;
    public PlayAudio playAudio;
    public PlaySound playMusic;
    public int questionIndex = 0;
    public int questionNumber;
    static final boolean $assertionsDisabled = (!QuizDetailActivity.class.desiredAssertionStatus());

    @BindView(R.id.quiz_question_number)
    public TextView question_num;

    public List<QuestionItem> questions;

    @BindView(R.id.quiz_name)
    public TextView quiz_name;

    @BindView(R.id.quiz_question)
    public TextView quiz_question;

    public List<ResultItem> resultList;
    public String selectedQuizName;

    @BindView(R.id.quiz_timer)
    public ProgressBar timeProgress;

    private int totalQuestion;
    private CustomSharedPreference shared;

    class Limit implements Runnable {
        Limit() {
        }

        public void run() {
            String resultString = gson.toJson(resultList);
            Intent resultIntent = new Intent(getApplicationContext(), ResultActivity.class);
            resultIntent.putExtra(Constants.QUIZ_RESULT, resultString);
            resultIntent.putExtra(Constants.SUBCATEGORY, selectedQuizName);
            startActivity(resultIntent);
        }
    }

    class Ahmed implements Runnable {
        Ahmed() {
        }

        public void run() {
            resetButtonBackgroundColors();
            displayCurrentQuestion();
            enableOptionButtons();
            updateCounter();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_detail);
        ButterKnife.bind(this);

        initializeWidgets();
        loadData();

        answerOneButton.setOnClickListener(this);
        answerTwoButton.setOnClickListener(this);
        answerThreeButton.setOnClickListener(this);
        answerFourButton.setOnClickListener(this);

        quiz_name.setText(selectedQuizName);
        timeProgress.setMax(20);
    }

    private void initializeWidgets() {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        shared = EzyPerlApplication.getShared(getApplicationContext());

        isMusicActive = shared.getSavedMusic();
        isSoundActive = shared.getSavedSound();

        if (isMusicActive) {
            playAudio.playSound(R.raw.quizmusic);
        }

        handler = new Handler();
        resultList = new ArrayList();
        playMusic = new PlaySound(this);
        playAudio = new PlayAudio(this);
    }

    private void loadData() {

        gson = EzyPerlApplication.getGsonObject();

        DbHelper db = new DbHelper(this);
        questions = db.getAllQuestions();

        currentQuestion = questions.get(questionIndex);
        questionNumber = questionIndex + 1;
        totalQuestion = questions.size();

        displayCurrentQuestion();
        updateCounter();
    }

    private void displayCurrentQuestion() {
        StringBuilder append = new StringBuilder().append("Question ");
        int i = questionNumber;
        questionNumber = i + 1;
        question_num.setText(append.append(i).append(" of ").append(totalQuestion).toString());

        quiz_question.setText(currentQuestion.getQuestion());
        answerOneButton.setText(currentQuestion.getOption_one());
        answerTwoButton.setText(currentQuestion.getOption_two());
        answerThreeButton.setText(currentQuestion.getOption_three());
        answerFourButton.setText(currentQuestion.getOption_four());
    }

    private void updateCounter() {
        this.countDownTimer = new CountDownTimer(21000, 1000) {
            final /* synthetic */ boolean $assertionsDisabled = (!QuizDetailActivity.class.desiredAssertionStatus());

            class Kona implements Runnable {
                Kona() {
                }

                public void run() {
                    String resultString = gson.toJson(resultList);
                    Intent resultIntent = new Intent(getApplicationContext(), ResultActivity.class);
                    resultIntent.putExtra(Constants.QUIZ_RESULT, resultString);
                    resultIntent.putExtra(Constants.SUBCATEGORY, selectedQuizName);
                    startActivity(resultIntent);
                }
            }

            class Redoy implements Runnable {
                Redoy() {
                }

                public void run() {
                    resetButtonBackgroundColors();
                    displayCurrentQuestion();
                    timeProgress.setProgress(counter);
                    enableOptionButtons();
                    updateCounter();
                }
            }

            public void onTick(long millisUntilFinished) {
                Log.d("Quiz Detail Activity", "Counting time " + millisUntilFinished + " " + counter);
                counter = counter + 1;
                timeProgress.setProgress(counter);
            }

            public void onFinish() {
                playMusic.playSound(false, R.raw.wrong);
                int correctAnswer = currentQuestion.getAnswer();
                Button answerButton = getButtonIdWithPosition(correctAnswer);
                String correctAnswerInText = correctAnswerInText(correctAnswer);
                if ($assertionsDisabled || answerButton != null) {
                    answerButton.setBackgroundColor(getResources().getColor(R.color.main_green_color));
                    disableOptionButtons();
                    resultList.add(new ResultItem("" + (questionIndex + 1), currentQuestion.getQuestion(), correctAnswerInText, "", 0));
                    counter = 0;
                    questionIndex = questionIndex + 1;
                    if (questionIndex >= totalQuestion) {
                        handler.postDelayed(new Kona(), 2000);
                        return;
                    }
                    currentQuestion = questions.get(questionIndex);
                    handler.postDelayed(new Redoy(), 2000);
                    return;
                }
                throw new AssertionError();
            }
        };
        this.countDownTimer.start();
    }

    private void resetButtonBackgroundColors() {
        answerOneButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
        answerTwoButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
        answerThreeButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
        answerFourButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
    }

    private void enableOptionButtons() {
        answerOneButton.setEnabled(true);
        answerTwoButton.setEnabled(true);
        answerThreeButton.setEnabled(true);
        answerFourButton.setEnabled(true);
    }

    private void disableOptionButtons() {
        answerOneButton.setEnabled(false);
        answerTwoButton.setEnabled(false);
        answerThreeButton.setEnabled(false);
        answerFourButton.setEnabled(false);
    }

    private Button getButtonIdWithPosition(int position) {
        if (position == 1) {
            return answerOneButton;
        }
        if (position == 2) {
            return answerTwoButton;
        }
        if (position == 3) {
            return answerThreeButton;
        }
        if (position == 4) {
            return answerFourButton;
        }
        return null;
    }

    private String correctAnswerInText(int answer) {
        if (answer == 1) {
            return answerOneButton.getText().toString();
        }
        if (answer == 2) {
            return answerTwoButton.getText().toString();
        }
        if (answer == 3) {
            return answerThreeButton.getText().toString();
        }
        if (answer == 4) {
            return answerFourButton.getText().toString();
        }
        return "";
    }

    public void onClick(View v) {
        Button clickedButton = (Button) v;
        String answerInText = clickedButton.getText().toString();
        int answerNumber = getButtonNumberClicked(clickedButton.getId());
        int correctAnswer = currentQuestion.getAnswer();
        String correctAnswerInText = correctAnswerInText(correctAnswer);
        if (countDownTimer != null) {
            counter = 0;
            timeProgress.setProgress(this.counter);
            countDownTimer.cancel();
        }
        if (answerNumber == correctAnswer) {
            if (isSoundActive) {
                playMusic.playSound(false, R.raw.correct);
            }
            clickedButton.setBackgroundColor(getResources().getColor(R.color.green_primary));
            disableOptionButtons();
            resultList.add(new ResultItem("" + (questionIndex + 1), currentQuestion.getQuestion(), correctAnswerInText, answerInText, 1));
        } else {
            if (isSoundActive) {
                playMusic.playSound(false, R.raw.wrong);
            }
            clickedButton.setBackgroundColor(getResources().getColor(R.color.red_primary));
            Button correctButton = getButtonIdWithPosition(correctAnswer);
            resultList.add(new ResultItem("" + (questionIndex + 1), currentQuestion.getQuestion(), correctAnswerInText, answerInText, 0));
            if ($assertionsDisabled || correctButton != null) {
                correctButton.setBackgroundColor(getResources().getColor(R.color.main_green_color));
            } else {
                throw new AssertionError();
            }
        }
        questionIndex++;
        if (questionIndex >= totalQuestion) {
            handler.postDelayed(new Limit(), 2000);
            return;
        }
        currentQuestion = questions.get(questionIndex);
        handler.postDelayed(new Ahmed(), 2000);
    }

    private int getButtonNumberClicked(int buttonId) {
        switch (buttonId) {
            case R.id.answer_one:
                return 1;
            case R.id.answer_two:
                return 2;
            case R.id.answer_three:
                return 3;
            case R.id.answer_four:
                return 4;
            default:
                return 0;
        }
    }
}
