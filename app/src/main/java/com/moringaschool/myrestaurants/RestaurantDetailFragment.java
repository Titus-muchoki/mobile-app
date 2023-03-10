//package com.moringaschool.myrestaurants;
//
//import android.os.Bundle;
//import android.view.View;
//
//import androidx.fragment.app.Fragment;
//
//import java.util.ArrayList;
//
//public class RestaurantDetailFragment extends Fragment implements View.OnClickListener {
//
//    private ArrayList<Restaurant> mRestaurants;
//    private int mPosition;
//
//    public static RestaurantDetailFragment newInstance(ArrayList<Restaurant> restaurants, Integer position) {
//        RestaurantDetailFragment restaurantDetailFragment = new RestaurantDetailFragment();
//        Bundle args = new Bundle();
//
//        args.putParcelable(Constants.EXTRA_KEY_RESTAURANTS, Parcels.wrap(restaurants));
//        args.putInt(Constants.EXTRA_KEY_POSITION, position);
//
//        restaurantDetailFragment.setArguments(args);
//        return restaurantDetailFragment;
//    }
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        mRestaurants = Parcels.unwrap(getArguments().getParcelable(Constants.EXTRA_KEY_RESTAURANTS));
//        mPosition = getArguments().getInt(Constants.EXTRA_KEY_POSITION);
//        mRestaurant = mRestaurants.get(mPosition);
//    }