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
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_location_list, container, false);

        ArrayList<LocationModel> arrayListOfLocation = new ArrayList<>();
        arrayListOfLocation.add(new LocationModel("Hirni Fall (Ranchi)",
                R.drawable.waterfall_hirni_01,5.0,50,
                "25 Kms from city mall", "24x7 Opened"));
        arrayListOfLocation.add(new LocationModel("Dassam Fall",
                R.drawable.waterfall_dassam_01,4.6,46,
                "49 Kms from main town", "24x7 Opened"));
        arrayListOfLocation.add(new LocationModel("Lodh Waterfall (Netarhat)",
                R.drawable.waterfall_lodh_01,4.8,48,
                "48 Kms from city Bus Stand", "24x7 Opened"));
        arrayListOfLocation.add(new LocationModel("Sita Fall",
                R.drawable.waterfall_sita_01,4.1,41,
                "41 Kms from Mohini Theatre", "24x7 Opened"));
        arrayListOfLocation.add(new LocationModel("Lawapani Waterfall",
                R.drawable.waterfall_lavapani_01,3.0,30,
                "30 Kms from city hall", "24x7 Opened"));
        arrayListOfLocation.add(new LocationModel("Hundru Fall (Ranchi)",
                R.drawable.waterfall_hundru_01,3.8,38,
                "38 Kms from Ranchi Town", "24x7 Opened"));
        arrayListOfLocation.add(new LocationModel("Ursi Waterfall (Giridih)",
                R.drawable.waterfall_usri_01,3.6,36,
                "36 Kms from Giridih bus stand", "24x7 Opened"));
        arrayListOfLocation.add(new LocationModel("Mirchaiya Fall (Latehar)",
                R.drawable.waterfall_mirchaiya_01,4.0,40,
                "40 Kms from Town bus stand", "24x7 Opened"));
        arrayListOfLocation.add(new LocationModel("Panch Ghat Fall",
                R.drawable.waterfall_panch_ghat_01,3.9,39,
                "39 Kms from city bus stand", "24x7 Opened"));

        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), arrayListOfLocation);

        ListView listView = rootView.findViewById(R.id.fragment_list_view);
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
