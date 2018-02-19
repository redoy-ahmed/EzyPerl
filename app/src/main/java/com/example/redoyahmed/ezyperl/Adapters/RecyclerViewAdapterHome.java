package com.example.redoyahmed.ezyperl.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.redoyahmed.ezyperl.Fragment.FragmentLinks;
import com.example.redoyahmed.ezyperl.Fragment.FragmentPractise;
import com.example.redoyahmed.ezyperl.Fragment.FragmentQuiz;
import com.example.redoyahmed.ezyperl.Fragment.FragmentTutorial;
import com.example.redoyahmed.ezyperl.Model.HomeItemObject;
import com.example.redoyahmed.ezyperl.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by redoy.ahmed on 11-Feb-2018.
 */

public class RecyclerViewAdapterHome extends RecyclerView.Adapter<RecyclerViewAdapterHome.RecyclerViewHolderHome> {

    private ArrayList<HomeItemObject> itemList;
    private Context context;
    private static FragmentManager fragmentManager;

    public RecyclerViewAdapterHome(Context context, ArrayList<HomeItemObject> itemList, FragmentManager fragmentManager) {
        this.itemList = itemList;
        this.context = context;
        this.fragmentManager = fragmentManager;
    }

    @Override
    public RecyclerViewHolderHome onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_list_home, parent, false);
        RecyclerViewHolderHome rcv = new RecyclerViewHolderHome(layoutView, fragmentManager);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolderHome holder, int position) {
        holder.itemName.setText(itemList.get(position).getName());
        holder.itemPhoto.setImageResource(itemList.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }

    public static class RecyclerViewHolderHome extends RecyclerView.ViewHolder {

        @BindView(R.id.list_item_textView)
        public TextView itemName;

        @BindView(R.id.list_item_imageView)
        public ImageView itemPhoto;

        public RecyclerViewHolderHome(final View itemView, final FragmentManager fragmentManager) {
            super(itemView);
            ButterKnife.bind(this, itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Fragment mFragment;
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
                    }
                }
            });
        }
    }
}

