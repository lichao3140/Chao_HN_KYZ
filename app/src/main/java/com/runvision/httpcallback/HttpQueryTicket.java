package com.runvision.httpcallback;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.runvision.core.Const;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import es.dmoral.toasty.Toasty;
import okhttp3.Call;

public class HttpQueryTicket {
    private static String TAG = "HttpQueryTicket";

    public static void queryTicket(Context context, String sfz) {

        OkHttpUtils
                .post()
                .url(Const.QUERY_TICKET)
                .addParams("sfz", sfz)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                        Toasty.error(context, "连接服务器错误", Toast.LENGTH_SHORT, true).show();
                    }

                    @Override
                    public void onResponse(String response, int id) {
                        Log.i(TAG, "HeartBeat success:" + response.toString());
                    }
                });
    }
}
