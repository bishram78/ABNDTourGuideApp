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
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.bishram.tour.guide.R;
import com.bishram.tour.guide.adapters.LocationAdapter;
import com.bishram.tour.guide.models.LocationModel;

import java.util.ArrayList;

public class ZooAndParksFragment extends Fragment {
    public ZooAndParksFragment() {
        /* Required empty public constructor. */
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState) {
        // Inflate the layout for this fragment.
        View rootView = inflater.inflate(R.layout.fragment_location_list, viewGroup, false);

        // Create Create an ArrayList instance of LocationModel {@link LocationModel}.
        ArrayList<LocationModel> locationArrayList = new ArrayList<>();

        // Add list of Location {@link LocationModel} object to the ArrayList.
        locationArrayList.add(new LocationModel(getString(R.string.birsa_deer_park),
                R.drawable.zoo_park_birsa_deer_01,2.3,56,getString(R.string.open_1030am)));
        locationArrayList.add(new LocationModel(getString(R.string.jubilee_park),
                R.drawable.zoo_park_jubilee,2.3,56,getString(R.string.open_1030am)));
        locationArrayList.add(new LocationModel(getString(R.string.rock_garden),
                R.drawable.zoo_park_rock_garden,2.3,56,getString(R.string.open_1030am)));

        //Create and instance of {@LocationAdapter} that knows how to show list items in list view.
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locationArrayList);

        // Find the {@link ListView} View in the fragment_location_list.xml
        ListView listViewZooParks = rootView.findViewById(R.id.fragment_list_view);

        // Set the custom adapter {@link LocationAdapter} to the list view.
        listViewZooParks.setAdapter(locationAdapter);

        // Return the above created view to the activity where it is attached.
        // Here in this case to MainActivity.java
        return rootView;
    }
}
