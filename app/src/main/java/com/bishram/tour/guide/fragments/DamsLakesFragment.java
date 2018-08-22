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
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_dams_lakes, container, false);

        ArrayList<LocationModel> arrayListOfLocation = new ArrayList<>();
        arrayListOfLocation.add(new LocationModel("Netarhat Dam (Latehar)",
                R.drawable.dam_lake_netarhat_01,4.3,112,
                "1.5-2 Kms from the Netarhat Bus Stand", "24 Hours Opened"));
        arrayListOfLocation.add(new LocationModel("Chandil Dam (Jamshedpur)",
                R.drawable.dam_lake_chandil_01, 3.6, 250,
                "22Kms North of Jamshedpur", "24 Hours Opened"));
        arrayListOfLocation.add(new LocationModel("Hatia Dam (Dhurwa)",
                R.drawable.dam_lake_hatia_01, 2.9, 80,
                "15 Kms from the city", "24 Hours Opened"));
        arrayListOfLocation.add(new LocationModel("Patratu Dam (Ranchi)",
                R.drawable.dam_lake_patratu_01, 4.0, 377,
                "35 Kms from the Ranchi", "24 Hours Opened"));
        arrayListOfLocation.add(new LocationModel("Tilaiya Dam (Ramgarh)",
                R.drawable.dam_lake_tilaiya_01, 1.8, 27,
                "14 Kms from Ramgarh Bus Stand", "24 Hours Opened"));
        arrayListOfLocation.add(new LocationModel("Tenughat Dam (Bokaro)",
                R.drawable.dam_lake_tenughat_01,2.6, 39,
                "75 Kms from Bokaro city", "24 Hours Opened"));
        arrayListOfLocation.add(new LocationModel("Massanjore Dam (Dumka)",
                R.drawable.dam_lake_massanjore_01,3.0, 44,
                "25 Kms from Dumka", "24 Hours Opened"));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), arrayListOfLocation);

        ListView listView = rootView.findViewById(R.id.fr_dl_list_view);
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
