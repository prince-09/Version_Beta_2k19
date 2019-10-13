package com.example.beta.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.beta.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputLayout;

public class UserDetailsTemp extends AppCompatActivity {

    TextView proceed;
    TextInputLayout name, emailId, password;
    EditText name1, email, cnfpwd;
    TextView titleAccount;
    FloatingActionButton icon;
    TextInputLayout phoneNo, adminIdNo, confirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);

        proceed = findViewById(R.id.sign_up_button);
        name = findViewById(R.id.edit_text_name);
        emailId = findViewById(R.id.edit_text_email);
        password = findViewById(R.id.edit_text_password);
        name1 = findViewById(R.id.editTextName);
        email = findViewById(R.id.editTextEmail);
        cnfpwd = findViewById(R.id.editTextPwd);
        titleAccount = findViewById(R.id.title_account);
        icon = findViewById(R.id.background2);
        phoneNo = findViewById(R.id.edit_text_phone);
        adminIdNo = findViewById(R.id.edit_text_id);
        confirmPassword = findViewById(R.id.edit_text_password_confirm);

        proceed.setText("Next");
        titleAccount.setText("location");
        name.setHint("Enter the flood affected city");
        emailId.setHint("Pin Code");
        password.setHint("Country");
        icon.setBackgroundResource(R.drawable.icons8_user_location_100);
        phoneNo.setVisibility(View.INVISIBLE);
        adminIdNo.setVisibility(View.INVISIBLE);
        confirmPassword.setVisibility(View.GONE);
        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UserDetailsTemp.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
