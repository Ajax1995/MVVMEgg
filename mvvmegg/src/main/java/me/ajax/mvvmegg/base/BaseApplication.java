package me.ajax.mvvmegg.base;

import android.app.Application;

import me.ajax.mvvmegg.utils.Utils;


/**
 * Created by wanghua on 18-1-9.
 * Description：
 */

public class BaseApplication extends Application {
    private static BaseApplication sInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
        //初始化工具类
        Utils.init(this);
    }

    /**
     * 获得当前app运行的AppContext
     */
    public static Application getInstance() {
        if (sInstance == null) {
            throw new NullPointerException("please inherit BaseApplication or call setApplication.");
        }
        return sInstance;
    }
}
