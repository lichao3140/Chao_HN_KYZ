package com.runvision.httpcallback;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import com.common.pos.api.util.PosUtil;
import com.google.gson.Gson;
import com.runvision.bean.Ticket;
import com.runvision.core.Const;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;
import es.dmoral.toasty.Toasty;
import okhttp3.Call;


public class HttpQueryTicket {
    private static String TAG = "HttpQueryTicket";

    /**
     * 查询车票
     * @param context
     * @param sfz
     */
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
                        Gson gson = new Gson();
                        Ticket gsonTicket = gson.fromJson(response, Ticket.class);
                        if (gsonTicket.getStatus() == 1) {
                            // 操作成功---开闸
                            PosUtil.setRelayPower(1);//开闸
                        } else if (gsonTicket.getStatus() == 2) {
                            // 操作失败
                            Toasty.error(context, "未查询到您的购票信息", Toast.LENGTH_SHORT, true).show();
                        }
                        Log.i(TAG, "HeartBeat success:" + response.toString());
                    }
                });
    }
}
