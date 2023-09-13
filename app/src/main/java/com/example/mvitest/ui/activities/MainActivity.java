package com.example.mvitest.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mvitest.R;
import com.example.mvitest.data.model.counterModel.CounterIntent;
import com.example.mvitest.presenter.CounterViewModel;
import com.example.mvitest.ui.views.CounterView;

/**
 * @description mvi架构测试
 * @author YS
 * @time 2023/9/3 23:52
 */
public class MainActivity extends AppCompatActivity  implements CounterView {

    private Button mAddBtn;
    private Button mSubBtn;
    private CounterViewModel mOnClickPresenter;
    private TextView mShowText;
    private com.example.mvitest.viewModel.CounterViewModel mCounterViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();

        onClickListener();
    }
    private void initData() {
        mOnClickPresenter = new CounterViewModel(this);
        mCounterViewModel = new com.example.mvitest.viewModel.CounterViewModel(this);
    }

    private void onClickListener() {
        mAddBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mOnClickPresenter.onClickIncrement();
                mCounterViewModel.counterHandel(new CounterIntent.IncrementIntent());
            }
        });
        mSubBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mOnClickPresenter.onClickDecrement();
                mCounterViewModel.counterHandel(new CounterIntent.DecrementIntent());
            }
        });
    }

    private void initView() {
        mAddBtn = findViewById(R.id.add);
        mSubBtn = findViewById(R.id.sub);
        mShowText = findViewById(R.id.show);
    }

    //==================================按钮点击事件回调=========================================
    @Override
    public void showCount(int num) {
        mShowText.setText(num+"");
        Toast.makeText(this, "" + num, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void increment() {
        Toast.makeText(this, "count增加一", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void decrement() {
        Toast.makeText(this, "connr减少一", Toast.LENGTH_SHORT).show();
    }
}