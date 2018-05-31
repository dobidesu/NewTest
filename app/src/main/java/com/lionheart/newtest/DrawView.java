package com.lionheart.newtest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class DrawView extends View
{
    public float currentX = 40;
    public float currentY = 50;
    Paint p = new Paint();

    public DrawView(Context context)
    {
        super(context);
    }

    public DrawView(Context context , AttributeSet attributeSet)
    {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        p.setColor(Color.BLUE);
        canvas.drawCircle( currentX , currentY , 30 , p );
    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        currentX = event.getX();
        currentY = event.getY();
        invalidate();
        return true;
    }
}
