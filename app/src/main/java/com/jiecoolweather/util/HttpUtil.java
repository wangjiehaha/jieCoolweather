package com.jiecoolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by WANGJIE on 2018/3/1.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);//获取服务器返回的数据
    }
}
