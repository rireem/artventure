package com.example.qrscan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class displayExtraDescriptions extends AppCompatActivity {
/*
    Button back;
    TextView descriptionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.descriptions);

        back = findViewById(R.id.backBtn);
        descriptionTextView = findViewById(R.id.result_text);

        // Retrieve the index from the intent extras
        Intent intent = getIntent();
        int index = intent.getIntExtra("INDEX", 0);

        // Get the description based on the index
        String[] descriptions = getResources().getStringArray(R.array.descriptions);
        String description = descriptions[index];

        // Set the description text
        descriptionTextView.setText(description);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(displayExtraDescriptions.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }*/
}
