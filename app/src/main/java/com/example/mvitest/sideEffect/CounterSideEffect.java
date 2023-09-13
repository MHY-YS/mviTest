package com.example.mvitest.sideEffect;

import android.util.Log;

import com.example.mvitest.data.model.counterModel.CounterModel;

/**
 * @ClassName CounterSideEffect
 * @Description view操作的副作用  比如上传服务器 等等
 * @Author YS
 * @Date 2023/9/6 23:31
 */
public class CounterSideEffect {
    public void sendDataToService(CounterModel model) {

        Log.d("sideEffect", "sendDataToService: "+model.getCount());
    }
}
