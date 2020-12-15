package ru.ecostudiovl.turtlegraphic.command;

import android.util.Log;

import ru.ecostudiovl.turtlegraphic.turtle.Turtle;

public class CommandPlusAngle extends Command{


    public CommandPlusAngle(Turtle turtle, float var) {
        super(turtle, var);
    }

    @Override
    public void execute() {
        super.execute();
        Log.d("COMMAND", "PLUS");
        turtle.minusAngle(value);
    }
}
