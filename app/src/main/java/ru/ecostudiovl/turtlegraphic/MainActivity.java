package ru.ecostudiovl.turtlegraphic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {


    private DrawView drawView;
    private FrameLayout graphicFrame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        graphicFrame = findViewById(R.id.frameGraphics);
        createView();
    }

    private void createView(){
        drawView = new DrawView(this);
        graphicFrame.addView(drawView);
    }
}