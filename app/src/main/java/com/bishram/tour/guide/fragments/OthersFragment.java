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

package com.bishram.tour.guide.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.bishram.tour.guide.R;
import com.bishram.tour.guide.adapters.LocationAdapter;
import com.bishram.tour.guide.models.LocationModel;

import java.util.ArrayList;

public class OthersFragment extends Fragment {

    public OthersFragment() {
        /* Required empty public constructor. */
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_location_list, container, false);

        // Create an ArrayList instance of LocationModel.
        ArrayList<LocationModel> locationModelArrayList = new ArrayList<>();

        // Add list of Location {@link LocationModel} object to the ArrayList.
        locationModelArrayList.add(new LocationModel(getString(R.string.deuridih_rural),
                R.drawable.others_deuridih_rural_01,4.2,465,getString(R.string.open_day_time)));
        locationModelArrayList.add(new LocationModel(getString(R.string.sunrise_point),
                R.drawable.others_sunrise_point_01,2.3,56,getString(R.string.open_530pm)));
        locationModelArrayList.add(new LocationModel(getString(R.string.mccluskieganj),
                R.drawable.others_mccluskieganj_01,4.2,465," "));
        locationModelArrayList.add(new LocationModel(getString(R.string.rikhia_ashram),
                R.drawable.others_rikhia_yoga_ashram_01,4.2,465,getString(R.string.open_500am)));
        locationModelArrayList.add(new LocationModel(getString(R.string.tagore_hill),
                R.drawable.others_tagore_hill_01,2.3,56,getString(R.string.open_1030am)));
        locationModelArrayList.add(new LocationModel(getString(R.string.palamu_fort),
                R.drawable.others_palamu_fort_01,4.2,465," "));
        locationModelArrayList.add(new LocationModel(getString(R.string.water_sports),
                R.drawable.others_water_sport_01,4.2,465,getString(R.string.open_400pm)));

        //Create and instance of {@LocationAdapter} that knows how to show list items in list view.
        LocationAdapter locationAdapterOthers = new LocationAdapter(getActivity(), locationModelArrayList);

        // Find the {@link ListView} View in the fragment_location_list.xml
        ListView listViewOthers = rootView.findViewById(R.id.fragment_list_view);

        // Set the custom adapter {@link LocationAdapter} to the list view.
        listViewOthers.setAdapter(locationAdapterOthers);

        // Return the above created view to the activity where it is attached.
        // Here in this case to MainActivity.java
        return rootView;
    }
}
