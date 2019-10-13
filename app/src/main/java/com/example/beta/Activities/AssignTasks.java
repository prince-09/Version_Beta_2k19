package com.example.beta.Activities;


import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.beta.Adapters.RecyclerAdapterTeams;
import com.example.beta.Classes.teams;
import com.example.beta.R;

import java.util.ArrayList;
import java.util.List;

public class AssignTasks extends AppCompatActivity {
    ImageView googleMapButton;
    private RecyclerView recyclerViewRecords;
    private List<teams> teamsList = new ArrayList<>();
    private com.example.beta.Adapters.RecyclerAdapterTeams RecyclerAdapterTeams;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewRecords = findViewById(R.id.recyclerViewRecords);
        RecyclerAdapterTeams = new RecyclerAdapterTeams(teamsList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewRecords.setLayoutManager(mLayoutManager);
        recyclerViewRecords.setItemAnimator(new DefaultItemAnimator());
        recyclerViewRecords.setAdapter(RecyclerAdapterTeams);

        googleMapButton = findViewById(R.id.imageView);
        googleMapButton.setVisibility(View.INVISIBLE);

        prepareGroupData();
    }

    private void prepareGroupData() {
        teams teams=new teams(  "Team Code:"+1123224," 5 " ,"Number of Members:"+70);
        teamsList.add(teams);
        teams=new teams( "Team Code:"+1123234," 8 " ,"Number of Members:"+100);
        teamsList.add(teams); teams=new teams( "Team Code:"+3442334," 55 " ,"Number of Members:"+334);
        teamsList.add(teams); teams=new teams( "Team Code:"+2342443," 54 " ,"Number of Members:"+344);
        teamsList.add(teams); teams=new teams( "Team Code:"+3432433," 52 " ,"Number of Members:"+112);
        teamsList.add(teams); teams=new teams( "Team Code:"+3453455," 95 " ,"Number of Members:"+728);
        teamsList.add(teams); teams=new teams( "Team Code:"+3453255," 85 " ,"Number of Members:"+165);
        teamsList.add(teams); teams=new teams( "Team Code:"+7868687," 23 " ,"Number of Members:"+735);
        teamsList.add(teams); teams=new teams( "Team Code:"+6876867," 34 " ,"Number of Members:"+332);
        teamsList.add(teams); teams=new teams( "Team Code:"+6787687," 44 " ,"Number of Members:"+231);
        teamsList.add(teams); teams=new teams( "Team Code:"+6765777," 34 " ,"Number of Members:"+229);
        teamsList.add(teams); teams=new teams( "Team Code:"+4654665," 34 " ,"Number of Members:"+332);
        teamsList.add(teams); teams=new teams( "Team Code:"+5756776," 37 " ,"Number of Members:"+223);
        teamsList.add(teams); teams=new teams( "Team Code:"+5756789," 58 " ,"Number of Members:"+718);
        teamsList.add(teams);




        RecyclerAdapterTeams.notifyDataSetChanged();
    }
}