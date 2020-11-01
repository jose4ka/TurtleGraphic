package ru.ecostudiovl.turtlegraphic.draw;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.SurfaceHolder;

import ru.ecostudiovl.turtlegraphic.turtle.Turtle;

public class DrawThread extends Thread{

    private boolean isRunning = false;
    private SurfaceHolder surfaceHolder;
    private Turtle turtle;
    private DrawView drawView;

    public DrawThread(SurfaceHolder surfaceHolder, DrawView drawView){
        this.surfaceHolder = surfaceHolder;
        this.turtle = new Turtle(500,500, 0);
        this.drawView = drawView;
    }

    @Override
    public void run() {

        Canvas canvas;
//        while (isRunning) {
//
//            double start = System.currentTimeMillis();
//            canvas = null;
//
//            try {
//                float frameTime = 100;
//                Thread.sleep((long) (start + frameTime - System.currentTimeMillis()));
//                canvas = surfaceHolder.lockCanvas(null);
//                if (canvas == null) {continue;}
//                else {
//                    render(canvas);
//                }
//
//            }
//            catch (Exception e) {}
//
//            finally {
//                if (canvas != null) {
//                    surfaceHolder.unlockCanvasAndPost(canvas);
//                }
//            }
//        }

        Paint p = new Paint();
        p.setColor(Color.RED);
        p.setTextSize(30);

        float dl = 1;
        float scaleSize = 5;
        for (int i = 0; i < 600; i++) {

            double start = System.currentTimeMillis();
            canvas = null;

            try {
                float frameTime = drawView.getFrameTime();
                Thread.sleep((long) (start + frameTime - System.currentTimeMillis()));
                canvas = surfaceHolder.lockCanvas(null);


                if (canvas == null) {continue;}
                else {
                    render(canvas);
                }

            }
            catch (Exception e) {}

            finally {
                if (canvas != null) {
                    surfaceHolder.unlockCanvasAndPost(canvas);
                }
            }


        }
    }

    private void render(Canvas canvas){
        canvas.save();

        Paint p = new Paint();
        p.setColor(Color.RED);
        p.setTextSize(30);

//        canvas.drawColor(Color.rgb(255, 255, 255));
        drawMeters(canvas, p);
        seeMessage("MESSAGE", canvas, p);
        drawMills(canvas, p);

        turtle.drawSpiral(canvas, p);


        canvas.restore();
    }

    private void drawMeters(Canvas canvas, Paint p){
        int posX = -100;
        for(int i = -100; i<=100; i+=10){
            canvas.drawText(i+"", posX, 100, p);
            posX+=100;
        }
    }

    private void seeMessage(String message, Canvas canvas, Paint p){
        canvas.drawText(message, 500, 500, p);
    }

    private void drawMills(Canvas canvas, Paint p){
        FPSMeter.mills += 1;
        p.setColor(Color.GREEN);
        canvas.drawText("Mills: "+FPSMeter.mills,100, 50, p);

    }


    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public static class FPSMeter {

        public static float mills = 0;
    }

}
