package com.olaover.inmortaltech.ola.retrofit;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ApiClientConnection {

//    public static final String Base_URL = "https://api.uber.com/v1.2";
    public static final String Base_URL = "https://api.uber.com/v1.2/";
    public static final String Base_URL1 = "https://sandbox-t1.olacabs.com/v1/";
    public static final String Base_URL_News = "https://newsapi.org/v2/";
    public static final String Base_Url_Atm="https://maps.googleapis.com/maps/";
    public static final String Base_Url_Restra="https://maps.googleapis.com/maps/";
    public static final String Base_Url_Bus="https://maps.googleapis.com/maps/";
    public static final String Base_Url_IndianRailway="https://api.railwayapi.com/v2/";


//    String u = "https://sandbox-t1.olacabs.com/v1/products?pickup_lat=28.5847&pickup_lng=77.3159&drop_lat=28.5921&drop_lng=77.3261&service_type=p2p";



    private static ApiClientConnection apiClientConnection =null;
    private static ApiInterface apiInterface =null;

    public static ApiClientConnection getInstance()
    {
        if(apiClientConnection == null)
        {
            apiClientConnection = new ApiClientConnection();
        }
        return apiClientConnection;
    }


   // private static Retrofit.Builder builder = new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).baseUrl(Base_URL);

/*
    public static void changeApiBaseUrl(String newApiBaseUrl) {
        Base_URL = newApiBaseUrl;

        builder = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(Base_URL);
    }*/


    public ApiInterface createApiInterface()
    {
        if(apiInterface == null)
        {

            HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

            OkHttpClient.Builder httpBuilder = new OkHttpClient.Builder()
                    .connectTimeout(80, TimeUnit.SECONDS)
                    .readTimeout(80, TimeUnit.SECONDS);

            httpBuilder.addInterceptor(loggingInterceptor);
//            Gson gson = new GsonBuilder()
//                    .setLenient()
//                    .create();
            Retrofit.Builder builder = new Retrofit.Builder()
                    .baseUrl(Base_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpBuilder.build());

            Retrofit retrofit = builder.build();
            apiInterface = retrofit.create(ApiInterface.class);


        }
        return apiInterface;

    }




    public ApiInterface createApiInterfacecopy()
    {

        apiClientConnection = new ApiClientConnection();

        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder httpBuilder = new OkHttpClient.Builder()
                .connectTimeout(80, TimeUnit.SECONDS)
                .readTimeout(80, TimeUnit.SECONDS);

        httpBuilder.addInterceptor(loggingInterceptor);
//            Gson gson = new GsonBuilder()
//                    .setLenient()
//                    .create();
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(Base_URL1)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpBuilder.build());

        Retrofit retrofit = builder.build();
        apiInterface = retrofit.create(ApiInterface.class);

        return apiInterface;
    }

    public ApiInterface createApiInterfaceNews()
    {

        apiClientConnection = new ApiClientConnection();

        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder httpBuilder = new OkHttpClient.Builder()
                .connectTimeout(80, TimeUnit.SECONDS)
                .readTimeout(80, TimeUnit.SECONDS);

        httpBuilder.addInterceptor(loggingInterceptor);
//            Gson gson = new GsonBuilder()
//                    .setLenient()
//                    .create();
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(Base_URL_News)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpBuilder.build());

        Retrofit retrofit = builder.build();
        apiInterface = retrofit.create(ApiInterface.class);

        return apiInterface;
    }



    public ApiInterface createApiInterfaceAtm()
    {

        apiClientConnection = new ApiClientConnection();

        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder httpBuilder = new OkHttpClient.Builder()
                .connectTimeout(80, TimeUnit.SECONDS)
                .readTimeout(80, TimeUnit.SECONDS);

        httpBuilder.addInterceptor(loggingInterceptor);
//            Gson gson = new GsonBuilder()
//                    .setLenient()
//                    .create();
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(Base_Url_Atm)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpBuilder.build());

        Retrofit retrofit = builder.build();
        apiInterface = retrofit.create(ApiInterface.class);

        return apiInterface;
    }

    public ApiInterface createApiInterfaceRestra()
    {

        apiClientConnection = new ApiClientConnection();

        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder httpBuilder = new OkHttpClient.Builder()
                .connectTimeout(80, TimeUnit.SECONDS)
                .readTimeout(80, TimeUnit.SECONDS);

        httpBuilder.addInterceptor(loggingInterceptor);
//            Gson gson = new GsonBuilder()
//                    .setLenient()
//                    .create();
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(Base_Url_Restra)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpBuilder.build());

        Retrofit retrofit = builder.build();
        apiInterface = retrofit.create(ApiInterface.class);

        return apiInterface;
    }

    public ApiInterface createApiInterfaceIndianRailway()
    {

        apiClientConnection = new ApiClientConnection();

        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder httpBuilder = new OkHttpClient.Builder()
                .connectTimeout(80, TimeUnit.SECONDS)
                .readTimeout(80, TimeUnit.SECONDS);

        httpBuilder.addInterceptor(loggingInterceptor);
//            Gson gson = new GsonBuilder()
//                    .setLenient()
//                    .create();
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(Base_Url_IndianRailway)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpBuilder.build());

        Retrofit retrofit = builder.build();
        apiInterface = retrofit.create(ApiInterface.class);

        return apiInterface;
    }



    public ApiInterface createApiInterfaceBus()
    {

        apiClientConnection = new ApiClientConnection();

        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder httpBuilder = new OkHttpClient.Builder()
                .connectTimeout(80, TimeUnit.SECONDS)
                .readTimeout(80, TimeUnit.SECONDS);

        httpBuilder.addInterceptor(loggingInterceptor);
//            Gson gson = new GsonBuilder()
//                    .setLenient()
//                    .create();
        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(Base_Url_Bus)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpBuilder.build());

        Retrofit retrofit = builder.build();
        apiInterface = retrofit.create(ApiInterface.class);

        return apiInterface;
    }

}
