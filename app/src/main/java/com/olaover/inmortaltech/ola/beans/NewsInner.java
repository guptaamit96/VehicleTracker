package com.olaover.inmortaltech.ola.beans;

import com.google.gson.annotations.SerializedName;

public class NewsInner {

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }

    @SerializedName("title")
    private String title;

    @SerializedName("description")
    private String description;

    @SerializedName("urlToImage")
    private String urlToImage;
}
