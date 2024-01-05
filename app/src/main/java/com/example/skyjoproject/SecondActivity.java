package com.example.skyjoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    private Button button_secondActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        this.button_secondActivity = findViewById(R.id.button_secondActivity);
        button_secondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open_MainActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(open_MainActivity);
                finish();
            }
        });

    }
}