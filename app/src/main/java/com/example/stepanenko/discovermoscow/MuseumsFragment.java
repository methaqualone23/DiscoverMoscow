package com.example.stepanenko.discovermoscow;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumsFragment extends Fragment {

    public MuseumsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Place> places = new ArrayList<>();

        places.add(new Place(R.drawable.museum_games, getString(R.string.museums_games_name), getString(R.string.museums_games_description)));
        places.add(new Place(R.drawable.lenin, getString(R.string.museums_lenin_name), getString(R.string.museums_lenin_description)));
        places.add(new Place(R.drawable.sovietcosmonaut, getString(R.string.museums_sovietcosmonaut_name), getString(R.string.museums_sovietcosmonaut_description)));
        places.add(new Place(R.drawable.railway, getString(R.string.museums_railway_name), getString(R.string.museums_railway_description)));
        places.add(new Place(R.drawable.bulgakov, getString(R.string.museums_bulgakov_name), getString(R.string.museums_bulgakov_description)));
        places.add(new Place(R.drawable.animation, getString(R.string.museums_animation_name), getString(R.string.museums_animation_description)));

        PlaceAdapter itemsAdapter = new PlaceAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        return rootView;
    }
}
