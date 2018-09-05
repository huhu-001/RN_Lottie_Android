package com.testsdk.MyView;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.ContextMenu;
import android.view.View;
import android.widget.Toast;

import com.testsdk.R;

import java.lang.ref.WeakReference;

import static android.content.ContentValues.TAG;

public class MyView extends Activity{

    private static Dialog mSplashDialog;
    private static WeakReference<Activity> mActivity;
    private Paint mPaint; // 画笔

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    //    @Override
//    protected void onCreateContextMenu(ContextMenu menu) {
//        super.onCreateContextMenu(menu);
//        Toast.makeText(getContext(), "xxxxxxxxxxxxxxx", Toast.LENGTH_LONG).show();
//    }
    

//    public static void show(final Activity activity,final boolean fullScreen) {
//        if (activity == null) return;
//        mActivity = new WeakReference<Activity>(activity);
//        activity.runOnUiThread(new Runnable() {
//            @Override
//            public void run() {
//                if (!activity.isFinishing()) {
//
//                    mSplashDialog = new Dialog(activity,fullScreen? R.style.SplashScreen_Fullscreen:R.style.SplashScreen_SplashTheme);
//
//                    mSplashDialog.setContentView(R.layout.activity_main);
//                    mSplashDialog.setCancelable(false);
//
//                    if (!mSplashDialog.isShowing()) {
//                        mSplashDialog.show();
//                    }
//                }
//            }
//        });
//    }
}
