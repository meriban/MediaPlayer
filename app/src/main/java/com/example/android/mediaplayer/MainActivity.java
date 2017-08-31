package com.example.android.mediaplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.os.Build.VERSION_CODES.M;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialise media player and set file to be played
        mediaPlayer = MediaPlayer.create(this,R.raw.blurry);

        //declare OnClickListener on play button
        Button playButton = (Button)findViewById(R.id.playbutton);
        playButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                mediaPlayer.start();
            }
        });

        // declare OnClickListener on pause button
        Button pauseButton = (Button)findViewById(R.id.pausebutton);
        pauseButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
               mediaPlayer.pause();
            }
        });

    }
}
