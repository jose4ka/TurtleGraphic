package ru.ecostudiovl.turtlegraphic.turtle;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import ru.ecostudiovl.turtlegraphic.command.Command;
import ru.ecostudiovl.turtlegraphic.command.CommandForward;
import ru.ecostudiovl.turtlegraphic.command.CommandMinusAngle;
import ru.ecostudiovl.turtlegraphic.command.CommandPlusAngle;

public class TurtleCommander extends Turtle {

    private List<Command> commands;
    private int iterations;

    private Canvas canvas;
    private Paint paint;

    public TurtleCommander(float initX, float initY, float initAngle) {
        super(initX, initY, initAngle);
        commands = new ArrayList<>();
    }

    public void drawCommand(String command, Canvas canvas, Paint paint){
        this.canvas = canvas;
        this.paint = paint;
        parseCommand(command);
        for (int i = 0; i < iterations; i++) {
            for (int j = 0; j < commands.size(); j++){
                commands.get(j).execute();
            }

        }
    }

    private void parseCommand(String command){
        try {
            String[] lCommands = command.split(" ");
            iterations = Integer.parseInt(lCommands[0]);
            for (int i = 1; i < lCommands.length - 1; i++) {
                switch (lCommands[i]){
                    case "F":
                        commands.add(new CommandForward(this, Float.parseFloat(lCommands[i+1]), canvas, paint));
                        break;
                    case "+":
                        commands.add(new CommandPlusAngle(this, Float.parseFloat(lCommands[i+1])));
                        break;
                    case "-":
                        commands.add(new CommandMinusAngle(this, Float.parseFloat(lCommands[i+1])));
                        break;
                }
            }
        }
        catch (Exception e){

        }

    }
}
