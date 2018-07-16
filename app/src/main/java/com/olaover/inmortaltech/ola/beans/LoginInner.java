package com.olaover.inmortaltech.ola.beans;

import com.google.gson.annotations.SerializedName;


public class LoginInner {

    @SerializedName("localized_display_name")
    private String localized_display_name;

    @SerializedName("distance")
    private String distance;

    @SerializedName("display_name")
    private String display_name;

    @SerializedName("product_id")
    private String product_id;

    @SerializedName("high_estimate")
    private String high_estimate;

    @SerializedName("low_estimate")
    private String low_estimate;

    @SerializedName("duration")
    private String duration;

    @SerializedName("estimate")
    private String estimate;

    @SerializedName("device_token")
    private String device_token;

    @SerializedName("currency_code")
    private String currency_code;


    public String getLocalized_display_name() {
        return localized_display_name;
    }

    public void setLocalized_display_name(String localized_display_name) {
        this.localized_display_name = localized_display_name;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getHigh_estimate() {
        return high_estimate;
    }

    public void setHigh_estimate(String high_estimate) {
        this.high_estimate = high_estimate;
    }

    public String getLow_estimate() {
        return low_estimate;
    }

    public void setLow_estimate(String low_estimate) {
        this.low_estimate = low_estimate;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getEstimate() {
        return estimate;
    }

    public void setEstimate(String estimate) {
        this.estimate = estimate;
    }

    public String getDevice_token() {
        return device_token;
    }

    public void setDevice_token(String device_token) {
        this.device_token = device_token;
    }

    public String getCurrency_code() {
        return currency_code;
    }

    public void setCurrency_code(String currency_code) {
        this.currency_code = currency_code;
    }
}
