package ru.ecostudiovl.turtlegraphic.activity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

import ru.ecostudiovl.turtlegraphic.turtle.Turtle;

public class MyTurtleView extends View {

    private Turtle turtle;

    private String figure;

    public MyTurtleView(Context context, AttributeSet att){
        super(context, att);
        this.figure = "spiral";
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint p = new Paint();
        p.setColor(Color.BLACK);
        checkDraw(canvas, p);
        invalidate();
    }

    private void drawSpiral(Canvas canvas, Paint p){
        turtle = new Turtle(canvas.getWidth()/2, canvas.getHeight()/2, 0);

        for (int i = 0; i < 500; i++) {
            turtle.drawSpiral(canvas, p);
        }
    }

    private void drawSquare(Canvas canvas, Paint p){
        turtle = new Turtle(canvas.getWidth()/3, canvas.getHeight()/3, 0);

        for (int i = 0; i < 5; i++) {
            turtle.drawSquare(canvas, p);
        }
    }

    private void drawCircle(Canvas canvas, Paint p){
        turtle = new Turtle(canvas.getWidth()/2, canvas.getHeight()/3, 0);

        for (int i = 0; i < 360; i++) {
            turtle.drawCircle(canvas, p);
        }
    }

    private void checkDraw(Canvas canvas, Paint p){
        switch (figure){
            case "spiral":
                drawSpiral(canvas, p);
                break;
            case "square":
                drawSquare(canvas, p);
                break;
            case "circle":
                drawCircle(canvas, p);
                break;
            default:
                drawSpiral(canvas, p);
        }
    }

    public Turtle getTurtle() {
        return turtle;
    }

    public void setTurtle(Turtle turtle) {
        this.turtle = turtle;
    }

    public String getFigure() {
        return figure;
    }

    public void setFigure(String figure) {
        this.figure = figure;
    }
}
