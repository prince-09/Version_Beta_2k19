package com.example.beta.Activities;

import android.content.Intent;
import android.content.SyncStatusObserver;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.beta.Adapters.RecyclerAdapterLocalities;
import com.example.beta.Classes.localities;
import com.example.beta.R;
import android.location.Address;
import android.location.Geocoder;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String arr[]= {"BHOPAL","INDORE","DEWAS","KHARGONE","GWALIOR","JABALPUR","SATNA","RATLAM" };
    ImageView googleMapButton;
    private RecyclerView recyclerViewRecords;
    private List<localities> localitiesList = new ArrayList<>();
    private com.example.beta.Adapters.RecyclerAdapterLocalities RecyclerAdapterLocalities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewRecords = (RecyclerView) findViewById(R.id.recyclerViewRecords);
        RecyclerAdapterLocalities = new RecyclerAdapterLocalities(localitiesList,this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewRecords.setLayoutManager(mLayoutManager);
        recyclerViewRecords.setItemAnimator(new DefaultItemAnimator());
        recyclerViewRecords.setAdapter(RecyclerAdapterLocalities);


        try {
            geoLocate();
        }
        catch (Exception E)
        {
            System.out.println(E);
        }
        prepareGroupData();



        googleMapButton = findViewById(R.id.imageView);
        googleMapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , MapsActivity.class);
                startActivity(intent);
            }
        });
    }
    double lat[] = new double[10];
    double lon[] = new double[10];

    public void geoLocate() throws IOException {


        Geocoder gc = new Geocoder(this);
            List<Address> add = gc.getFromLocationName(arr[0], 1);
            lat[0] = add.get(0).getLatitude();
            lon[0] = add.get(0).getLongitude();
            List<Address> add1 = gc.getFromLocationName(arr[1], 1);
            lat[1] = add1.get(0).getLatitude();
            lon[1] = add1.get(0).getLongitude();
            List<Address> add2 = gc.getFromLocationName(arr[2], 1);
            lat[2] = add2.get(0).getLatitude();
            lon[2] = add2.get(0).getLongitude();
            List<Address> add3 = gc.getFromLocationName(arr[3], 1);
            lat[3] = add3.get(0).getLatitude();
            lon[3] = add3.get(0).getLongitude();
            List<Address> add4 = gc.getFromLocationName(arr[4], 1);
            lat[4] = add4.get(0).getLatitude();
            lon[4] = add4.get(0).getLongitude();
    //        List<Address> add5 = gc.getFromLocationName(arr[5], 1);
    //        lat[5] = add5.get(0).getLatitude();
    //        lon[5] = add5.get(0).getLongitude();
    //        List<Address> add6 = gc.getFromLocationName(arr[6], 1);
    //        lat[6] = add6.get(0).getLatitude();
    //        lon[6] = add6.get(0).getLongitude();
    //        List<Address> add7 = gc.getFromLocationName(arr[7], 1);
    //        lat[7] = add7.get(0).getLatitude();
    //        lon[7] = add7.get(0).getLongitude();
    //        List<Address> add8 = gc.getFromLocationName(arr[8], 1);
    //        lat[8] = add8.get(0).getLatitude();
    //        lon[8] = add8.get(0).getLongitude();
    //        List<Address> add9 = gc.getFromLocationName(arr[9], 1);
    //        lat[9] = add9.get(0).getLatitude();
    //        lon[9] = add9.get(0).getLongitude();


    }

    private void prepareGroupData() {
        localities localities=new localities(arr[0],"Upper lake, van vihar, lower lake, Indira gandhi sangrahalaya " ,"HIGH" , lat[0], lon[0]);
        localitiesList.add(localities);
        localities=new localities(arr[1],"Rajwada palace, lal bagh palace, indore museum, hilltop hindu temple" ,"HIGH" ,  lat[1], lon[1]);
        localitiesList.add(localities);
        localities=new localities(arr[2],"Dewas mata mandir, maa chamunda tekri, sayaji gate" ,"LOW" ,  lat[2], lon[2]);
        localitiesList.add(localities);
        localities=new localities(arr[3],"Ahilyabai ghats, queen's fort, jaam gate, sahastra dhara" ,"LOW" ,  lat[3], lon[3]);
        localitiesList.add(localities);
        localities=new localities(arr[4],"Gwalior fort, jai vilas palace, sasbahu temple, man singh palace" ,"LOW" ,  lat[4], lon[4]);
        localitiesList.add(localities);

        RecyclerAdapterLocalities.notifyDataSetChanged();
    }

}








