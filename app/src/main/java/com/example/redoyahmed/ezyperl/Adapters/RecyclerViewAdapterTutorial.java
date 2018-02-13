package com.example.redoyahmed.ezyperl.Adapters;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.redoyahmed.ezyperl.Model.HomeItemObject;
import com.example.redoyahmed.ezyperl.R;

import java.util.ArrayList;

/**
 * Created by redoy.ahmed on 13-Feb-2018.
 */

public class RecyclerViewAdapterTutorial extends RecyclerView.Adapter<RecyclerViewHolderTutorial> {

    private ArrayList<HomeItemObject> itemList;
    private Context context;
    private FragmentManager fragmentManager;

    public RecyclerViewAdapterTutorial(Context context, ArrayList<HomeItemObject> itemList, FragmentManager fragmentManager) {
        this.itemList = itemList;
        this.context = context;
        this.fragmentManager = fragmentManager;
    }

    @Override
    public RecyclerViewHolderTutorial onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_list_tutorial, null);
        RecyclerViewHolderTutorial rcv = new RecyclerViewHolderTutorial(layoutView, fragmentManager);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolderTutorial holder, int position) {
        holder.itemName.setText(itemList.get(position).getName());
        holder.itemPhoto.setImageResource(itemList.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}

