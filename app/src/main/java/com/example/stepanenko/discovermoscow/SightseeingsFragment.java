package com.example.stepanenko.discovermoscow;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class SightseeingsFragment extends Fragment {

    public SightseeingsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Place> places = new ArrayList<>();

        places.add(new Place(R.drawable.bunker42, getString(R.string.places_bunker_name), getString(R.string.places_bunker_description)));
        places.add(new Place(R.drawable.children, getString(R.string.places_chilren_name), getString(R.string.places_children_description)));
        places.add(new Place(R.drawable.moscow_city_lights, getString(R.string.places_miniature_name), getString(R.string.places_miniature_description)));
        places.add(new Place(R.drawable.melnikov, getString(R.string.places_melnikov_name), getString(R.string.places_melnikov_description)));
        places.add(new Place(R.drawable.dominion, getString(R.string.places_dominion_name), getString(R.string.places_dominion_description)));

        PlaceAdapter itemsAdapter = new PlaceAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        return rootView;
    }
}
