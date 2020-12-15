package ru.ecostudiovl.turtlegraphic.command;

import android.graphics.Canvas;
import android.graphics.Paint;

import ru.ecostudiovl.turtlegraphic.turtle.Turtle;

public class Command {

    protected Turtle turtle;
    protected float value;
    protected Canvas canvas;
    protected Paint paint;

    public Command(Turtle turtle, float var){
        this.turtle = turtle;
        this.value = var;
    }

    public Command(Turtle turtle, float var,  Canvas canvas, Paint paint){
        this.turtle = turtle;
        this.value = var;
        this.canvas = canvas;
        this.paint = paint;
    }


    public void execute(){}

}
