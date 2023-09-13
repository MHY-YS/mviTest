package com.example.mvitest.presenter;

import com.example.mvitest.data.model.counterModel.CounterModel;
import com.example.mvitest.ui.views.CounterView;

/**
 * @ClassName CounterViewModel
 * @Description 处理view的点击事件
 */
public class CounterViewModel {
    private CounterModel mModel;
    private final CounterView mView;

    public CounterViewModel(CounterView counterView) {
        this.mView = counterView;
        //初始view状态
        this.mModel = new CounterModel(0);
    }

    /**
     * @description 处理增加一逻辑
     * @author YS
     * @time 2023/9/4 9:57
     */
    public void onClickIncrement() {
        CounterModel counterModel = new CounterModel(mModel.getCount() + 1);
        this.mModel = counterModel;
        //去刷新view
        mView.increment();
        mView.showCount(mModel.getCount());
    }

    /**
     * @description 处理减一逻辑
     * @author YS
     * @time 2023/9/4 9:57
     */
    public void onClickDecrement() {
        CounterModel counterModel = new CounterModel(mModel.getCount() -1 );
        this.mModel = counterModel;
        //去刷新view
        mView.decrement();
        mView.showCount(mModel.getCount());
    }
}
