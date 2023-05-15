package com.example.multione;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class SPS extends AppCompatActivity {
    int count=0;
    int score=0;
    int min;
    int max;
    int value;
    int x,y,z;

    public void change_one (View view) {
        if (count < 3) {
            x = 1;
            ImageView iv = findViewById(R.id.imageView2);
            iv.setImageResource(R.drawable.stone);
            min = 1;
            count = count + 1;
            max = 4;

            Random random = new Random();

            value = random.nextInt(max - min) + min;
            if (value == 1) {
                y = 1;
                ImageView iiv = findViewById(R.id.imageView);
                iiv.setImageResource(R.drawable.stone);
            } else if (value == 2) {
                y = 2;
                ImageView iiv = findViewById(R.id.imageView);
                iiv.setImageResource(R.drawable.paper);
            } else {
                y = 0;
                ImageView iiv = findViewById(R.id.imageView);
                iiv.setImageResource(R.drawable.s);
            }

            if (x == y) {
                ImageView result = findViewById(R.id.imageView1);
                result.setImageResource(R.drawable.tryss);

                TextView text=(TextView) findViewById(R.id.textviewsps);
                text.setText("TIE GAME");
                //Toast.makeText(this, "TIE GAME", Toast.LENGTH_SHORT).show();
                score=score+5;

            } else if (x < y) {
                ImageView result = findViewById(R.id.imageView1);
                result.setImageResource(R.drawable.lose);
                //Toast.makeText(this, "COMPUTER WIN THE GAME", Toast.LENGTH_SHORT).show();
                TextView text=(TextView) findViewById(R.id.textviewsps);
                text.setText("COMPUTER WIN THE GAME");
                score=score-10;
            } else {
                ImageView result = findViewById(R.id.imageView1);
                result.setImageResource(R.drawable.win);
                //Toast.makeText(this, "HUMAN WIN THE GAME", Toast.LENGTH_SHORT).show();
                TextView text=(TextView) findViewById(R.id.textviewsps);
                text.setText("HUMAN WIN THE GAME");
                score=score+10;
            }

        }
        else {
            //Toast.makeText(this, "YOUR SCORE :- "+score, Toast.LENGTH_SHORT).show();
            //Toast.makeText(this, " GAME OVER", Toast.LENGTH_LONG).show();
            /* ImageView gameover = findViewById(R.id.imageView1);
               gameover.setImageResource(R.drawable.gameover);*/
            TextView text=(TextView) findViewById(R.id.textviewsps);
            text.setText(" GAME OVER");
        }
        if (count==3)
        {
            /*Toast.makeText(this, "YOUR SCORE :-"+score, Toast.LENGTH_LONG).show();
            Toast.makeText(this, "GAME OVER", Toast.LENGTH_SHORT).show();*/
            TextView text=(TextView) findViewById(R.id.textviewsps);
            text.setText(" YOUR SCORE :  "+score+"  GAME OVER");
            ImageView gameover = findViewById(R.id.imageView1);
            gameover.setImageResource(R.drawable.gameover);
        }
    }
    public void change_two (View view) {
        if (count < 3) {
            x = 1;
            ImageView iv = findViewById(R.id.imageView2);
            iv.setImageResource(R.drawable.paper);
            count = count + 1;
            min = 1;

            max = 4;

            Random random = new Random();

            value = random.nextInt(max - min) + min;
            if (value == 1) {
                y = 0;
                ImageView iiiv = findViewById(R.id.imageView);
                iiiv.setImageResource(R.drawable.stone);
            } else if (value == 2) {
                y = 1;
                ImageView iiiv = findViewById(R.id.imageView);
                iiiv.setImageResource(R.drawable.paper);
            } else {
                y = 2;
                ImageView iiiv = findViewById(R.id.imageView);
                iiiv.setImageResource(R.drawable.s);
            }

            if (x == y) {
                ImageView result = findViewById(R.id.imageView1);
                result.setImageResource(R.drawable.tryss);
                Toast.makeText(this, "TIE GAME", Toast.LENGTH_SHORT).show();
                score=score+5;
            } else if (x < y) {
                ImageView result = findViewById(R.id.imageView1);
                result.setImageResource(R.drawable.lose);
                Toast.makeText(this, "COMPUTER WIN THE GAME", Toast.LENGTH_SHORT).show();
                score=score-10;
            } else {
                ImageView result = findViewById(R.id.imageView1);
                result.setImageResource(R.drawable.win);
                Toast.makeText(this, "HUMAN WIN THE GAME", Toast.LENGTH_SHORT).show();
                score=score+10;
            }

        }
        else {
            //Toast.makeText(this, "YOUR SCORE :- "+score, Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "GAME OVER", Toast.LENGTH_SHORT).show();
               /* ImageView gameover = findViewById(R.id.imageView1);
                gameover.setImageResource(R.drawable.gameover);*/
        }
        if (count==3)
        {
            Toast.makeText(this, "YOUR SCORE :-"+score, Toast.LENGTH_LONG).show();
            Toast.makeText(this, "GAME OVER", Toast.LENGTH_SHORT).show();
            ImageView gameover = findViewById(R.id.imageView1);
            gameover.setImageResource(R.drawable.gameover);
        }
    }

    public void change_three (View view) {
        if (count < 3) {


            x = 1;
            ImageView iv = findViewById(R.id.imageView2);
            iv.setImageResource(R.drawable.s);
            count = count + 1;
            min = 1;

            max = 4;

            Random random = new Random();

            value = random.nextInt(max - min) + min;
            if (value == 1) {
                y = 2;
                ImageView iiiiv = findViewById(R.id.imageView);
                iiiiv.setImageResource(R.drawable.stone);
            } else if (value == 2) {
                y = 0;
                ImageView iiiiv = findViewById(R.id.imageView);
                iiiiv.setImageResource(R.drawable.paper);
            } else {
                y = 1;
                ImageView iiiiv = findViewById(R.id.imageView);
                iiiiv.setImageResource(R.drawable.s);
            }

            if (x == y) {
                ImageView result = findViewById(R.id.imageView1);
                result.setImageResource(R.drawable.tryss);
                Toast.makeText(this, "TIE GAME", Toast.LENGTH_SHORT).show();
                score=score+5;
            } else if (x < y) {
                ImageView result = findViewById(R.id.imageView1);
                result.setImageResource(R.drawable.lose);
                Toast.makeText(this, "COMPUTER WIN THE GAME", Toast.LENGTH_SHORT).show();
                score=score-10;
            } else {
                ImageView result = findViewById(R.id.imageView1);
                result.setImageResource(R.drawable.win);
                Toast.makeText(this, "HUMAN WIN GAME", Toast.LENGTH_SHORT).show();
                score=score+10;
            }

        }
        else {
            //Toast.makeText(this, "YOUR SCORE :-"+score, Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "GAME OVER", Toast.LENGTH_SHORT).show();
                /*ImageView gameover = findViewById(R.id.imageView1);
                gameover.setImageResource(R.drawable.gameover);*/
        }
        if (count==3)
        {
            //Toast.makeText(this, "YOUR SCORE :-  "+score, Toast.LENGTH_LONG).show();
           // Toast.makeText(this, "GAME OVER", Toast.LENGTH_SHORT).show();
            ImageView gameover = findViewById(R.id.imageView1);
            gameover.setImageResource(R.drawable.gameover);
        }
    }

    public void reset(View view)
    {
        count=0;
        score=0;
        ImageView fuzail = findViewById(R.id.imageView);
        fuzail.setImageResource(R.drawable.computer);
        ImageView puru = findViewById(R.id.imageView1);
        puru.setImageResource(R.drawable.vs);
        ImageView sajal = findViewById(R.id.imageView2);
        sajal.setImageResource(R.drawable.human);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sps);
        Button home = findViewById(R.id.button2);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SPS.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}