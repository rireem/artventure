package com.example.qrscan;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import com.example.qrscan.databinding.ActivityMainBinding;
import com.example.qrscan.databinding.NavigationbarBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarMenuView;

public class Main extends AppCompatActivity {

    private int navMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding;
        BottomNavigationView navView = findViewById(R.id.bottomNavigationView);

        Item item = null;
        MenuItem item1 = null;



        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        /*

        navView = findViewById(R.id.bottomNavigationView);
        binding.navView.setOnItemSelectedListner(Item -> {
                    switch (item.getItemId()) {
                        case R.id.scan:
                            startActivity(0);
                        case R.id.scan:
                            startActivity(1);
                        case R.id.profile:
                            startActivity(2);


                            break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + item.getItemId());
                    }
                    return true;
                }
        );

    }

    private void startActivity(int index) {

        if(index == 0) {
            Intent intent = new Intent(this, Log.class);
            startActivity(intent);
        }
        if(index == 1) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }


         */
    }
    }


