package com.testsdk;

import android.support.annotation.Nullable;
import android.widget.Toast;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.HashMap;
import java.util.Map;

//import com.android.sdklibrary.admin.KDFBuilder;
//import com.android.sdklibrary.admin.KDFInterface;
//import com.android.sdklibrary.admin.OnComplete;
//import com.android.sdklibrary.httpclient.Session;
//import com.android.sdklibrary.presenter.util.Params;
import com.testsdk.receiver.KDFReceiver;
import com.testsdk.R;

import org.json.JSONException;
import org.json.JSONObject;


/**
 * 原生模块
 */
public class ToastModule extends ReactContextBaseJavaModule {

    private static final String DURATION_SHORT_KEY = "SHORT";
    private static final String DURATION_LONG_KEY = "LONG";

    String appKey = "fenxiang";
    String encrypt = "DNHBVMRkyRJFB/wgGseEXKYa+U8gglzpmy5Deq3TmiXfSe4FBhVcIAmhUdcqW+OCxZCdGon4NbKpQZ5a+B9OdZ6SXk1HviYD87TYItVD0u0qKN2MDpY9vGgncrrXuzRukGPWsTcc5vMLYBPWjdOnDQJBHqRUlHiDUD7+pcG4Li8=";
    private KDFReceiver mReceiver;
    
    public ToastModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    /**
     *
     * @return js调用的模块名
     */
    @Override
    public String getName() {
        
        return "ToastModule";
    }

    @Override
    public void initialize() {
        super.initialize();
//        
//        Params.isDebug = true;
//        Params.serverScene = "210"; //提供 230(开发环境) 210(测试环境)
//
//        //初始化 传递费率bonusRate
//        KDFInterface.getInstance().init(getReactApplicationContext(), "123");
//
////        临时方便测试 获取encryptData 有自己的encryptData请输入自己的encryptData
//            Session.getTestEncrpyt(getReactApplicationContext(), new OnComplete() {
//                @Override
//                public void onSuccess(JSONObject object) {
//                    try {
//                        encrypt = object.getString("encryptData");
//                        Toast.makeText(getReactApplicationContext(), "获取encryptData成功", Toast.LENGTH_SHORT).show();
//                    } catch (JSONException e) {
//                        e.printStackTrace();
//                    }
//                }
//    
//                @Override
//                public void onError(String error) {
//    
//                }
//            });
//        Toast.makeText(getReactApplicationContext(), "弹框测试", Toast.LENGTH_LONG).show();
    }

    /**
     * 给rn定义模块的一些常量
     * @return 常量的一些键值
     */
    @Nullable
    @Override
    public Map<String, Object> getConstants() {
        final Map<String, Object> constants = new HashMap<>();
        constants.put(DURATION_SHORT_KEY, Toast.LENGTH_SHORT);
        constants.put(DURATION_LONG_KEY, Toast.LENGTH_LONG);
        return constants;
    }
    
    /**
     * 使用ReactMethod注解，使这个方法被js调用
     * @param message 文本
     * @param duration 时长
     */
    @ReactMethod
    public void show(String message) {
        try {
//            KDFInterface.getInstance().toCardStoreActivity(getReactApplicationContext(), null);
            Toast.makeText(getReactApplicationContext(), message, Toast.LENGTH_LONG).show();
//            success.invoke("success");
        }
        catch (Exception e){
//            error.invoke("error");
        }
    }
    
}
