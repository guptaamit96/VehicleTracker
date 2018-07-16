package com.olaover.inmortaltech.WebService;



import com.olaover.inmortaltech.ola.beans.NewsResponse;

import retrofit2.Call;
import retrofit2.http.GET;



public interface ApiInterface {


@GET(Constants.PARTIALS.home)
    Call<NewsResponse> getNewsDetail();


    Call<NewsResponse> newsDetail(String in, String business, String s);


   /* @GET(Constants.PARTIALS.category)
    Call<CategoryResponse> getCategory(
            @Query(Constants.Keys.type_id) int typeId);


    @GET(Constants.PARTIALS.pro_cate_product)
    Call<SubCategoryResponse> getSubCategory(
            @Query(Constants.Keys.cate_id) int cateID);*/
}


