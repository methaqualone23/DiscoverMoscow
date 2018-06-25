package com.example.stepanenko.discovermoscow;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
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

        places.add(new Place(R.drawable.bunker42, "Bunker-42", "Dr. Strangelove-esque tours inside a bunker under Moscow's streets once reserved for Stalin himself."));
        places.add(new Place(R.drawable.children, "Children are the Victims of Adult Vices", "Thirteen sculptures in central Moscow graphically depicting vices of the modern world."));
        places.add(new Place(R.drawable.moscow_city_lights, "Miniature Moscow", "Back in the tiny USSR."));
        places.add(new Place(R.drawable.melnikov, "Melnikov House", "House-studio of the architect Melnikov, a world-famous masterpiece of the Soviet avant-garde."));
        places.add(new Place(R.drawable.dominion, "Dominion Tower", "The Most Abstract Building in Moscow."));

        PlaceAdapter itemsAdapter = new PlaceAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        return rootView;
    }
}
