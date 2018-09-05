package com.testsdk.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * 接收h5回调
 */
public class KDFReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String data = intent.getStringExtra("data");
        Toast.makeText(context, "" + data, Toast.LENGTH_SHORT).show();

        JSONObject jsonObject = null;
        try {
            if (!TextUtils.isEmpty(data)) {
                jsonObject = new JSONObject(data);
                String action = jsonObject.getString("action");
                if ("share".equals(action)) {
                    String param = jsonObject.getString("param");
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}