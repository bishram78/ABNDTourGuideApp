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

        // Create a list of Location {@link LocationModel}.
        ArrayList<LocationModel> locationArrayList = new ArrayList<>();

        //Add list of location to the created ArrayList of location.
        locationArrayList.add(new LocationModel("Birsa Deer Park, Kalamati",
                R.drawable.waterfall_panch_ghat_01,2.3,56,
                "23 Kms from capital city","Opens at 10:30AM"));
        locationArrayList.add(new LocationModel("Sunrise Point, Netarhat",
                R.drawable.waterfall_panch_ghat_01,2.3,56,
                "156 Kms West of Ranchi","Opens at 10:30AM"));
        locationArrayList.add(new LocationModel("Magnolia Sunset Point, Netarhat",
                R.drawable.waterfall_panch_ghat_01,2.3,56,
                "10 Kms from the town's main bus stand","Opens at 10:30AM"));
        locationArrayList.add(new LocationModel("Jubilee Park, Jamshedpur",
                R.drawable.waterfall_panch_ghat_01,2.3,56,
                "136 Kms from Ranchi District","Opens at 10:30AM"));
        locationArrayList.add(new LocationModel("Tagore Hill, Morhabadi",
                R.drawable.waterfall_panch_ghat_01,2.3,56,
                "7 Kms from the railway station","Opens at 10:30AM"));
        locationArrayList.add(new LocationModel("Rock Garden, Kanke",
                R.drawable.waterfall_panch_ghat_01,2.3,56,
                "8 Kms from the railway station","Opens at 10:30AM"));
        //Create and instance of {@LocationAdapter} that knows how to show list items in list view.
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locationArrayList);

        // Find the {@link ListView} View in the fragment_location_list.xml
        ListView listViewZooParks = rootView.findViewById(R.id.fragment_list_view);

        // Set the custom adapter {@link LocationAdapter} to the list view.
        listViewZooParks.setAdapter(locationAdapter);
        return rootView;
    }
}
