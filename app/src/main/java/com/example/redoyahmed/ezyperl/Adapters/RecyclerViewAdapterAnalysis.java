package com.example.redoyahmed.ezyperl.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.redoyahmed.ezyperl.Activity.ResultActivity;
import com.example.redoyahmed.ezyperl.Model.ResultItem;
import com.example.redoyahmed.ezyperl.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecyclerViewAdapterAnalysis extends RecyclerView.Adapter<RecyclerViewAdapterAnalysis.AnalysisViewHolder> {
    private List<ResultItem> resultObjectList;

    public RecyclerViewAdapterAnalysis(List<ResultItem> resultObjectList) {
        this.resultObjectList = resultObjectList;
    }

    public AnalysisViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new AnalysisViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_list_quiz_result, parent, false));
    }

    public void onBindViewHolder(AnalysisViewHolder holder, int position) {
        ResultItem rObject = this.resultObjectList.get(position);
        holder.question.setText(rObject.getQuestionNumber() + ". " + rObject.getQuestion());
        holder.correct.setText(String.format("Correct Answer: %s", new Object[]{rObject.getCorrect()}));
        if (TextUtils.isEmpty(rObject.getWrong())) {
            holder.wrong.setText("Selected Answer: No answer selected");
        } else {
            holder.wrong.setText(String.format("Selected Answer: %s", new Object[]{rObject.getWrong()}));
        }
        if (rObject.getIsAnswer() == 1) {
            holder.mark.setImageResource(R.drawable.correct);
        } else {
            holder.mark.setImageResource(R.drawable.wrong);
        }
    }

    public int getItemCount() {
        return this.resultObjectList.size();
    }

    public static class AnalysisViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.question)
        public TextView question;

        @BindView(R.id.correct_answer)
        public TextView correct;

        @BindView(R.id.wrong_answer)
        public TextView wrong;

        @BindView(R.id.mark_icon)
        public ImageView mark;

        public AnalysisViewHolder(final View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    /*Intent intent = new Intent(context, StartQuizActivity.class);
                    *//*intent.putExtra("linkTitle", itemList1.get(getAdapterPosition()).getName());
                    intent.putExtra("url", itemList1.get(getAdapterPosition()).getLink());*//*
                    context.startActivity(intent);*/
                }
            });
        }
    }
}
