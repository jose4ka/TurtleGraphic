package ru.ecostudiovl.turtlegraphic.activity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import ru.ecostudiovl.turtlegraphic.turtle.TurtlePainter;

public class MyTurtleView extends View {

    private TurtlePainter turtle;

    private int figure;

    public MyTurtleView(Context context, AttributeSet att){
        super(context, att);
        this.figure = 0;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint p = new Paint();
        p.setColor(Color.BLACK);
        checkDraw(canvas, p);
        invalidate();
    }


    private void checkDraw(Canvas canvas, Paint p){

        turtle = new TurtlePainter(canvas.getWidth()/2, canvas.getHeight()/2, 0);

        switch (figure){
            case 0:
                turtle.drawSpiral(canvas, p);
                break;
            case 1:
                turtle = new TurtlePainter(canvas.getWidth()/3, canvas.getHeight()/3, 0);
                turtle.drawSquare(canvas, p);
                break;
            case 2:
                turtle = new TurtlePainter(canvas.getWidth()/2, canvas.getHeight()/3, 0);
                turtle.drawCircle(canvas, p);
                break;
            case 3:
                turtle.drawSquareSpiral(canvas, p);
                break;
            case 4:
                turtle = new TurtlePainter(canvas.getWidth()/3, canvas.getHeight()/3, 0);
                turtle.drawHexagon(canvas, p);
                break;
            default:
                turtle.drawSpiral(canvas, p);
        }
    }

    public void setFigure(int figure) {
        this.figure = figure;
    }
}
