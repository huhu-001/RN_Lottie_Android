package com.testsdk.CircleView;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.view.View;

import com.testsdk.R;

import java.lang.ref.WeakReference;

public class CircleView  extends View {

    private static Dialog mSplashDialog;
    private static WeakReference<Activity> mActivity;
    private final String TAG = "CircleView";
    private Paint mPaint; // 画笔
    private  Activity activity;
    
    public CircleView(Context context) {
        super(context);
        mPaint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(100, 100, 100, mPaint); // 画一个半径为100px的圆
        Log.d(TAG, "绘图");
    }
    
}
