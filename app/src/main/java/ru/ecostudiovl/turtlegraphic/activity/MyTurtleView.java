package ru.ecostudiovl.turtlegraphic.activity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import ru.ecostudiovl.turtlegraphic.turtle.Turtle;
import ru.ecostudiovl.turtlegraphic.turtle.TurtlePainter;
import ru.ecostudiovl.turtlegraphic.turtle.TurtleRecursive;

public class MyTurtleView extends View {



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

        Turtle turtle;

        switch (figure){
            case 0:
                turtle = new TurtlePainter(canvas.getWidth()/2, canvas.getHeight()/2, 0);
                ((TurtlePainter) turtle).drawSpiral(canvas, p);
                break;
            case 1:
                turtle = new TurtlePainter(canvas.getWidth()/2, canvas.getHeight()/2, 0);
                ((TurtlePainter) turtle).drawSquare(canvas, p);
                break;
            case 2:
                turtle = new TurtlePainter(canvas.getWidth()/2, canvas.getHeight()/2, 0);
                ((TurtlePainter) turtle).drawCircle(canvas, p);
                break;
            case 3:
                turtle = new TurtlePainter(canvas.getWidth()/2, canvas.getHeight()/2, 0);
                ((TurtlePainter) turtle).drawSquareSpiral(canvas, p);
                break;
            case 4:
                turtle = new TurtlePainter(canvas.getWidth()/2, canvas.getHeight()/2, 0);
                ((TurtlePainter) turtle).drawHexagon(canvas, p);
                break;
            case 5:
                turtle = new TurtleRecursive(canvas.getWidth()/2, canvas.getHeight()/3, 0);
                ((TurtleRecursive) turtle).drawSpiral(canvas, p, 0);
                break;
            case 6:
                turtle = new TurtleRecursive(canvas.getWidth()/2, canvas.getHeight()/3, 0);
                ((TurtleRecursive) turtle).drawCircle(canvas, p, 0);
                break;
            case 7:
                turtle = new TurtleRecursive(canvas.getWidth()/2, canvas.getHeight()/3, 0);
                ((TurtleRecursive) turtle).drawSquareSpiral(canvas, p, 0);
                break;
            case 8:
                turtle = new TurtlePainter(canvas.getWidth()/2, canvas.getHeight()/2, 0);
                ((TurtlePainter) turtle).drawDoubleCircle(canvas, p);
                break;
            case 9:
                turtle = new TurtlePainter((canvas.getWidth()/2) - 100, canvas.getHeight()/2, 0);
                ((TurtlePainter) turtle).drawCircleInSquare(canvas, p);
                break;
            default:
        }
    }

    public void setFigure(int figure) {
        this.figure = figure;
    }
}
