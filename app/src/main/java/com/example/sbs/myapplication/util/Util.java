package com.example.sbs.myapplication.util;

import android.util.Log;

public class Util {
    public static void setTimeout(Runnable r, int delayMillis) {
        new android.os.Handler().postDelayed(r, delayMillis);
    }
}
