package ru.ecostudiovl.turtlegraphic.command;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;

import ru.ecostudiovl.turtlegraphic.turtle.Turtle;

public class CommandForward extends Command {


    public CommandForward(Turtle turtle, float var, Canvas canvas, Paint paint) {
        super(turtle, var, canvas, paint);
    }

    @Override
    public void execute() {
        Log.d("COMMAND", "FORWARD");
        turtle.draw(value, canvas, paint);
    }
}
