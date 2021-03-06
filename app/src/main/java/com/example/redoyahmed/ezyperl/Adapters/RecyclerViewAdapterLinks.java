package com.example.redoyahmed.ezyperl.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.redoyahmed.ezyperl.Activity.LinkDetailsActivity;
import com.example.redoyahmed.ezyperl.Model.LinksItem;
import com.example.redoyahmed.ezyperl.R;
import com.iarcuschin.simpleratingbar.SimpleRatingBar;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by redoy.ahmed on 15-Feb-2018.
 */

public class RecyclerViewAdapterLinks extends RecyclerView.Adapter<RecyclerViewAdapterLinks.RecyclerViewHolderLinks> {

    private ArrayList<LinksItem> itemList;
    private Context context;

    public RecyclerViewAdapterLinks(Context context, ArrayList<LinksItem> itemList, FragmentManager fragmentManager) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public RecyclerViewAdapterLinks.RecyclerViewHolderLinks onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_list_links, parent, false);
        RecyclerViewAdapterLinks.RecyclerViewHolderLinks rcv = new RecyclerViewAdapterLinks.RecyclerViewHolderLinks(layoutView, context, itemList);
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

    public static class RecyclerViewHolderLinks extends RecyclerView.ViewHolder {

        @BindView(R.id.list_item_textView)
        public TextView itemName;

        @BindView(R.id.list_item_imageView)
        public ImageView itemPhoto;

        @BindView(R.id.list_item__rating_bar)
        SimpleRatingBar itemRatingBar;

        public RecyclerViewHolderLinks(final View itemView, final Context context, final ArrayList<LinksItem> itemList1) {
            super(itemView);
            ButterKnife.bind(this, itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, LinkDetailsActivity.class);
                    intent.putExtra("linkTitle", itemList1.get(getAdapterPosition()).getName());
                    intent.putExtra("url", itemList1.get(getAdapterPosition()).getLink());
                    context.startActivity(intent);
                }
            });
        }
    }
}