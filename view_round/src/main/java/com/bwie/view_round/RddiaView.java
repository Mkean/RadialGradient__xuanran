package com.bwie.view_round;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

/**
 * 作者：王庆
 * 时间：2017/11/30
 */

public class RddiaView extends View {


    private Paint paint;
    private RadialGradient mRadialGradient;
    private int height;
    private int width;
    private float textWidth;

    public RddiaView(Context context) {
        super(context);
        paint = new Paint();
        mRadialGradient = new RadialGradient(240, 260, 240, new int[]{
                Color.GRAY, Color.YELLOW, Color.BLUE, Color.GREEN}, null,
                Shader.TileMode.MIRROR);
//        边缘拉伸
//        static final Shader.TileMode CLAMP: .
//        在水平方向和垂直方向交替景象, 两个相邻图像间没有缝隙.
//        static final Shader.TileMode MIRROR：
//        在水平方向和垂直方向重复摆放,两个相邻图像间有缝隙缝隙.
//        Static final Shader.TillMode REPETA：

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setAntiAlias(true);
        paint.setShader(mRadialGradient);
        canvas.drawCircle(240, 500, 200, paint);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                    Toast.makeText(getContext(), "dsadas", Toast.LENGTH_SHORT).show();
                break;
            case MotionEvent.ACTION_UP:

                break;
            case MotionEvent.ACTION_MOVE:

                break;

        }
        return super.onTouchEvent(event);
    }
}
