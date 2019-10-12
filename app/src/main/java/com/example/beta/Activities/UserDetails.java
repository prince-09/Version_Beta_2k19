package com.example.beta.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.beta.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputLayout;

public class UserDetails extends AppCompatActivity {
    TextView proceed;
    TextView titleAccount;
    FloatingActionButton icon;
    TextInputLayout phoneNo , adminIdNo , confirmPassword  , name , emailId , password;
    int a = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);

        proceed = findViewById(R.id.sign_up_button);
        titleAccount = findViewById(R.id.title_account);
        icon = findViewById(R.id.background2);
        phoneNo = findViewById(R.id.edit_text_phone);
        adminIdNo = findViewById(R.id.edit_text_id);
        confirmPassword = findViewById(R.id.edit_text_password_confirm);
        name = findViewById(R.id.edit_text_name);
        emailId = findViewById(R.id.edit_text_email);
        password = findViewById(R.id.edit_text_password);


        if(a==1)
        {
            proceed.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(UserDetails.this , MainActivity.class);
                    startActivity(intent);
                }
            });

        }
        else {
            proceed.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    a=1;
                    titleAccount.setText("location");
                    name.setHint("Enter the flood affected city");
                    emailId.setHint("Pin Code");
                    password.setHint("Country");
                    icon.setBackgroundResource(R.drawable.icons8_user_location_100);
                    phoneNo.setVisibility(View.INVISIBLE);
                    adminIdNo.setVisibility(View.INVISIBLE);
                    confirmPassword.setVisibility(View.GONE);
                }
            });


        }


    }
}
