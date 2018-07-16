package com.olaover.inmortaltech.WebService;

import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by Akash on 27/11/16.
 */


public interface ServiceResponseCallback<T> {
    void onServiceResponse(Call<T> call, Response<T> response);
}