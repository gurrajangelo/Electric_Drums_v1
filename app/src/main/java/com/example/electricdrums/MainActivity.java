package com.example.electricdrums;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void playKick(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.kick);
        mediaPlayer.start();
    }

    public void playSnare(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.snare);
        mediaPlayer.start();
    }

    public void playClap(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.clap);
        mediaPlayer.start();
    }

    public void playClosedHat(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.closed_hat);
        mediaPlayer.start();
    }

    public void playClosedHat2(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.closed_hat_alt);
        mediaPlayer.start();
    }

    public void playOpenHat(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.open_hat);
        mediaPlayer.start();
    }

    public void playOpenHat2(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.open_hat_alt);
        mediaPlayer.start();
    }

    public void playCymbal(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.cymbal);
        mediaPlayer.start();
    }
}