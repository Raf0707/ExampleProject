package com.example.exampleproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.*;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {
    private Button next2;
    private Button prev2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        next2 = findViewById(R.id.button4);
        prev2 = findViewById(R.id.button5);

        next2.setOnClickListener(this);
        prev2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button5:
                Intent intent3 = new Intent(this, MainActivity2.class);
                startActivity(intent3);
                break;
        }
    }
}