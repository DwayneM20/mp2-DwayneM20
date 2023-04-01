package com.example.scorecount;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;


public class SecondActivityy extends AppCompatActivity {
    private TextView tv_winner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activityy);
        tv_winner = findViewById(R.id.winner_text);

        Intent intent = getIntent();
        int homeCounter = intent.getIntExtra(MainActivity.EXTRA_HOME,0);
        int awayCounter = intent.getIntExtra(MainActivity.EXTRA_AWAY,0);
        String winner = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        int scoreDifference = (Math.max(homeCounter,awayCounter)) - Math.min(homeCounter,awayCounter);

        tv_winner.setText(winner + " won by " + scoreDifference);
    }

}