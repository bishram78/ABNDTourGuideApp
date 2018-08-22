package com.bishram.tour.guide.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bishram.tour.guide.R;
import com.bishram.tour.guide.models.LocationModel;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<LocationModel> {

    public LocationAdapter(Context context, ArrayList<LocationModel> arrayList) {
        super(context, 0, arrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.location_model,
                    parent,false);
        }

        LocationModel currentLocationModel = getItem(position);

        TextView textViewLocName = convertView.findViewById(R.id.loc_mod_location_name);
        ImageView imageViewBanner = convertView.findViewById(R.id.loc_mod_banner);
        TextView textViewRatings = convertView.findViewById(R.id.loc_mod_rating);
        RatingBar ratingBarStars = convertView.findViewById(R.id.loc_mod_rating_stars);
        TextView textViewReviews = convertView.findViewById(R.id.loc_mod_no_of_review);
        TextView textViewDistance = convertView.findViewById(R.id.loc_mod_distance);
        TextView textViewSchedule = convertView.findViewById(R.id.loc_mod_schedule);

        assert currentLocationModel != null;
        String stringReview = "( " + currentLocationModel.getReviewPoints() + " reviews)";

        textViewLocName.setText(currentLocationModel.getLocationName());
        imageViewBanner.setImageResource(currentLocationModel.getImageResourceID());
        textViewRatings.setText(String.valueOf(currentLocationModel.getRatings()));
        ratingBarStars.setRating((float)currentLocationModel.getRatings());
        textViewReviews.setText(stringReview);
        textViewDistance.setText(currentLocationModel.getDistanceMsg());
        textViewSchedule.setText(currentLocationModel.getSchedule());

        return convertView;
    }
}
