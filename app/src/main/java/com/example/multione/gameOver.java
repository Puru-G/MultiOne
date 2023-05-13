package com.example.multione;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class gameOver extends AppCompatActivity {

    private Button startGameAgain;
    private TextView displayScore;
    private String score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        score = getIntent().getExtras().get("score").toString();

        startGameAgain = (Button) findViewById(R.id.play_again_btn);

        displayScore = (TextView) findViewById(R.id.textView_score);


        startGameAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(gameOver.this, MainActivity.class);
                startActivity(mainIntent);
            }
        });

        displayScore.setText("Score : " + score);
    }
}
