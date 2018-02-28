package com.example.redoyahmed.ezyperl.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.redoyahmed.ezyperl.Model.PerformanceObject;
import com.example.redoyahmed.ezyperl.R;

import java.util.List;

public class RecyclerViewAdapterProfile extends RecyclerView.Adapter<RecyclerViewAdapterProfile.ProfileViewHolder> {
    private Context context;
    private List<PerformanceObject> performanceObjectList;

    public RecyclerViewAdapterProfile(Context context, List<PerformanceObject> performanceObjectList) {
        this.context = context;
        this.performanceObjectList = performanceObjectList;
    }

    public ProfileViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ProfileViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_list_profile, parent, false));
    }

    public void onBindViewHolder(ProfileViewHolder holder, int position) {
        PerformanceObject performanceObject = this.performanceObjectList.get(position);
        holder.quizCategory.setText(performanceObject.getName());
        holder.quizCategoryScore.setText(String.format("%s%% in all quiz attempts", new Object[]{performanceObject.getValue()}));
        holder.scoreIndicator.setProgress(Integer.parseInt(performanceObject.getValue()));
    }

    public int getItemCount() {
        return this.performanceObjectList.size();
    }

    public class ProfileViewHolder extends RecyclerView.ViewHolder {

        public TextView quizCategory;
        public TextView quizCategoryScore;
        public ProgressBar scoreIndicator;

        public ProfileViewHolder(View itemView) {
            super(itemView);
            this.quizCategory = itemView.findViewById(R.id.quiz_subject);
            this.quizCategoryScore = itemView.findViewById(R.id.quiz_subject_score);
            this.scoreIndicator = itemView.findViewById(R.id.quiz_score_indicator);
        }
    }
}
