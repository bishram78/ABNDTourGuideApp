/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.bishram.tour.guide.adapters;

import android.annotation.SuppressLint;
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
        TextView textViewSchedule = convertView.findViewById(R.id.loc_mod_schedule);

        assert currentLocationModel != null;
        @SuppressLint("DefaultLocale") String stringReview = String.format("(%d %s)",
                currentLocationModel.getReviewPoints(), getContext().getString(R.string.txt_reviews));

        textViewLocName.setText(currentLocationModel.getLocationName());
        textViewLocName.setSelected(true);
        imageViewBanner.setImageResource(currentLocationModel.getImageResourceID());
        textViewRatings.setText(String.valueOf(currentLocationModel.getRatings()));
        ratingBarStars.setRating((float)currentLocationModel.getRatings());
        textViewReviews.setText(stringReview);
        textViewSchedule.setText(currentLocationModel.getSchedule());

        return convertView;
    }
}
