package com.example.mvitest.viewModel;

import com.example.mvitest.data.model.counterModel.CounterIntent;
import com.example.mvitest.presenter.CounterPresenter;
import com.example.mvitest.sideEffect.CounterSideEffect;
import com.example.mvitest.data.model.counterModel.CounterModel;
import com.example.mvitest.ui.views.CounterView;

/**
 * @ClassName CounterViewModel
 * @Description 处理view状态 和 副作用的地方 副作用包括上传服务器 保存数据等等
 * @Author YS
 * @Date 2023/9/6 23:26
 */
public class CounterViewModel {
    private final CounterView mView;
    private final CounterSideEffect mCounterSideEffect;
    private CounterModel mModel;

    /**
     * @description
     * @param view : 更新到view上的ui回调
     * @return
     * @author YS
     * @time 2023/9/6 23:28
     */
    public CounterViewModel(CounterView view) {
        this.mView = view;
        //初始化副作用
        mCounterSideEffect = new CounterSideEffect();
        //初始化状态
        mModel = new CounterModel(0);
    }

    /**
     * @description 处理按钮逻辑并且返回处理后的状态
     * @author YS
     * @time 2023/9/6 23:33
     */
    public CounterModel counterHandel(CounterIntent intent) {
        //获取处理意图对应逻辑的状态
        mModel = CounterPresenter.handelNum(mModel, intent);
        //处理副作用 上传服务器
        mCounterSideEffect.sendDataToService(mModel);
        mView.showCount(mModel.getCount());
        return mModel;
    }
}
