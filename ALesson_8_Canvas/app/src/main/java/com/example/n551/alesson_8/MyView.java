package com.example.n551.alesson_8;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by N551 on 30.11.2015.
 */
public class MyView extends View {
    private  int[] array = new int[3];

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public MyView(Context context,int[] array) {
        super(context);

        this.setArray(array);
    }

    public MyView(Context context) {
        super(context);

        this.setArray(array);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    private int getArraySumm()
    {
        int result = 0;
        for (int summ: array) {
            result += summ;
        }
        return result;
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);

        int[] color = new int[3];
        float radius = 360.0f;
        float prevValue = 0f;
        float curent = 0.0f;

        color[0] = Color.RED;
        color[1] = Color.GREEN;
        color[2] = Color.BLUE;

        Paint paint = new Paint();
        paint.setStrokeWidth(1);
        paint.setStyle(Paint.Style.FILL);

        final RectF oval = new RectF();
        oval.set(300, 300, 700, 700);


        for (int i = 0;i < array.length;i++)
        {
            Log.d("arr",String.valueOf(array[i]));
            if(array[i] == 0)
                continue;

            curent = i == array.length - 1 ? radius - prevValue : radius * (array[i] * 100 / getArraySumm()) / 100;
            paint.setColor(color[i]);
            Log.d("array", "prev =" + String.valueOf(prevValue) + "current = " + String.valueOf(curent));
            canvas.drawArc(oval, prevValue, curent, true, paint);

            prevValue += radius * (array[i] * 100 / getArraySumm()) / 100;
        }

    }
}
