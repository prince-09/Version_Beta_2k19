package com.example.beta.Classes;


public class teams {

    private String textViewCode;
    private String text_view_no_of_members;
    private String text_view_no;


    public String getTextViewCode() {
        return textViewCode;
    }

    public void setTextViewCode(String textViewCode) {
        this.textViewCode = textViewCode;
    }


    public String getText_view_no_of_members() {
        return text_view_no_of_members;
    }

    public void setText_view_no_of_members(String text_view_no_of_members) {
        this.text_view_no_of_members = text_view_no_of_members;
    }

    public String getText_view_no() {
        return text_view_no;
    }

    public void setText_view_no(String text_view_no) {
        this.text_view_no = text_view_no;
    }

    public teams(String textViewCode, String text_view_level, String text_view_no_of_members) {

        this.textViewCode = textViewCode;
        this.text_view_no= text_view_no;
        this.text_view_no_of_members = text_view_no_of_members;
    }
}
