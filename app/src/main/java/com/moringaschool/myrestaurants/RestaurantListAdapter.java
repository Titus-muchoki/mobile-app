package com.moringaschool.myrestaurants;

import android.content.Intent;
import android.content.res.Configuration;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import butterknife.internal.Constants;

public class RestaurantListAdapter extends RecyclerView.Adapter<RestaurantListAdapter.RestaurantViewHolder> {

    public class RestaurantViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public RestaurantViewHolder(View itemView) {
            super();
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            // Determines the position of the restaurant clicked:
            int itemPosition = getLayoutPosition();
            if (mOrientation == Configuration.ORIENTATION_LANDSCAPE) {
                createDetailFragment(itemPosition);
            } else {
                Intent intent = new Intent(mContext, RestaurantDetailActivity.class);
                intent.putExtra(Constants.EXTRA_KEY_POSITION, itemPosition);
                intent.putExtra(Constants.EXTRA_KEY_RESTAURANTS, Parcels.wrap(mRestaurants));
                mContext.startActivity(intent);
            }
        }