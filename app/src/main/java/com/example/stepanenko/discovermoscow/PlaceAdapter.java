package com.example.stepanenko.discovermoscow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Context context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Place currentPlace = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.image);
        TextView nameTextView = convertView.findViewById(R.id.name);
        TextView descriptionTextView = convertView.findViewById(R.id.description);

        nameTextView.setText(currentPlace.getPlaceName());
        descriptionTextView.setText(currentPlace.getPlaceDescription());

        if (currentPlace.hasImage()) {
            imageView.setImageResource(currentPlace.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }
        return convertView;
    }
}