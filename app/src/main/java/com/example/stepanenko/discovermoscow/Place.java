package com.example.stepanenko.discovermoscow;

public class Place {
    private String placeName;
    private String placeDescription;
    private int imageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

    public String getPlaceDescription() {
        return placeDescription;
    }

    public String getPlaceName() {
        return placeName;
    }

    public Place(int imageResourceId, String placeNameBase, String placeDescriptionBase) {
        this.imageResourceId = imageResourceId;
        placeDescription = placeDescriptionBase;
        placeName = placeNameBase;
    }
}