package com.olaover.inmortaltech.ola.beans;

import com.google.gson.annotations.SerializedName;

public class BusInner {


    @SerializedName("arrival_time")
    private String arrival_time;

    @SerializedName("departure_time")
    private String departure_time;

    @SerializedName("start_address")
    private String start_address;

    @SerializedName("end_address")
    private String end_address;

    public String getArrival_time() {
        return arrival_time;
    }

    public void setArrival_time(String arrival_time) {
        this.arrival_time = arrival_time;
    }

    public String getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(String departure_time) {
        this.departure_time = departure_time;
    }

    public String getStart_address() {
        return start_address;
    }

    public void setStart_address(String start_address) {
        this.start_address = start_address;
    }

    public String getEnd_address() {
        return end_address;
    }

    public void setEnd_address(String end_address) {
        this.end_address = end_address;
    }
}
