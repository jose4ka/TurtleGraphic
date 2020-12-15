/*
Класс наследуется от основной черепашки
Тут в неё заложено рисование базовых фигур
 */

package ru.ecostudiovl.turtlegraphic.turtle;

import android.graphics.Canvas;
import android.graphics.Paint;

public class TurtlePainter extends Turtle {

    public TurtlePainter(float initX, float initY, float initAngle) {
        super(initX, initY, initAngle);
    }

    public void drawSpiral(Canvas canvas, Paint paint){
        for (int i = 0; i < 500; i++) {
            draw(dl, canvas, paint);
            plusAngle(5);
            dl += 0.05;
        }
    }

    public void drawSquare(Canvas canvas, Paint paint){
        for (int i = 0; i < 5; i++) {
            dl = 200;
            draw(dl, canvas, paint);
            plusAngle(90);
        }
    }

    public void drawCircle(Canvas canvas, Paint paint){
        for (int i = 0; i < 360; i++) {
            dl = 5;
            draw(dl, canvas, paint);
            plusAngle(1);
        }
    }

    public void drawDoubleCircle(Canvas canvas, Paint paint){
        for (int i = 0; i < 700; i++) {
            dl = 5;
            draw(dl, canvas, paint);
            plusAngle(1);
        }

        //Сбрасываем значения
        posX = canvas.getWidth() / 2;
        posY = canvas.getHeight() / 2;
        angle = 0;

        //Рисуем круг, но уже меньше
        for (int i = 0; i < 700; i++) {
            dl = 2;
            draw(dl, canvas, paint);
            plusAngle(1);
        }
    }

    public void drawCircleInSquare(Canvas canvas, Paint paint){
        //Сначала рисуем квадрат
        for (int i = 0; i < 5; i++) {
            dl = 200;
            draw(dl, canvas, paint);
            plusAngle(90);
        }

        //Сбрасываем значения
        posX = canvas.getWidth() / 2;
        posY = canvas.getHeight() / 2;
        angle = 0;

        //Рисуем круг, но уже меньше
        for (int i = 0; i < 700; i++) {
            dl = 1.75f;
            draw(dl, canvas, paint);
            plusAngle(1);
        }
    }

    public void drawCircleInSquareWithRadius(Canvas canvas, Paint paint, float r){
        //Сначала рисуем квадрат
        for (int i = 0; i < 5; i++) {
            dl = r;
            draw(dl, canvas, paint);
            plusAngle(90);
        }

        //Сбрасываем значения
        posX = canvas.getWidth() / 2;
        posY = canvas.getHeight() / 2;
        angle = 0;

        for (int i = 0; i < 700; i++) {
            dl = 1;
            draw(dl, canvas, paint);
            plusAngle(1);
        }
    }

    public void drawSquareSpiral(Canvas canvas, Paint paint){
        for (int i = 0; i < 100; i++) {
            draw(dl, canvas, paint);
            plusAngle(90);
            dl += 5;
        }
    }

    public void drawHexagon(Canvas canvas, Paint paint){
        for (int i = 0; i < 6; i++) {
            dl = 200;
            plusAngle(60);
            draw(dl, canvas, paint);
        }
    }



}
