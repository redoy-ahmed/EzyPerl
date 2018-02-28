package com.example.redoyahmed.ezyperl.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.redoyahmed.ezyperl.R;
import com.google.gson.Gson;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class StartQuizActivity extends AppCompatActivity {

    public List<String> allFollowedQuiz;

    @BindView(R.id.best_score)
    public TextView bestScore;

    public Gson gson;

    @BindView(R.id.level)
    public TextView level;

    public String mSubcategory;

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

    public String totalQuizCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_quiz);
        ButterKnife.bind(this);


        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), QuizDetailActivity.class);
                /*intent.putExtra("linkTitle", itemList1.get(getAdapterPosition()).getName());
                intent.putExtra("url", itemList1.get(getAdapterPosition()).getLink());*/
                startActivity(intent);
            }
        });

    }
}
