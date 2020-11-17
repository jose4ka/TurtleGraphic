/*
Основной класс черепашки, в котором описаны всё её основные дейсвтия и поля
 */

package ru.ecostudiovl.turtlegraphic.turtle;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

public class Turtle {

    //Позиция
    protected float posX;
    protected float posY;

    //Угол поворота
    protected float angle;

    protected long height;

    //Шаг, с которым движется черепашка, используется при перемещении
    protected float dl;

    //Конструктор
    public Turtle(float initX, float initY, float initAngle){
        posX = initX;
        posY = initY;
        angle = (initAngle * (float)Math.PI) / 180;
        height = 100;
        dl = 1;
    }

    //Основная процедура, которая рисует на холсте
    public void draw(float delta, Canvas canvas, Paint paint){
        float posX0 = posX;
        float posY0 = posY;

        posX = posX + delta * (float) Math.cos(angle);
        posY = posY + delta * (float) Math.sin(angle);
        paint.setAntiAlias(true);

        canvas.drawLine(posX0, posY0, posX, posY, paint);
    }

    //Процедура которая просто перемещает черепашку
    public void move(float delta){
        posX = posX + delta * (float) Math.cos(angle);
        posY = posY + delta * (float) Math.sin(angle);
    }

    //Брибавляем угол поворота
    public void plusAngle(float teta){
        angle = angle + ((teta * (float)Math.PI) / 180);
    }

    //Отнимаем угол поворота
    public void minusAngle(float teta){
        angle = angle - ((teta * (float)Math.PI) / 180);
    }

    //Сеттеры
    public void setPosX(float posX) {
        this.posX = posX;
    }

    public void setPosY(float posY) {
        this.posY = posY;
    }
}
