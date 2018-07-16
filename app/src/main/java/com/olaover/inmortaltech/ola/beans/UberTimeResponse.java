package com.olaover.inmortaltech.ola.beans;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class UberTimeResponse {

    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private String message;

    @SerializedName("requestKey")
    private String requestKey;

    @SerializedName("times")
    private ArrayList<UberTimeInner> times;


    public ArrayList<UberTimeInner> getTimes() {
        return times;
    }
    public void setTimes(ArrayList<UberTimeInner> times) {
        this.times = times;
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
