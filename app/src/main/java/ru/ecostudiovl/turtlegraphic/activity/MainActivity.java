package ru.ecostudiovl.turtlegraphic.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.SeekBar;

import ru.ecostudiovl.turtlegraphic.R;

public class MainActivity extends AppCompatActivity {


    private MyTurtleView myTurtleView;
    private FrameLayout graphicFrame;
    private SeekBar seekBar;
    private Button btnEnter;
    private EditText etName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTurtleView = findViewById(R.id.myView);

        etName = findViewById(R.id.etFigureName);
        btnEnter = findViewById(R.id.btnEnter);
        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!etName.getText().toString().isEmpty() && etName.getText().toString().length() > 0){
                    myTurtleView.setFigure(etName.getText().toString());
                }
            }
        });


        seekBar = findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }

}