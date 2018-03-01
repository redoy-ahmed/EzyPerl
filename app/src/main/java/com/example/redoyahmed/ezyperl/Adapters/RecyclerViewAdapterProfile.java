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
        RecyclerViewAdapterProfile.ProfileViewHolder rcv = new RecyclerViewAdapterProfile.ProfileViewHolder(layoutView, context);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapterProfile.ProfileViewHolder holder, int position) {
        PerformanceItem performanceObject = this.performanceObjectList.get(position);
        holder.quizCategory.setText(performanceObject.getName());
        holder.quizCategoryScore.setText(String.format("%s%% in all quiz attempts", new Object[]{performanceObject.getValue()}));
        holder.scoreIndicator.setProgress(Integer.parseInt(performanceObject.getValue()));
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

        public ProfileViewHolder(final View itemView, final Context context) {
            super(itemView);
            ButterKnife.bind(this, itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, StartQuizActivity.class);
                    /*intent.putExtra("linkTitle", itemList1.get(getAdapterPosition()).getName());
                    intent.putExtra("url", itemList1.get(getAdapterPosition()).getLink());*/
                    context.startActivity(intent);
                }
            });
        }
    }
}
