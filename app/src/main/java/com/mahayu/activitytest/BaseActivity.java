package com.mahayu.activitytest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;


//所有活动的父类,活动管理器
public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("BA", getClass().getSimpleName());
        ActivityCollector.addActivity(this);  //将当前正在创建的活动添加到活动管理器中
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);  //将要销毁的活动从管理器中移除
    }
}
