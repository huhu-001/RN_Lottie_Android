package com.testsdk.MyView;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.testsdk.R;

public class PageActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
