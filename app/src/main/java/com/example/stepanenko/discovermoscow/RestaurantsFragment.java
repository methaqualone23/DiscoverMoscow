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
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Place> places = new ArrayList<>();

        places.add(new Place(R.drawable.tsiferblat, "Tsiferblat", "Embodiment of saying 'Time is money': 2 rubles/minute."));
        places.add(new Place(R.drawable.tomeoutbar, "Time Out Bar", "One of the best cocktail bars in Moscow with an amazing panorama."));
        places.add(new Place(R.drawable.cheburek, "Cheburek cafe", "A Soviet-style pub, best to make local friends."));
        places.add(new Place(R.drawable.danilovskiy, "Danilovsky marketplace", "The former Soviet marketplace which was remade into a fancy farmer organic place."));
        places.add(new Place(R.drawable.maroseika, "Maroseika and Pokrovka drinking streets", "Located next to the Kitai-Gorod metro station, every door here is a bar (although not every house)."));

        PlaceAdapter itemsAdapter = new PlaceAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        return rootView;
    }

}
