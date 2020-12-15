package ru.ecostudiovl.turtlegraphic.turtle;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class TurtleColored extends TurtlePainter {
    public TurtleColored(float initX, float initY, float initAngle) {
        super(initX, initY, initAngle);
    }

    @Override
    public void drawSpiral(Canvas canvas, Paint paint) {
        paint.setColor(Color.GREEN);
        super.drawSpiral(canvas, paint);
    }

    @Override
    public void drawSquare(Canvas canvas, Paint paint) {
        paint.setColor(Color.RED);
        paint.setStrokeWidth(5);
        super.drawSquare(canvas, paint);
    }

    @Override
    public void drawCircle(Canvas canvas, Paint paint) {
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(6);
        super.drawCircle(canvas, paint);
    }

    @Override
    public void drawHexagon(Canvas canvas, Paint paint) {
        paint.setColor(Color.MAGENTA);
        paint.setStrokeWidth(10);
        super.drawHexagon(canvas, paint);
    }
}
