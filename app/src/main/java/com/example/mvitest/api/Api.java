package com.example.mvitest.api;

import android.database.Observable;
import com.example.mvitest.data.model.counterModel.OrderBean;
import java.util.List;
import retrofit2.http.POST;

/**
 * @ClassName Api
 * @Description 获取订单api 接口
 * @Author YS
 * @Date 2023/9/13 9:12
 */
public interface Api {
    @POST("getOderList")
    Observable<List<OrderBean>> getOderList();
}
