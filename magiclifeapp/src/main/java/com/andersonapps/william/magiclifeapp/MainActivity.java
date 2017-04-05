package com.andersonapps.william.magiclifeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView playeronelife;
    TextView playertwolife;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton playeroneminus = (ImageButton) findViewById(R.id.playeroneminus);
        ImageButton playeroneplus = (ImageButton) findViewById(R.id.playeroneplus);
        ImageButton playertwominus = (ImageButton) findViewById(R.id.playertwominus);
        ImageButton playertwoplus = (ImageButton) findViewById(R.id.playertwoplus);
        ImageButton playeroneminusfive = (ImageButton) findViewById(R.id.playeroneminusfive);
        ImageButton playeroneplusfive = (ImageButton) findViewById(R.id.playeroneplusfive);
        ImageButton playertwominusfive = (ImageButton) findViewById(R.id.playertwominusfive);
        ImageButton playertwoplusfive = (ImageButton) findViewById(R.id.playertwoplusfive);

        playeronelife = (TextView) findViewById(R.id.lifetext1);
        playertwolife = (TextView) findViewById(R.id.lifetext2);


        //Player One ImageButton Listeners

        playeroneminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playeronelife.setText(Integer.toString(Integer.parseInt(playeronelife.getText().toString())-1));
            }
        });
        playeroneplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playeronelife.setText(Integer.toString(Integer.parseInt(playeronelife.getText().toString())+1));
            }
        });

        playeroneminusfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playeronelife.setText(Integer.toString(Integer.parseInt(playeronelife.getText().toString())-5));
            }
        });
        playeroneplusfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playeronelife.setText(Integer.toString(Integer.parseInt(playeronelife.getText().toString())+5));
            }
        });



        //Player Two ImageButton Listeners

        playertwominus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playertwolife.setText(Integer.toString(Integer.parseInt(playertwolife.getText().toString())-1));
            }
        });
        playertwoplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playertwolife.setText(Integer.toString(Integer.parseInt(playertwolife.getText().toString())+1));
            }
        });
        playertwominusfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playertwolife.setText(Integer.toString(Integer.parseInt(playertwolife.getText().toString())-5));
            }
        });
        playertwoplusfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playertwolife.setText(Integer.toString(Integer.parseInt(playertwolife.getText().toString())+5));
            }
        });

    }
}
