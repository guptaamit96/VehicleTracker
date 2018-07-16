package com.olaover.inmortaltech.ola.beans;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;


public class LoginResponse {

    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private String message;

    @SerializedName("requestKey")
    private String requestKey;

    @SerializedName("prices")
    private ArrayList<LoginInner> prices;

    @SerializedName("products")
    private ArrayList<LoginInner> Taxi_Uber_Data;




    public ArrayList<LoginInner> getPrices() {
        return prices;
    }

    public void setPrices(ArrayList<LoginInner> prices) {
        this.prices = prices;
    }





    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRequestKey() {
        return requestKey;
    }

    public void setRequestKey(String requestKey) {
        this.requestKey = requestKey;
    }



}
