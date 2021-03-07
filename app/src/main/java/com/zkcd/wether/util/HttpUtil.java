package com.zkcd.wether.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * @author zzk
 */
public class HttpUtil {
    /**
     * sendOkHttpRequest.
     * @param address address
     * @param callback callback
     */
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        okHttpClient.newCall(request);

    }
}
