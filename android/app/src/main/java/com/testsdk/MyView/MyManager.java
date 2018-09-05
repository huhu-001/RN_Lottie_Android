package com.testsdk.MyView;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.testsdk.CircleView.CircleView;

public class MyManager extends SimpleViewManager<CircleView> {
    /**
     * 设置js引用名
     * @return String
     */
    @Override
    public String getName() {
        return "MCircle";
    }

    /**
     * 创建UI组件实例
     * @param reactContext
     * @return CircleView
     */
    @Override
    protected CircleView createViewInstance(ThemedReactContext reactContext) {
        return new CircleView(reactContext);
    }
}
