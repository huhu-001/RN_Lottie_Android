package com.testsdk.Trend;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.testsdk.R;

import org.json.JSONObject;


public class TrendActivity extends Activity {

    @Override
    protected void onCreate(@android.support.annotation.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toast.makeText(getApplicationContext(),"啛啛喳喳错",Toast.LENGTH_SHORT);
        setContentView(R.layout.activity_main);

//        findViewById(R.id.test_press).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(), "点击时间测试", Toast.LENGTH_SHORT).show();
//            }
//        });
        
    }
    
}
