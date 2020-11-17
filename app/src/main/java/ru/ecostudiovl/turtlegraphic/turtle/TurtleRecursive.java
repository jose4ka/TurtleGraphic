package ru.ecostudiovl.turtlegraphic.turtle;

import android.graphics.Canvas;
import android.graphics.Paint;

public class TurtleRecursive extends Turtle {


    public TurtleRecursive(float initX, float initY, float initAngle) {
        super(initX, initY, initAngle);
    }

    public void drawSpiral(Canvas canvas, Paint paint, int counter){
        if (counter < 500){
            draw(dl, canvas, paint);
            plusAngle(5);
            dl += 0.05;
            counter++;
            drawSpiral(canvas, paint, counter);
        }
        else return;
    }

    public void drawCircle(Canvas canvas, Paint paint, int counter){
        if (counter < 600){
            dl = 5;
            draw(dl, canvas, paint);
            plusAngle(1);
            counter++;
            drawCircle(canvas, paint, counter);
        }
        else return;

    }

    public void drawSquareSpiral(Canvas canvas, Paint paint, int counter){
        if (counter < 100){
            draw(dl, canvas, paint);
            plusAngle(90);
            dl += 5;
            counter++;
            drawSquareSpiral(canvas, paint, counter);
        }
        else return;
    }


}
