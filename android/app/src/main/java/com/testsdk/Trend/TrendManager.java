package com.testsdk.Trend;

import android.util.Log;
import android.view.View;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.testsdk.MainApplication;
import com.testsdk.R;

public class TrendManager extends SimpleViewManager<View> {

    @Override
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
    }

    @Override
    public String getName() {
        return "TrendManager";
    }

    @Override
    protected View createViewInstance(ThemedReactContext reactContext) {
        Log.d("view___",MainApplication.TREND_VIEW + "");
        return MainApplication.TREND_VIEW;
    }
    
}
