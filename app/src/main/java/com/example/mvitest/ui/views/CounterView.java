package com.example.mvitest.ui.views;

/**
 * @ClassName CounterView
 * @Description 视图处理的接口 用于更新ui 以及接口回调  在activity或者fragment实现
 */
public interface CounterView {
    void showCount(int num);

    /**
     * @description 加一
     */
    void increment();

    /**
     * @description 减一
     * @author YS
     * @time 2023/9/4 9:51
     */
    void decrement();
}
