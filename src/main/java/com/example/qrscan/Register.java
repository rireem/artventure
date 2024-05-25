package com.example.qrscan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {


    TextView haveaccount;
    Button reg;
    EditText user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registeration);
/*
        haveaccount = findViewById(R.id.haveAccount);
        haveaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Register.this, Log.class );
                startActivity(intent1);
            }
        });*/

        reg = findViewById(R.id.RegisterBtn);
        user = findViewById(R.id.username);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Register.this, MainActivity.class );
                startActivity(intent1);
            }
        });


        /*
    * <item
        android:id="home"
        android:icon="@drawable/home"
        android:title="home"
        android:iconTint="@color/blue">Home</item>
    <item
        android:id="scan"
        android:icon="@drawable/cam"
        android:title="scan"
        android:iconTint="@color/blue">Scan</item>
    <item
        android:id="profile"
        android:icon="@drawable/user"
        android:title="profile"
        android:iconTint="@color/blue">Profile</item>
    *
    *
    * */

    }}





