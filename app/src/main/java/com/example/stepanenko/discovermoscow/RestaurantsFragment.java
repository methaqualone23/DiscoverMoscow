package com.example.stepanenko.discovermoscow;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Place> places = new ArrayList<>();

        places.add(new Place(R.drawable.tsiferblat, getString(R.string.restaurants_tsiferblat_name), getString(R.string.restaurants_tsiferblat_description)));
        places.add(new Place(R.drawable.tomeoutbar, getString(R.string.restaurants_timeoutbar_name), getString(R.string.restaurants_timeoutbat_description)));
        places.add(new Place(R.drawable.cheburek, getString(R.string.restaurants_cheburek_name), getString(R.string.restaurants_cheburek_description)));
        places.add(new Place(R.drawable.danilovskiy, getString(R.string.restaurants_danilovskiy_name), getString(R.string.restaurants_danilovskiy_description)));
        places.add(new Place(R.drawable.maroseika, getString(R.string.restaurants_maroseika_name), getString(R.string.restaurants_maroseika_description)));

        PlaceAdapter itemsAdapter = new PlaceAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        return rootView;
    }
}
