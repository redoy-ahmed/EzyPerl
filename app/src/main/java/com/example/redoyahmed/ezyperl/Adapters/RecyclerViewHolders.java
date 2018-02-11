package com.example.redoyahmed.ezyperl.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.redoyahmed.ezyperl.R;

/**
 * Created by redoy.ahmed on 11-Feb-2018.
 */

public class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView itemName;
    public ImageView itemPhoto;

    public RecyclerViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        itemName = itemView.findViewById(R.id.list_item_textView);
        itemPhoto = itemView.findViewById(R.id.list_item_imageView);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "Clicked Country Position = " + getPosition(), Toast.LENGTH_SHORT).show();
    }
}
