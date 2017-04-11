package com.andersonapps.william.magiclifeapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import static android.R.attr.width;
import static android.view.Gravity.CENTER_HORIZONTAL;
import static android.view.Gravity.CENTER_VERTICAL;
import static com.andersonapps.william.magiclifeapp.R.attr.height;

public class MainActivity extends AppCompatActivity {
    TextView playeronelife;
    TextView playertwolife;
    TextView playeronepoison;
    TextView playertwopoison;

    TextView playeronecommander;
    TextView playertwocommander;

//    LinearLayout commanderlayoutp1;
//    LinearLayout commanderlayoutp2;

    //game mode is for detecting lethal values. 1 is normal, 2 is commander and 3 is two headed giant
    int gameMode;
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
        ImageButton playeronepoisonbutton = (ImageButton) findViewById(R.id.playeronepoisonbutton);
        ImageButton playertwopoisonbutton = (ImageButton) findViewById(R.id.playertwopoisonbutton);
        ImageButton normalgame = (ImageButton) findViewById(R.id.normalgame);
        ImageButton commandergame = (ImageButton) findViewById(R.id.commandergame);
        ImageButton twoheadedgiantgame = (ImageButton) findViewById(R.id.twoheadedgiantgame);

        final int redColorValue = Color.RED;
        final int blackColorValue = Color.BLACK;
        final int greenColorValue = Color.GREEN;

        playeronelife = (TextView) findViewById(R.id.lifetext1);
        playertwolife = (TextView) findViewById(R.id.lifetext2);
        playeronepoison = (TextView) findViewById(R.id.playeronepoison);
        playertwopoison = (TextView) findViewById(R.id.playertwopoison);

        final ImageButton playeronecommanderbutton = new ImageButton(MainActivity.this);
        final ImageButton playertwocommanderbutton = new ImageButton(MainActivity.this);
        playeronecommander = new TextView(MainActivity.this);
        playertwocommander = new TextView(MainActivity.this);
        final LinearLayout commanderlayoutp1 = (LinearLayout) findViewById(R.id.commanderpoisonlayoutp1);
        final LinearLayout commanderlayoutp2 = (LinearLayout) findViewById(R.id.commanderpoisonlayoutp2);




        playeronecommanderbutton.setImageResource(R.drawable.commandericon);
        playeronecommanderbutton.setBackgroundColor(Color.TRANSPARENT);
        playertwocommanderbutton.setImageResource(R.drawable.commandericon);
        playertwocommanderbutton.setBackgroundColor(Color.TRANSPARENT);


        //textview
        playertwocommander.setText("0");
        playertwocommander.setGravity(Gravity.CENTER_HORIZONTAL);
        playertwocommander.setTextSize(50);
        playertwocommander.setTextColor(blackColorValue);

        playeronecommanderbutton.setRotation(180);
        playeronecommander.setRotation(180);
        playeronecommander.setText("0");
        playeronecommander.setGravity(Gravity.CENTER_HORIZONTAL);
        playeronecommander.setTextSize(50);
        playeronecommander.setTextColor(blackColorValue);





        //initialize to standard game
        gameMode = 1;

        //Player One ImageButton Listeners

        playeroneminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playeronelife.setText(Integer.toString(Integer.parseInt(playeronelife.getText().toString())-1));
                if (Integer.parseInt(playeronelife.getText().toString())<=0){
                    playeronelife.setTextColor(redColorValue);
                }
            }
        });
        playeroneplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playeronelife.setText(Integer.toString(Integer.parseInt(playeronelife.getText().toString())+1));
                if (Integer.parseInt(playeronelife.getText().toString())>0){
                    playeronelife.setTextColor(blackColorValue);
                }
            }
        });

        playeroneminusfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playeronelife.setText(Integer.toString(Integer.parseInt(playeronelife.getText().toString())-5));
                if (Integer.parseInt(playeronelife.getText().toString())<=0){
                    playeronelife.setTextColor(redColorValue);
                }
            }
        });
        playeroneplusfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playeronelife.setText(Integer.toString(Integer.parseInt(playeronelife.getText().toString())+5));
                if (Integer.parseInt(playeronelife.getText().toString())>0){
                    playeronelife.setTextColor(blackColorValue);
                }
            }
        });
        playeronepoisonbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playeronepoison.setText(Integer.toString(Integer.parseInt(playeronepoison.getText().toString())+1));
                if (Integer.parseInt(playeronepoison.getText().toString())>=10 && (gameMode == 1 || gameMode == 2)){

                    playeronepoison.setTextColor(greenColorValue);
                }
                else if (Integer.parseInt(playeronepoison.getText().toString())>=15 &&  gameMode == 3)
                {
                    playeronepoison.setTextColor(greenColorValue);
                }
            }
        });
        playeronepoisonbutton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                playeronepoison.setText("0");
                playeronepoison.setTextColor(blackColorValue);
                return true;
            }
        });
        playeronecommanderbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playeronecommander.setText(Integer.toString(Integer.parseInt(playeronecommander.getText().toString())+1));
                if (Integer.parseInt(playeronecommander.getText().toString())>=21){
                    playeronecommander.setTextColor(redColorValue);
                }
            }
        });
        playeronecommanderbutton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                playeronecommander.setText("0");
                playeronecommander.setTextColor(blackColorValue);
                return true;
            }
        });

        playeronelife.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (gameMode==1)
                {
                    playeronelife.setText("20");
                }
                else if(gameMode==2)
                {
                    playeronelife.setText("40");
                }
                else
                {
                    playeronelife.setText("30");
                }
                return true;
            }
        });



        //Player Two ImageButton Listeners

        playertwominus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playertwolife.setText(Integer.toString(Integer.parseInt(playertwolife.getText().toString())-1));
                if (Integer.parseInt(playertwolife.getText().toString())<=0){
                    playertwolife.setTextColor(redColorValue);
                }
            }
        });
        playertwoplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playertwolife.setText(Integer.toString(Integer.parseInt(playertwolife.getText().toString())+1));
                if (Integer.parseInt(playertwolife.getText().toString())>0){
                    playertwolife.setTextColor(blackColorValue);
                }
            }
        });
        playertwominusfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playertwolife.setText(Integer.toString(Integer.parseInt(playertwolife.getText().toString())-5));
                if (Integer.parseInt(playertwolife.getText().toString())<=0){
                    playertwolife.setTextColor(redColorValue);
                }
            }
        });
        playertwoplusfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playertwolife.setText(Integer.toString(Integer.parseInt(playertwolife.getText().toString())+5));
                if (Integer.parseInt(playertwolife.getText().toString())>0){
                    playertwolife.setTextColor(blackColorValue);
                }
            }
        });
        playertwolife.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (gameMode==1)
                {
                    playertwolife.setText("20");
                }
                else if(gameMode==2)
                {
                    playertwolife.setText("40");
                }
                else
                {
                    playertwolife.setText("30");
                }
                return true;
            }
        });
        playertwopoisonbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playertwopoison.setText(Integer.toString(Integer.parseInt(playertwopoison.getText().toString())+1));
                if (Integer.parseInt(playertwopoison.getText().toString())>=10 && (gameMode == 1 || gameMode == 2)){

                    playertwopoison.setTextColor(greenColorValue);
                }
                else if (Integer.parseInt(playertwopoison.getText().toString())>=15 &&  gameMode == 3)
                {
                    playertwopoison.setTextColor(greenColorValue);
                }
            }
        });
        playertwocommanderbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playertwocommander.setText(Integer.toString(Integer.parseInt(playertwocommander.getText().toString())+1));
                if (Integer.parseInt(playertwocommander.getText().toString())>=21){
                    playertwocommander.setTextColor(redColorValue);
                }
            }
        });
        playertwocommanderbutton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                playertwocommander.setText("0");
                playertwocommander.setTextColor(blackColorValue);
                return true;
            }
        });
        playertwopoisonbutton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                playertwopoison.setText("0");
                playertwopoison.setTextColor(blackColorValue);
                return true;
            }
        });

        //Setting Listeners for the game type selection buttons

        normalgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize values
                playeronepoison.setText("0");
                playertwopoison.setText("0");
                playeronelife.setText("20");
                playertwolife.setText("20");

                //Set text color
                playeronelife.setTextColor(blackColorValue);
                playertwolife.setTextColor(blackColorValue);
                playeronepoison.setTextColor(blackColorValue);
                playertwopoison.setTextColor(blackColorValue);

                if (gameMode==2){
                    commanderlayoutp1.removeView(playeronecommander);
                    commanderlayoutp1.removeView(playeronecommanderbutton);
                    commanderlayoutp2.removeView(playertwocommander);
                    commanderlayoutp2.removeView(playertwocommanderbutton);

                }
                //setgamemode
                gameMode = 1;
            }
        });

        commandergame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize values
                playeronepoison.setText("0");
                playertwopoison.setText("0");
                playeronelife.setText("40");
                playertwolife.setText("40");

                //Set text color
                playeronelife.setTextColor(blackColorValue);
                playertwolife.setTextColor(blackColorValue);
                playeronepoison.setTextColor(blackColorValue);
                playertwopoison.setTextColor(blackColorValue);

                //show commander damage
                if (gameMode != 2) {
                    commanderlayoutp1.addView(playeronecommander, 0);
                    commanderlayoutp1.addView(playeronecommanderbutton,1);
                    commanderlayoutp2.addView(playertwocommanderbutton);
                    commanderlayoutp2.addView(playertwocommander);
                }
                playeronecommander.setText("0");
                playertwocommander.setText("0");
                playeronecommander.setTextColor(blackColorValue);
                playertwocommander.setTextColor(blackColorValue);
                //setgamemode
                gameMode = 2;
            }

        });

        twoheadedgiantgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //initialize values
                playeronepoison.setText("0");
                playertwopoison.setText("0");
                playeronelife.setText("30");
                playertwolife.setText("30");

                //Set text color
                playeronelife.setTextColor(blackColorValue);
                playertwolife.setTextColor(blackColorValue);
                playeronepoison.setTextColor(blackColorValue);
                playertwopoison.setTextColor(blackColorValue);

                if (gameMode==2){
                    commanderlayoutp1.removeView(playeronecommander);
                    commanderlayoutp1.removeView(playeronecommanderbutton);
                    commanderlayoutp2.removeView(playertwocommander);
                    commanderlayoutp2.removeView(playertwocommanderbutton);

                }

                //setgamemode
                gameMode = 3;
            }
        });
    }
}
