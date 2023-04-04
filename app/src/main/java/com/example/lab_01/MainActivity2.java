package com.example.lab_01;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = getIntent();

        TextView yourName = findViewById(R.id.yourName);
        TextView yourAge = findViewById(R.id.yourAge);
        TextView yourGender = findViewById(R.id.yourGender);
        yourName.setText(i.getStringExtra("isName"));
        yourAge.setText(i.getStringExtra("isAge"));
        yourGender.setText(i.getStringExtra("isGender"));
    }

    public void changeBackground(View view){
        LinearLayout layout = findViewById(R.id.background);
        Random rand = new Random();
        int color = Color.argb(255, rand.nextInt(256), rand.nextInt(256),rand.nextInt(256));
        layout.setBackgroundColor(color);
    }
    public void go(View view){
        Intent i = new Intent(MainActivity2.this, MainActivity3.class);
        startActivity(i);
    }
}
