package ru.ecostudiovl.turtlegraphic.command;

import android.util.Log;

import ru.ecostudiovl.turtlegraphic.turtle.Turtle;

public class CommandMinusAngle extends Command {


    public CommandMinusAngle(Turtle turtle, float var) {
        super(turtle, var);
    }

    @Override
    public void execute() {
        super.execute();
        Log.d("COMMAND", "MINUS");
        turtle.plusAngle(value);
    }
}
