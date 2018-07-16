package com.olaover.inmortaltech.ola.beans;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UberTimeInner {

    @SerializedName("localized_display_name")
    private String localized_display_name;

    @SerializedName("estimate")
    private String estimate;

    @SerializedName("display_name")
    private String display_name;

    @SerializedName("product_id")
    private String product_id;

    public String getLocalized_display_name() {
        return localized_display_name;
    }

    public void setLocalized_display_name(String localized_display_name) {
        this.localized_display_name = localized_display_name;
    }

    public String getEstimate() {
        return estimate;
    }

    public void setEstimate(String estimate) {
        this.estimate = estimate;
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
}