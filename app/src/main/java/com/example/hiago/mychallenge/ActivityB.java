package com.example.hiago.mychallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class ActivityB extends AppCompatActivity {

    private TextView textRandom;
    private Button  buttonRandom;
    private Integer numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        final Random rand = new Random();
        textRandom = (TextView) findViewById(R.id.RandomText);
        buttonRandom = (Button) findViewById(R.id.RandomButton);

        numero = rand.nextInt();
        textRandom.setText("Activity B:" +numero);

        buttonRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityB.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}
