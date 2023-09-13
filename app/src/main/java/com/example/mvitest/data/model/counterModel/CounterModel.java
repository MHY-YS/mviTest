package com.example.mvitest.data.model.counterModel;

/**
 * @ClassName CounterModel
 * @Description 获取view的状态
 * @Author YS
 * @Date 2023/9/4 9:51
 */
public class CounterModel {

    private final int mCount;

    public CounterModel(int num) {
        this.mCount = num;
    }
    public int getCount() {
        return this.mCount;
    }
}
