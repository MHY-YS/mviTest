package com.example.mvitest.data.model.counterModel;

/**
 * @ClassName CounterIntent
 * @Description MVI 的i层  代表用户的意图  主要处理的操作比如按钮的操作
 * @Author YS
 * @Date 2023/9/6 23:06
 */
public interface CounterIntent {

    /**
     * @description 加一
     * @time 2023/9/6 23:10
     */
    public class IncrementIntent implements CounterIntent {
    }

    /**
     * @description 减一
     * @time 2023/9/6 23:17
     */
    public class DecrementIntent implements CounterIntent {
    }


}
