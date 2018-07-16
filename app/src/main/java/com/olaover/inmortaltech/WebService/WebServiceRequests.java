package com.olaover.inmortaltech.WebService;


import com.olaover.inmortaltech.ola.beans.NewsResponse;

import retrofit2.Call;

/**
 * Created by bizbrolly on 4/20/17.
 */

public class WebServiceRequests {



    private static WebServiceRequests instance;
    private ApiInterface apiInterface;

    private WebServiceRequests() {
        apiInterface = ApiClient.getClient().create(ApiInterface.class);
    }

    public static WebServiceRequests getInstance() {
        if (instance == null)
            instance = new WebServiceRequests();
        return instance;
    }



        public void getNews(

              Callback<NewsResponse> callback){
                Call<NewsResponse> call=apiInterface.getNewsDetail();
                call.enqueue(callback);
        }





  /*  public void subCategory(
            int cateID,
            Callback<SubCategoryResponse>callback) {
        Call<SubCategoryResponse>call = apiInterface.getSubCategory(
                cateID);
        call.enqueue(callback);
    }*/



}


    /*public void getPromotions(
            Context context,
            Callback<GetPromotionalDataResponse> callback) {

        if (!GeneralUtils.isInternetAvailable(context)) {
            callback.onNetworkFailure();
            return;
        }

        Call<GetPromotionalDataResponse> call = apiInterface_promotion.getPromotionBanner();
        call.enqueue(callback);

    }*/