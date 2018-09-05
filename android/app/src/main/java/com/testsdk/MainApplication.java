package com.testsdk;

import android.app.Application;
import android.view.View;

import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;
import com.testsdk.CircleView.CircleViewPackge;
import com.testsdk.MyView.MyViewPackge;
import com.testsdk.Trend.TrendViewPackge;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {


  public static  View TREND_VIEW;
  
  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
              new MainReactPackage(), 
              new ToastReactPackage(),
              new AndroidPagePackage(),
              new CircleViewPackge(),
              new TrendViewPackge()
//              new MyViewPackge()
//              new SplashScreenReactPackage()
      );
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
  }
  
  
}
