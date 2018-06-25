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

        places.add(new Place(R.drawable.museum_games, "Museum of Soviet Arcade Games", "Immortal combat in a Moscow museum."));
        places.add(new Place(R.drawable.lenin, "Lenin's Mausoleum", "Embalmed remains of the leader of the Bolshevik Revolution."));
        places.add(new Place(R.drawable.sovietcosmonaut, "Memorial Museum of Cosmonautics", "Museum celebrating the achievements of the Soviet space program."));
        places.add(new Place(R.drawable.railway, "Museum of the Moscow Railway", "This Russian locomotive museum was once devoted just to Lenin's funeral before expanding to encompass Moscow's entire train history."));
        places.add(new Place(R.drawable.bulgakov, "Bulgakov Museum", "Visit a \"bad apartment\", where Woland gave his ball."));
        places.add(new Place(R.drawable.animation, "Museum of animation", "The magical world of animation."));

        PlaceAdapter itemsAdapter = new PlaceAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
        return rootView;
    }
}
