
package android.com.example.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this, R.raw.music);

        Button Play = findViewById(R.id.play);

        Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        // TODO Auto-generated method stub
                        //here you can stop your recording thread.
                        releaseMediaPlayer();

                    }
                });
            }
        });

        Button Pause = findViewById(R.id.pause);

        Pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.pause();
            }
        });

    }

    @Override
    protected void onStop(){
        super.onStop();
        releaseMediaPlayer();
    }

    /**
     * Clean up the media player by releasing its resources.
     */
    private void releaseMediaPlayer () {
        // If the media player is not null, then it may be currently playing a sound.
        if (mediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mediaPlayer = null;
        }
    }

    public void Go(View view){
        Intent intent = new Intent(this,WholePlaceActivity.class);
        startActivity(intent);
    }

    public void cart(View view){
        Intent intent = new Intent(this,CartActivity.class);
        startActivity(intent);
    }

    public void supplement(View view){
        Intent intent = new Intent(this,SupplementActivity.class);
        startActivity(intent);
    }

    public void about_supplement(View view){
        Intent intent = new Intent(this,supplement_about_item.class);
        startActivity(intent);
    }

}