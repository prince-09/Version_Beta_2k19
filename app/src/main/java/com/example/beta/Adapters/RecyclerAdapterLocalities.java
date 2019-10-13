package com.example.beta.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.beta.Activities.AssignTasks;
import com.example.beta.Classes.localities;
import com.example.beta.R;

import java.util.List;


public class RecyclerAdapterLocalities extends RecyclerView.Adapter<RecyclerAdapterLocalities.ViewHolderLocalities> {
    public List<localities> localitiesList;
    Context context;


    public class ViewHolderLocalities extends RecyclerView.ViewHolder {
        public TextView textViewLocality;
        public TextView text_view_landmarks;
        public TextView text_view_level;
        public TextView latitude ;
        public TextView longitude ;




        public ViewHolderLocalities(@NonNull View itemView) {
            super(itemView);

            textViewLocality = itemView.findViewById(R.id.textViewLocality);
            text_view_landmarks=itemView.findViewById(R.id.text_view_landmarks);
            text_view_level = itemView.findViewById(R.id.text_view_level);
            latitude = itemView.findViewById(R.id.textViewLongLat);
            longitude = itemView.findViewById(R.id.textViewLongLon);
        }
    }
    public RecyclerAdapterLocalities(List<localities> localitiesList , Context context) {
        this.context = context;
        this.localitiesList = localitiesList;
    }
    @NonNull
    @Override
    public ViewHolderLocalities onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.areas_recycler_item,viewGroup,false);
        return new ViewHolderLocalities(view);
    }


    public localities setData(localities localities) {
        return localities;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderLocalities viewHolder, int i) {
        localities localities = localitiesList.get(i);
        viewHolder.textViewLocality.setText(localities.getTextViewLocality());
        viewHolder.text_view_landmarks.setText(localities.getText_view_landmarks());
        viewHolder.text_view_level.setText(localities. getText_view_level());
        viewHolder.latitude.setText(Double.toString(localities. getLatitude()));
        viewHolder.longitude.setText(Double.toString(localities. getLongitude()));

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,AssignTasks.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {

        return localitiesList.size();
    }

}

