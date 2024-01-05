package com.example.skyjoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button_mainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.button_mainActivity = findViewById(R.id.button_mainActivity);
        button_mainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open_secondActivity = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(open_secondActivity);
                finish();
            }
        });
    }
}