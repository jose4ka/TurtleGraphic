package ru.ecostudiovl.turtlegraphic.turtle;

import android.graphics.Canvas;
import android.graphics.Paint;

public class Turtle {

    private float posX;
    private float posY;

    private float angle;

    private long height;

    private float dl = 1;

    public Turtle(float initX, float initY, float initAngle){
        posX = initX;
        posY = initY;
        angle = (initAngle * (float)Math.PI) / 180;
        height = 100;

    }

    public void draw(float delta, Canvas canvas, Paint paint){

        float lX = posX;
        float lY = posY;

        posX = posX + delta * (float) Math.cos(angle);
        posY = posY + delta * (float) Math.sin(angle);

        canvas.drawLine(lX, lY, posX, posY, paint);
    }

    public void move(){

    }

    public void plusAngle(float teta){
        angle = angle + ((teta * (float)Math.PI) / 180);
    }

    public void minusAngle(float teta){
        angle = angle - ((teta * (float)Math.PI) / 180);
    }

    public void drawSpiral(Canvas canvas, Paint paint){
        draw(dl, canvas, paint);
        plusAngle(5);
        dl += 0.01;
    }

//GETTERS/SETTERS
    public float getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public float getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public float getAngle() {
        return angle;
    }

    public void setAngle(float angle) {
        this.angle = angle;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }
}