package ru.ecostudiovl.turtlegraphic.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.SeekBar;

import ru.ecostudiovl.turtlegraphic.R;
import ru.ecostudiovl.turtlegraphic.draw.DrawView;

public class MainActivity extends AppCompatActivity {


    private DrawView drawView;
    private FrameLayout graphicFrame;
    private SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        graphicFrame = findViewById(R.id.frameGraphics);

        createView();

        seekBar = findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                drawView.setFrameTime((float)progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    private void createView(){
        drawView = new DrawView(this);
        graphicFrame.addView(drawView);
    }
}