package in.samcodes.basicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ButtonClicked(View view){
        Button button=(Button) view;
        mediaPlayer= MediaPlayer.create(this, getResources().getIdentifier(button.getTag().toString(),"raw",getPackageName()));
        mediaPlayer.start();
    }
}