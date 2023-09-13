package com.example.mvitest.presenter;

import com.example.mvitest.data.model.counterModel.CounterIntent;
import com.example.mvitest.data.model.counterModel.CounterModel;

/**
 * @ClassName CounterPresenter
 * @Deprecated 这里是处理实际逻辑的地方比如 更改状态  按钮逻辑实现  根据意图实现   这里主要包含方法
 * @Date 2023/9/6 23:18
 */
public class CounterPresenter {

    /**
     * @Deprecated 处理按钮逻辑 加一或者减一
     * @param model:viewModel  返回当前状态的地方 当前数据
     * @param intent:意图  操作的意图 去加一或者去减一
     * @return
     * @author YS
     * @time 2023/9/6 23:20
     */
    public static CounterModel handelNum(CounterModel model, CounterIntent intent) {
        //三元运算符
        return intent instanceof CounterIntent.IncrementIntent
                ? new CounterModel(model.getCount() + 1)
                : new CounterModel(model.getCount() - 1);
    }
}
