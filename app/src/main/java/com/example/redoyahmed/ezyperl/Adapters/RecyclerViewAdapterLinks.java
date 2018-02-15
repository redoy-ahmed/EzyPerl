package com.example.redoyahmed.ezyperl.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.redoyahmed.ezyperl.Activity.LinkDetailsActivity;
import com.example.redoyahmed.ezyperl.Fragment.FragmentLinks;
import com.example.redoyahmed.ezyperl.Fragment.FragmentPractise;
import com.example.redoyahmed.ezyperl.Fragment.FragmentQuiz;
import com.example.redoyahmed.ezyperl.Fragment.FragmentTutorial;
import com.example.redoyahmed.ezyperl.Model.HomeItemObject;
import com.example.redoyahmed.ezyperl.Model.LinksItemObject;
import com.example.redoyahmed.ezyperl.R;
import com.iarcuschin.simpleratingbar.SimpleRatingBar;

import java.util.ArrayList;

/**
 * Created by redoy.ahmed on 15-Feb-2018.
 */

public class RecyclerViewAdapterLinks extends RecyclerView.Adapter<RecyclerViewAdapterLinks.RecyclerViewHolderLinks> {

    private ArrayList<LinksItemObject> itemList;
    private Context context;
    private FragmentManager fragmentManager;

    public RecyclerViewAdapterLinks(Context context, ArrayList<LinksItemObject> itemList, FragmentManager fragmentManager) {
        this.itemList = itemList;
        this.context = context;
        this.fragmentManager = fragmentManager;
    }

    @Override
    public RecyclerViewAdapterLinks.RecyclerViewHolderLinks onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_list_links, parent, false);
        RecyclerViewAdapterLinks.RecyclerViewHolderLinks rcv = new RecyclerViewAdapterLinks.RecyclerViewHolderLinks(layoutView, fragmentManager);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapterLinks.RecyclerViewHolderLinks holder, int position) {
        holder.itemName.setText(itemList.get(position).getName());
        holder.itemRatingBar.setRating(itemList.get(position).getRating());
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }

    public static class RecyclerViewHolderLinks extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView itemName;
        public ImageView itemPhoto;
        SimpleRatingBar itemRatingBar;

        public RecyclerViewHolderLinks(final View itemView, final FragmentManager fragmentManager) {
            super(itemView);
            itemView.setOnClickListener(this);
            itemName = itemView.findViewById(R.id.list_item_textView);
            itemPhoto = itemView.findViewById(R.id.list_item_imageView);
            itemRatingBar = itemView.findViewById(R.id.list_item__rating_bar);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    itemView.getContext().startActivity(new Intent(itemView.getContext(), LinkDetailsActivity.class));
                }
            });
        }

        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(), "Clicked Country Position = " + getPosition(), Toast.LENGTH_SHORT).show();
        }
    }
}