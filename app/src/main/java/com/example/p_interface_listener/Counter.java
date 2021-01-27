package com.example.p_interface_listener;

import android.util.Log;

public class Counter {
    private final static String TAG = Counter.class.getSimpleName();

    private OnCountListener onCountLisiener = null;

    public interface OnCountListener {
        void onCount(int count);
    }

    public Counter() {

    }

    public void printCount() {
        try {
            for(int i=0; i<10; i++) {
                Thread.sleep(1000);
                if(onCountLisiener != null){
                    onCountLisiener.onCount(i);
                }
                Log.d(TAG, "" + i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setOnCountListener(OnCountListener listener) {
        onCountLisiener = listener;
    }
}