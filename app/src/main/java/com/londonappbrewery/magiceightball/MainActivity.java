package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button predictButton;
        predictButton = (Button) findViewById(R.id.predictButton);

        final ImageView magicBall;
        magicBall = (ImageView) findViewById(R.id.magicBall);

        final int[] magicAnswer ={
                R.drawable.askmelater,
                R.drawable.ihavenoidea,
                R.drawable.no,
                R.drawable.theanswerisyes,
                R.drawable.yes
        };

        predictButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumberGenerator = new Random();

                int randomNumber = randomNumberGenerator.nextInt(5);
                magicBall.setImageResource(magicAnswer[randomNumber]);
            }
        });





    }
}
