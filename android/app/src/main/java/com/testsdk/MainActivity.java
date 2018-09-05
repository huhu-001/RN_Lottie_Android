package com.testsdk;

import android.app.LocalActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.facebook.react.ReactActivity;
import com.testsdk.Trend.TrendActivity;

public class MainActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    
    
    @Override
    protected String getMainComponentName() {
        return "TestSdk";
    }
    
    LocalActivityManager mActivityManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        if( MainApplication.TREND_VIEW==null) {
            mActivityManager = new LocalActivityManager(this, true);
            mActivityManager.dispatchCreate(savedInstanceState);

            View view = mActivityManager.startActivity(getMainComponentName(), new Intent(this, TrendActivity.class)).getDecorView();
            MainApplication.TREND_VIEW = view;
            
            Log.i("当前组件名",getMainComponentName());
//        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        mActivityManager.dispatchPause(isFinishing());
    }

    @Override
    protected void onResume() {
        super.onResume();
        mActivityManager.dispatchResume();
    }
    
    
}

