package com.testsdk;

import android.content.ComponentName;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.facebook.react.ReactActivity;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

public class AndroidPage extends SimpleViewManager {


    @Override
    public String getName() {
        return "AndroidPage";
    }

    @Override
    protected View createViewInstance(ThemedReactContext reactContext) {
//        return new View(reactContext);

        View rootView = View.inflate(reactContext, R.layout.activity_main, null);
        
        return  rootView;
    }
    
    
    
    
}