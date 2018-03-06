package com.example.redoyahmed.ezyperl.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.redoyahmed.ezyperl.Activity.StartQuizActivity;
import com.example.redoyahmed.ezyperl.Model.PerformanceItem;
import com.example.redoyahmed.ezyperl.R;
import com.example.redoyahmed.ezyperl.Utils.Constants;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecyclerViewAdapterProfile extends RecyclerView.Adapter<RecyclerViewAdapterProfile.ProfileViewHolder> {
    private Context context;
    private List<PerformanceItem> performanceObjectList;

    public RecyclerViewAdapterProfile(Context context, List<PerformanceItem> performanceObjectList) {
        this.context = context;
        this.performanceObjectList = performanceObjectList;
    }

    @Override
    public ProfileViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_list_profile, parent, false);
        RecyclerViewAdapterProfile.ProfileViewHolder rcv = new RecyclerViewAdapterProfile.ProfileViewHolder(layoutView, context, performanceObjectList);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapterProfile.ProfileViewHolder holder, int position) {
        PerformanceItem performanceObject = this.performanceObjectList.get(position);
        holder.quizCategory.setText(performanceObject.getCategory());
        int scoreInPercentage = getScorePercent(performanceObjectList, position);
        holder.quizCategoryScore.setText(String.format("%s%% in all quiz attempts", String.valueOf(scoreInPercentage)));
        holder.scoreIndicator.setProgress(performanceObject.getCorrectAnswer());
    }

    public int getItemCount() {
        return this.performanceObjectList.size();
    }

    public static class ProfileViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.quiz_subject)
        public TextView quizCategory;

        @BindView(R.id.quiz_subject_score)
        public TextView quizCategoryScore;

        @BindView(R.id.quiz_score_indicator)
        public ProgressBar scoreIndicator;

        public ProfileViewHolder(final View itemView, final Context context, final List<PerformanceItem> performanceObjectList) {
            super(itemView);
            ButterKnife.bind(this, itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, StartQuizActivity.class);
                    intent.putExtra(Constants.CATEGORY_ID, performanceObjectList.get(getAdapterPosition()).getCategoryID());
                    intent.putExtra(Constants.CATEGORY, performanceObjectList.get(getAdapterPosition()).getCategory());
                    context.startActivity(intent);
                }
            });
        }
    }

    private int getScorePercent(List<PerformanceItem> performanceItems, int position) {
        int totalQuestion = performanceItems.get(position).getTotalQuestion();
        int correctAnswer = performanceItems.get(position).getCorrectAnswer();

        if (performanceItems == null || totalQuestion == 0) {
            return 0;
        }
        return (correctAnswer * 100) / totalQuestion;
    }
}
