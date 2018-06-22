package com.example.stepanenko.discovermoscow;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ParksFragment extends Fragment {

    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Place> places = new ArrayList<>();

        places.add(new Place(R.drawable.izmailovo, "Izmailovo Kremlin", "Moscow's other, lesser known kremlin is a fairytale-like cultural complex modeled after Old Russia."));
        places.add(new Place(R.drawable.golosov, "Golosov Ravine", "Legends of time travel and magical woodland creatures bolster the natural charm of this verdant sanctuary in the midst of Moscow."));
        places.add(new Place(R.drawable.yard, "Old English Yard", "The \"Mystery and Company of Merchant Adventurers\" - an Elizabethan era hangout in Moscow."));
/*        places.add(new Place(R.drawable, "", ""));*/

        PlaceAdapter itemsAdapter = new PlaceAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        return rootView;
    }

}
