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

public class WaterfallsFragment extends Fragment {

    public WaterfallsFragment() {
        /* Required empty public constructor. */
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_location_list, container, false);

        // Create an ArrayList instance of LocationModel.
        ArrayList<LocationModel> arrayListOfLocation = new ArrayList<>();

        // Add list of Location {@link LocationModel} object to the ArrayList.
        arrayListOfLocation.add(new LocationModel(getString(R.string.hirni_fall),
                R.drawable.waterfall_hirni_01,5.0,50,getString(R.string.open_24x7)));
        arrayListOfLocation.add(new LocationModel(getString(R.string.dassam_fall),
                R.drawable.waterfall_dassam_01,4.6,46,getString(R.string.open_24x7)));
        arrayListOfLocation.add(new LocationModel(getString(R.string.lodh_waterfall),
                R.drawable.waterfall_lodh_01,4.8,48,getString(R.string.open_24x7)));
        arrayListOfLocation.add(new LocationModel(getString(R.string.sita_fall),
                R.drawable.waterfall_sita_01,4.1,41,getString(R.string.open_24x7)));
        arrayListOfLocation.add(new LocationModel(getString(R.string.lavapani_waterfall),
                R.drawable.waterfall_lavapani_01,3.0,30,getString(R.string.open_24x7)));
        arrayListOfLocation.add(new LocationModel(getString(R.string.hundru_fall),
                R.drawable.waterfall_hundru_01,3.8,38,getString(R.string.open_24x7)));
        arrayListOfLocation.add(new LocationModel(getString(R.string.ursi_waterfall),
                R.drawable.waterfall_usri_01,3.6,36,getString(R.string.open_24x7)));
        arrayListOfLocation.add(new LocationModel(getString(R.string.mirchaiya_fall),
                R.drawable.waterfall_mirchaiya_01,4.0,40,getString(R.string.open_24x7)));
        arrayListOfLocation.add(new LocationModel(getString(R.string.panch_ghat_fall),
                R.drawable.waterfall_panch_ghat_01,3.9,39,getString(R.string.open_24x7)));

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
