package com.wangxiaobao.mytest.log;

import android.util.Log;

/**
 * 日志输出
 */
public class LogUtil {
    private static final String TAG = "POS";
    /**
     * 常规日志输出
     * @param str
     */
    public static void Ld(String str){
        Log.d(TAG,str);
    }

    /**
     * 异常日志输出，
      @param str
     */
    public static void Le(String str){
            Log.e(TAG,str);
    }

    /**
     * 异常日志输出，
     * @param str
     */
    public static void Le(String str, Exception e){
        if (e != null){
            e.printStackTrace();
        }
            Log.e(TAG,str);
    }
}
