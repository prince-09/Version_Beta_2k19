package com.example.beta.Classes;


public class localities {

    private String textViewLocality;
    private String text_view_landmarks;
    private String text_view_level;


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

    public localities(String textViewLocality, String text_view_landmarks, String text_view_level) {

        this.textViewLocality = textViewLocality;
        this.text_view_landmarks = text_view_landmarks;
        this.text_view_level = text_view_level;
    }
}
