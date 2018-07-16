package com.olaover.inmortaltech.WebService;

import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by Akash on 27/11/16.
 */

public abstract class Callback<T> implements retrofit2.Callback<T>, ServiceResponseCallback<T> {
    public Callback(String in, String business, String s) {

    }

    @Override
    public final void onResponse(Call<T> call, Response<T> response){
        onServiceResponse(call, response);
    }

    public abstract void onNetworkFailure();

}
