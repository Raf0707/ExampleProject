package com.example.exampleproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.*;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    private Button previous;
    private Button next1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        previous = findViewById(R.id.button2);
        previous.setOnClickListener(this);

        next1 = findViewById(R.id.button3);
        next1.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button2:
                Intent intent1 = new Intent(this, MainActivity.class);
                startActivity(intent1);
                break;

            case R.id.button3:
                Intent intent2 = new Intent(this, MainActivity3.class);
                startActivity(intent2);
                break;
        }

    }
}