package ru.ecostudiovl.turtlegraphic;

import android.content.Context;
import android.graphics.Canvas;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class DrawView extends SurfaceView implements SurfaceHolder.Callback {


    private DrawThread drawThread;

    public DrawView(Context context){
        super(context);
        getHolder().addCallback(this);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        startDrawThread();
    }

    private void startDrawThread(){
        drawThread = new DrawThread(getHolder());
        //Устанавливаем переменуую как true, это нужно для управления потоком
        drawThread.setRunning(true);
        //Стартуем поток
        drawThread.start();
    }

    public void stopDrawThread(){
        //Останавливаем поток
        boolean retry = true;
        drawThread.setRunning(false);
        while (retry) {
            try {
                drawThread.join();
                retry = false;
            } catch (InterruptedException e) {
            }
        }

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        stopDrawThread();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
