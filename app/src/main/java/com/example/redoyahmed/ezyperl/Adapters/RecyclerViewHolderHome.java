package com.example.redoyahmed.ezyperl.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.redoyahmed.ezyperl.Fragment.FragmentLinks;
import com.example.redoyahmed.ezyperl.Fragment.FragmentPractise;
import com.example.redoyahmed.ezyperl.Fragment.FragmentQuiz;
import com.example.redoyahmed.ezyperl.Fragment.FragmentTutorial;
import com.example.redoyahmed.ezyperl.R;

/**
 * Created by redoy.ahmed on 11-Feb-2018.
 */

public class RecyclerViewHolderHome extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView itemName;
    public ImageView itemPhoto;

    public RecyclerViewHolderHome(final View itemView, final FragmentManager fragmentManager) {
        super(itemView);
        itemView.setOnClickListener(this);
        itemName = itemView.findViewById(R.id.list_item_textView);
        itemPhoto = itemView.findViewById(R.id.list_item_imageView);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment mFragment;

                if (getLayoutPosition() == 0) {
                    mFragment = new FragmentTutorial();
                } else if (getLayoutPosition() == 1) {
                    mFragment = new FragmentPractise();
                } else if (getLayoutPosition() == 1) {
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

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "Clicked Country Position = " + getPosition(), Toast.LENGTH_SHORT).show();
    }
}
