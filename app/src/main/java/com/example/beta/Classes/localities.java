package com.example.beta.Classes;


public class localities {

    private String textViewLocality;
    private String text_view_landmarks;
    private String text_view_level;
    private double latitude , longitude ;

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getTextViewLocality() {
        return textViewLocality;
    }

    public void setTextViewLocality(String textViewCode) {
        this.textViewLocality = textViewLocality;
    }


    public String getText_view_landmarks() {
        return text_view_landmarks;
    }

    public void setText_view_landmarks(String text_view_landmarks) {
        this.text_view_landmarks = text_view_landmarks;
    }

    public String getText_view_level() {
        return text_view_level;
    }

    public void setText_view_level(String text_view_level) {
        this.text_view_level = text_view_level;
    }

    public localities(String textViewLocality, String text_view_landmarks, String text_view_level , double latitude , double longitude) {

        this.textViewLocality = textViewLocality;
        this.text_view_landmarks = text_view_landmarks;
        this.text_view_level = text_view_level;
        this.latitude = latitude ;
        this.longitude = longitude ;
    }
}
