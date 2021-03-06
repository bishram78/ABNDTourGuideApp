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

public class DamsLakesFragment extends Fragment {

    public DamsLakesFragment() {
        /* Required empty public constructor. */
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_location_list, container, false);

        // Create an ArrayList instance of LocationModel.
        ArrayList<LocationModel> arrayListOfLocation = new ArrayList<>();

        // Add list of Location {@link LocationModel} object to the ArrayList.
        arrayListOfLocation.add(new LocationModel(getString(R.string.netarhat_dam),
                R.drawable.dam_lake_netarhat_01,4.3,112,getString(R.string.txt_open_all_day)));
        arrayListOfLocation.add(new LocationModel(getString(R.string.chandil_dam),
                R.drawable.dam_lake_chandil_01, 3.6, 250,getString(R.string.txt_open_all_day)));
        arrayListOfLocation.add(new LocationModel(getString(R.string.hatia_dam),
                R.drawable.dam_lake_hatia_01, 2.9, 80,getString(R.string.txt_open_all_day)));
        arrayListOfLocation.add(new LocationModel(getString(R.string.patratu_dam),
                R.drawable.dam_lake_patratu_01, 4.0, 377,getString(R.string.txt_open_all_day)));
        arrayListOfLocation.add(new LocationModel(getString(R.string.tilaiya_dam),
                R.drawable.dam_lake_tilaiya_01, 1.8, 27,getString(R.string.txt_open_all_day)));
        arrayListOfLocation.add(new LocationModel(getString(R.string.tenughat_dam),
                R.drawable.dam_lake_tenughat_01,2.6, 39,getString(R.string.txt_open_all_day)));
        arrayListOfLocation.add(new LocationModel(getString(R.string.massanjore_dam),
                R.drawable.dam_lake_massanjore_01,3.0, 44,getString(R.string.txt_open_all_day)));

        //Create and instance of {@LocationAdapter} that knows how to show list items in list view.
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), arrayListOfLocation);

        // Find the {@link ListView} View in the fragment_location_list.xml
        ListView listView = rootView.findViewById(R.id.fragment_list_view);

        // Set the custom adapter {@link LocationAdapter} to the list view.
        listView.setAdapter(locationAdapter);

        // Return the above created view to the activity where it is attached.
        // Here in this case to MainActivity.java
        return rootView;
    }
}
