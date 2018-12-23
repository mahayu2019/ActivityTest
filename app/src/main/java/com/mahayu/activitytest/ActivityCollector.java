package com.mahayu.activitytest;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

public class ActivityCollector {
    //存储所有活动到一个集合
    public static List<Activity> activities = new ArrayList<>();

    //添加活动到集合
    public static void addActivity(Activity activity) {
        activities.add(activity);
    }

    //移除活动
    public static void removeActivity(Activity activity) {
        activities.remove(activity);
    }

    //销毁所有活动
    public static void finishAll() {
        for (Activity activity : activities) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }
}
