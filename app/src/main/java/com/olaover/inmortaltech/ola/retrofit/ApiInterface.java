package com.olaover.inmortaltech.ola.retrofit;


import com.olaover.inmortaltech.ola.beans.AtmResponse;
import com.olaover.inmortaltech.ola.beans.BusResponse;
import com.olaover.inmortaltech.ola.beans.LoginResponse;
import com.olaover.inmortaltech.ola.beans.NewsResponse;
import com.olaover.inmortaltech.ola.beans.RestaurantsResponse;
import com.olaover.inmortaltech.ola.beans.RunningStatusRespponse;
import com.olaover.inmortaltech.ola.beans.TaxiOlaResponse;
import com.olaover.inmortaltech.ola.beans.TrainRoutesDetaiilsResponse;
import com.olaover.inmortaltech.ola.beans.TrainRoutesListResponse;
import com.olaover.inmortaltech.ola.beans.TrainSearchResponse;
import com.olaover.inmortaltech.ola.beans.UberTimeResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;


public interface ApiInterface {


    //for Uber
    @GET("estimates/price?start_latitude=28.5848953&start_longitude=77.3140126&end_latitude=28.5848953&end_longitude=77.3140126")
    Call<LoginResponse> personaldetails(@Header("Authorization") String token);



    //for Uber
    @GET("estimates/time?start_latitude=28.5848953&start_longitude=77.3140126")
    Call<UberTimeResponse> Timedetails(@Header("Authorization") String token);



    // for Taxi Ola
    @GET("products")
    Call<TaxiOlaResponse> taxiOladetails(@Header("Authorization") String deviicetoken,
                                         @Header("x-app-token") String token,
                                         @Query("pickup_lat") float pickup_lat,
                                         @Query("pickup_lng") float pickup_lng,
                                         @Query("drop_lat") double drop_lat,
                                         @Query("drop_lng")double drop_lng,
                                         @Query("service_type") String service_type);


    //for NewsResponse
    @GET("top-headlines?country=in&category=business&apiKey=7f7dc220e30b4a3591dc74277b059c8e")
    Call<NewsResponse>newsDetailMain(@Query("country")String in,
                                 @Query("category") String business,
                                 @Query("apiKey") String apikey);


    //for Atm
    @GET("api/place/nearbysearch/json?types=atm&radius=2000&location=37.785834,-122.406417&rankBy=distance&key=AIzaSyCgF_TyLwHRN14u7vPmG_ed0tv5URZWQHg")
Call<AtmResponse>atmDetails(@Query("types")String atm,
                            @Query("radius") String number,
                            @Query("location") String lat_long,
                            @Query("rankBy") String distance,
                            @Query("key") String mapkey);



    //for Restaurants
    @GET("api/place/nearbysearch/json?types=restaurant&radius=2000&location=37.785834,-122.406417&rankBy=distance&key=AIzaSyCgF_TyLwHRN14u7vPmG_ed0tv5URZWQHg")
    Call<RestaurantsResponse>restaurantsDetails(@Query("types")String restaurant,
                                                @Query("radius")String num,
                                                @Query("location")String lat_long,
                                                @Query("rankBy")String dist,
                                                @Query("key")String mapkey);

    //for railway runningstatus
    @GET("live/train/12555/date/11-07-2018/apikey/zltmpfae00/")
    Call<RunningStatusRespponse>runStatusDetails(@Query("train")String numb,
                                                 @Query("date")String date,
                                                 @Query("apikey")String key);
//for train routes
    @GET("route/train/12006/apikey/zltmpfae00/")
    Call<TrainRoutesDetaiilsResponse>trainRoutesDetails(@Query("train")String num,
                                                   @Query("apikey")String key);


 //for routes List
 @GET("suggest-train/train/shiv/apikey/zltmpfae00/")
    Call<TrainRoutesListResponse>routListDetails(@Query("name")String name,
                                                 @Query("apikey")String key);


 //for train search
    @GET("between/source/gkp/dest/jat/date/12-07-2018/apikey/zltmpfae00/")
    Call<TrainSearchResponse>trainSearchDetails(@Query("date")String date,
                                                @Query("apikey")String key);


    //for bus
    @GET("api/directions/json?origin=ghaziabad&destination=delhi&mode=transit&transit_mode=bus&alternatives=true&key=AIzaSyCgF_TyLwHRN14u7vPmG_ed0tv5URZWQHg\n")
    Call<BusResponse>busDetails(@Query("origin")String origin,
                                @Query("destination")String destination,
                                @Query("mode")String mode,
                                @Query("transit_mode")String transit_mode,
                                @Query("alternatives")String alternatives,
                                @Query("key")String key);


    //for Auto ola
//    @FormUrlEncoded
//    @GET("estimates/price?start_latitude=28.5848953&start_longitude=77.3140126&end_latitude=28.5848953&end_longitude=77.3140126")
//    Call<LoginResponse> uberdata(@HeaderMap Map<String, String> headers,
//                                                 @Field("old_password") String old_password,
//
//("products?pickup_lat=28.5848953&pickup_lng=77.3140126&drop_lat=28.5848953&drop_lng=77.3140126&service_type=p2p")
//
//                             Response{protocol=http/1.1, code=200, message=OK, url=https://sandbox-t1.olacabs.com/v1/products?pickup_lat=28.584955&pickup_lng=77.31389&drop_lat=0.0&drop_lng=0.0&service_type=p2p}             @Field("new_password") String new_password);
}
