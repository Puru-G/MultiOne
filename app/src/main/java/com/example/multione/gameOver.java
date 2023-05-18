package com.example.multione;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class gameOver extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        String score = getIntent().getExtras().get("score").toString();


        TextView displayScore = (TextView) findViewById(R.id.textView_score);
        displayScore.setText("Score : " + score);

        Button startGameAgain = (Button) findViewById(R.id.play_again_btn);
        startGameAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(gameOver.this, FlappyFish.class);
                startActivity(i1);
            }
        });
        Button Home = (Button) findViewById(R.id.Home_button);
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(gameOver.this, MainActivity.class);
                startActivity(i2);
            }
        });

    }
}
