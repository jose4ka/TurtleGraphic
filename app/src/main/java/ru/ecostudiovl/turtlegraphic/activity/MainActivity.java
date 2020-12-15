package ru.ecostudiovl.turtlegraphic.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import android.widget.Spinner;

import ru.ecostudiovl.turtlegraphic.R;

public class MainActivity extends AppCompatActivity {


    private MyTurtleView myTurtleView;
    private Spinner figuresSpinner;
    private EditText etFormula;
    private Button btnEnterFormula;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeScreenElements();
    }

    private void initializeScreenElements(){
        myTurtleView = findViewById(R.id.myView);

        figuresSpinner = findViewById(R.id.figuresSpinner);
        figuresSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Выставляем индекс фигуры, в зависимости от выбранного элемента
                myTurtleView.setFigure(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        etFormula  = findViewById(R.id.etFormulaInput);

        btnEnterFormula = findViewById(R.id.btnFormulaEnter);
        btnEnterFormula.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etFormula.getText().toString() != null){
                    myTurtleView.drawCommand(etFormula.getText().toString());
                }
            }
        });

    }

}