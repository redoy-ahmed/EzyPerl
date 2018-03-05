package com.example.redoyahmed.ezyperl.Adapters;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.redoyahmed.ezyperl.Model.TutorialItems;
import com.example.redoyahmed.ezyperl.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.example.redoyahmed.ezyperl.Utils.Colors.colors;

/**
 * Created by redoy.ahmed on 20-Feb-2018.
 */

public class RecyclerViewAdapterTutorial extends RecyclerView.Adapter<RecyclerViewAdapterTutorial.RecyclerViewHolderTutorial> {

    private List<TutorialItems> itemList;
    private Context context;
    private FragmentManager fragmentManager;

    public RecyclerViewAdapterTutorial(Context context, List<TutorialItems> itemList, FragmentManager fragmentManager) {
        this.itemList = itemList;
        this.context = context;
        this.fragmentManager = fragmentManager;
    }

    @Override
    public RecyclerViewHolderTutorial onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_list_tutorial, parent, false);
        RecyclerViewAdapterTutorial.RecyclerViewHolderTutorial rcv = new RecyclerViewAdapterTutorial.RecyclerViewHolderTutorial(layoutView, fragmentManager);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapterTutorial.RecyclerViewHolderTutorial holder, int position) {
        holder.itemName.setText(itemList.get(position).getTutorial_name());
        holder.itemPhoto.setImageResource(R.drawable.tutorial);
        holder.relativeLayout.setBackgroundColor(Color.parseColor(colors[new Random().nextInt(colors.length)]));
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }

    public static class RecyclerViewHolderTutorial extends RecyclerView.ViewHolder {

        @BindView(R.id.list_item_textView)
        public TextView itemName;

        @BindView(R.id.list_item_imageView)
        public ImageView itemPhoto;

        @BindView(R.id.relativeLayout)
        public RelativeLayout relativeLayout;

        public RecyclerViewHolderTutorial(final View itemView, final FragmentManager fragmentManager) {
            super(itemView);
            ButterKnife.bind(this, itemView);

            /*Fragment mFragment;

            if (getAdapterPosition() == 0) {
                mFragment = new FragmentTutorial();
            } else if (getAdapterPosition() == 1) {
                mFragment = new FragmentPractise();
            } else if (getAdapterPosition() == 1) {
                mFragment = new FragmentQuiz();
            } else {
                mFragment = new FragmentLinks();
            }

            if (mFragment != null) {
                fragmentManager.beginTransaction().replace(R.id.container, mFragment).commit();
            }*/
        }
    }
}