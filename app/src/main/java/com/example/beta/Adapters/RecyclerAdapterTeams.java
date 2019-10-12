package com.example.beta.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.beta.Classes.teams;
import com.example.beta.Classes.teams;
import com.example.beta.R;

import java.util.List;


public class RecyclerAdapterTeams extends RecyclerView.Adapter<RecyclerAdapterTeams.ViewHolderTeams> {
    public List<teams> teamsList;


    public class ViewHolderTeams extends RecyclerView.ViewHolder {
        public TextView textViewCode;
        public TextView text_view_no_of_members;
        public TextView text_view_no;


        public ViewHolderTeams(@NonNull View itemView) {
            super(itemView);

            textViewCode = itemView.findViewById(R.id.textViewCode);
            text_view_no_of_members=itemView.findViewById(R.id.text_view_no_of_members);
            text_view_no = itemView.findViewById(R.id.text_view_no);
        }
    }
    public RecyclerAdapterTeams(List<teams> teamsList) {
        this.teamsList = teamsList;
    }
    @NonNull
    @Override
    public ViewHolderTeams onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.team_recycler_item,viewGroup,false);
        return new ViewHolderTeams(view);
    }


    public teams setData(teams teams) {
        return teams;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderTeams viewHolder, int i) {
        teams teams = teamsList.get(i);
        viewHolder. textViewCode.setText(teams.getTextViewCode());
        viewHolder. text_view_no_of_members.setText(teams.getText_view_no_of_members());
        viewHolder. text_view_no.setText(teams. getText_view_no());


    }

    @Override
    public int getItemCount() {

        return teamsList.size();
    }

}

