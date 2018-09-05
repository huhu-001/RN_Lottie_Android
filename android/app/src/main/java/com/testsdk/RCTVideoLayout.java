package com.testsdk;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class RCTVideoLayout extends RelativeLayout {

    public RCTVideoLayout(Context context) {
        this(context, null);
    }

    public RCTVideoLayout(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RCTVideoLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    /**
     * 初始化View
     *
     * @param context
     */
    private void initView(Context context) {
        View rootView = View.inflate(context, R.layout.activity_main, null);
        addView(rootView);
    }

    /**
     * 动态添加View
     *
     * @param str
     */
    public void autoAddView(String str) {
        Button button = new Button(getContext());
        button.setText(str);
        addView(button);
    }
}