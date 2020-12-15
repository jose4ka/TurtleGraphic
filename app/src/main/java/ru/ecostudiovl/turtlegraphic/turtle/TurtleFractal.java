package ru.ecostudiovl.turtlegraphic.turtle;

import android.graphics.Canvas;
import android.graphics.Paint;

public class TurtleFractal extends Turtle {

    public TurtleFractal(float initX, float initY, float initAngle) {
        super(initX, initY, initAngle);
    }

    public void drawKoh(int n, float dl, Canvas canvas, Paint p){
        if (n>0){
            drawKoh(n-1, dl, canvas, p);
            plusAngle(60);

            draw(dl, canvas, p);
            drawKoh(n-1, dl, canvas, p);
            minusAngle(60);
            minusAngle(60);

            draw(dl, canvas, p);
            drawKoh(n-1, dl, canvas, p);
            plusAngle(60);

            draw(dl, canvas, p);
            drawKoh(n-1, dl, canvas, p);
        }
    }
}
