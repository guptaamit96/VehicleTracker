package com.olaover.inmortaltech.ola.beans;

import java.util.List;

public class TaxiOlaResponse {
    /**
     * hotspot_zone : {"is_hotpot_zone":false}
     * categories : [{"id":"share","display_name":"Share","currency":"INR","distance_unit":"kilometre","time_unit":"minute","eta":-1,"distance":-1,"ride_later_enabled":"false","ride_later_allowed":false,"ride_now_allowed":false,"image":"http://d1foexe15giopy.cloudfront.net/share.png","cancellation_policy":{"cancellation_charge":25,"currency":"INR","cancellation_charge_applies_after_time":2,"time_unit":"minute"},"fare_breakup":[{"type":"standard_rate","fare":"Save up to 50% on Mini fares","surcharge":[]}]},{"id":"mini","display_name":"Mini","currency":"INR","distance_unit":"kilometre","time_unit":"minute","eta":-1,"distance":-1,"ride_later_enabled":"true","ride_later_allowed":true,"ride_now_allowed":true,"image":"http://d1foexe15giopy.cloudfront.net/mini.png","cancellation_policy":{"cancellation_charge":50,"currency":"INR","cancellation_charge_applies_after_time":10,"time_unit":"minute"},"fare_breakup":[{"type":"flat_rate","minimum_distance":5,"minimum_time":7,"base_fare":120,"minimum_fare":80.65,"cost_per_distance":4.6,"ride_cost_per_minute":1,"waiting_cost_per_minute":1.2,"max_waiting_time":100,"inclusive_pre_waiting_time":1,"surcharge":[],"rates_lower_than_usual":false,"rates_higher_than_usual":false},{"type":"flat_rate","minimum_distance":8,"minimum_time":6,"base_fare":125,"minimum_fare":120,"cost_per_distance":4,"ride_cost_per_minute":4,"waiting_cost_per_minute":1.2,"max_waiting_time":100,"inclusive_pre_waiting_time":1,"surcharge":[],"rates_lower_than_usual":false,"rates_higher_than_usual":false},{"type":"flat_rate","minimum_distance":5,"minimum_time":7,"base_fare":120,"minimum_fare":85,"cost_per_distance":4,"ride_cost_per_minute":1,"waiting_cost_per_minute":1.2,"max_waiting_time":100,"inclusive_pre_waiting_time":1,"surcharge":[],"rates_lower_than_usual":false,"rates_higher_than_usual":false},{"type":"flat_rate","minimum_distance":4,"minimum_time":1,"base_fare":100,"minimum_fare":120,"cost_per_distance":25,"ride_cost_per_minute":2,"waiting_cost_per_minute":1.2,"max_waiting_time":100,"inclusive_pre_waiting_time":1,"surcharge":[],"rates_lower_than_usual":false,"rates_higher_than_usual":false},{"type":"flat_rate","minimum_distance":4,"minimum_time":1,"base_fare":100,"minimum_fare":0,"cost_per_distance":10,"ride_cost_per_minute":1,"waiting_cost_per_minute":1.2,"max_waiting_time":100,"inclusive_pre_waiting_time":1,"surcharge":[],"rates_lower_than_usual":false,"rates_higher_than_usual":false},{"type":"flat_rate","minimum_distance":0,"minimum_time":0,"base_fare":50,"minimum_fare":69,"cost_per_distance":8,"ride_cost_per_minute":1.08,"waiting_cost_per_minute":1.2,"max_waiting_time":100,"inclusive_pre_waiting_time":1,"surcharge":[],"rates_lower_than_usual":false,"rates_higher_than_usual":false},{"type":"delhi_extension","minimum_distance":0,"minimum_time":0,"base_fare":200,"minimum_fare":219,"cost_per_distance":8,"ride_cost_per_minute":1,"waiting_cost_per_minute":1.2,"max_waiting_time":100,"inclusive_pre_waiting_time":1,"surcharge":[],"rates_lower_than_usual":false,"rates_higher_than_usual":false}]},{"id":"prime","display_name":"Prime Sedan","currency":"INR","distance_unit":"kilometre","time_unit":"minute","eta":-1,"distance":-1,"ride_later_enabled":"true","ride_later_allowed":true,"ride_now_allowed":true,"image":"http://d1foexe15giopy.cloudfront.net/prime.png","cancellation_policy":{"cancellation_charge":75,"currency":"INR","cancellation_charge_applies_after_time":5,"time_unit":"minute"},"fare_breakup":[{"type":"flat_rate","minimum_distance":0,"minimum_time":0,"base_fare":50,"minimum_fare":69,"cost_per_distance":10,"ride_cost_per_minute":1.08,"waiting_cost_per_minute":1.2,"max_waiting_time":100,"inclusive_pre_waiting_time":1,"surcharge":[],"rates_lower_than_usual":false,"rates_higher_than_usual":false},{"type":"delhi_extension","minimum_distance":0,"minimum_time":0,"base_fare":200,"minimum_fare":219,"cost_per_distance":10,"ride_cost_per_minute":1,"waiting_cost_per_minute":1.2,"max_waiting_time":100,"inclusive_pre_waiting_time":1,"surcharge":[],"rates_lower_than_usual":false,"rates_higher_than_usual":false}]},{"id":"prime_play","display_name":"Prime Play","currency":"INR","distance_unit":"kilometre","time_unit":"minute","eta":-1,"distance":-1,"ride_later_enabled":"true","ride_later_allowed":true,"ride_now_allowed":true,"image":"http://d1foexe15giopy.cloudfront.net/prime_play.png","cancellation_policy":{"cancellation_charge":25,"currency":"INR","cancellation_charge_applies_after_time":2,"time_unit":"minute"},"fare_breakup":[{"type":"flat_rate","minimum_distance":0,"minimum_time":0,"base_fare":50,"minimum_fare":69,"cost_per_distance":10,"ride_cost_per_minute":1.08,"waiting_cost_per_minute":1.2,"max_waiting_time":100,"inclusive_pre_waiting_time":1,"surcharge":[],"rates_lower_than_usual":false,"rates_higher_than_usual":false},{"type":"flat_rate","minimum_distance":5,"minimum_time":44,"base_fare":70,"minimum_fare":80,"cost_per_distance":4,"ride_cost_per_minute":4,"waiting_cost_per_minute":1.2,"max_waiting_time":100,"inclusive_pre_waiting_time":1,"surcharge":[],"rates_lower_than_usual":false,"rates_higher_than_usual":false},{"type":"delhi_extension","minimum_distance":0,"minimum_time":0,"base_fare":200,"minimum_fare":219,"cost_per_distance":10,"ride_cost_per_minute":1,"waiting_cost_per_minute":1.2,"max_waiting_time":100,"inclusive_pre_waiting_time":1,"surcharge":[],"rates_lower_than_usual":false,"rates_higher_than_usual":false},{"type":"flat_rate","minimum_distance":2,"minimum_time":1,"base_fare":100,"minimum_fare":0,"cost_per_distance":15,"ride_cost_per_minute":1,"waiting_cost_per_minute":1.2,"max_waiting_time":100,"inclusive_pre_waiting_time":1,"surcharge":[],"rates_lower_than_usual":false,"rates_higher_than_usual":false}]},{"id":"suv","display_name":"Prime SUV","currency":"INR","distance_unit":"kilometre","time_unit":"minute","eta":-1,"distance":-1,"ride_later_enabled":"true","ride_later_allowed":true,"ride_now_allowed":true,"image":"http://d1foexe15giopy.cloudfront.net/suv.png","cancellation_policy":{"cancellation_charge":75,"currency":"INR","cancellation_charge_applies_after_time":5,"time_unit":"minute"},"fare_breakup":[{"type":"flat_rate","minimum_distance":2,"minimum_time":10,"base_fare":50,"minimum_fare":0,"cost_per_distance":10,"ride_cost_per_minute":20,"waiting_cost_per_minute":1.2,"max_waiting_time":100,"inclusive_pre_waiting_time":1,"surcharge":[],"rates_lower_than_usual":false,"rates_higher_than_usual":false},{"type":"delhi_extension","minimum_distance":4,"minimum_time":15,"base_fare":300,"minimum_fare":300,"cost_per_distance":17,"ride_cost_per_minute":2,"waiting_cost_per_minute":1.2,"max_waiting_time":100,"inclusive_pre_waiting_time":1,"surcharge":[],"rates_lower_than_usual":false,"rates_higher_than_usual":false},{"type":"haryana entry","minimum_distance":4,"minimum_time":15,"base_fare":170,"minimum_fare":170,"cost_per_distance":17,"ride_cost_per_minute":2,"waiting_cost_per_minute":1.2,"max_waiting_time":100,"inclusive_pre_waiting_time":1,"surcharge":[],"rates_lower_than_usual":false,"rates_higher_than_usual":false},{"type":"flat_rate","minimum_distance":4,"minimum_time":15,"base_fare":150,"minimum_fare":150,"cost_per_distance":17,"ride_cost_per_minute":2,"waiting_cost_per_minute":1.2,"max_waiting_time":100,"inclusive_pre_waiting_time":1,"surcharge":[],"rates_lower_than_usual":false,"rates_higher_than_usual":false}]},{"id":"auto","display_name":"Auto","currency":"INR","distance_unit":"kilometre","time_unit":"minute","eta":-1,"distance":-1,"ride_later_enabled":"false","ride_later_allowed":false,"ride_now_allowed":false,"image":"http://d1foexe15giopy.cloudfront.net/auto.png","cancellation_policy":{"cancellation_charge":25,"currency":"INR","cancellation_charge_applies_after_time":2,"time_unit":"minute"},"fare_breakup":[{"type":"flat_rate","minimum_distance":2,"minimum_time":0,"base_fare":25,"minimum_fare":0,"cost_per_distance":8,"ride_cost_per_minute":0,"waiting_cost_per_minute":1.2,"max_waiting_time":100,"inclusive_pre_waiting_time":1,"surcharge":[],"rates_lower_than_usual":false,"rates_higher_than_usual":false},{"type":"flat_rate","minimum_distance":4,"minimum_time":2,"base_fare":100,"minimum_fare":0,"cost_per_distance":10,"ride_cost_per_minute":1,"waiting_cost_per_minute":1.2,"max_waiting_time":100,"inclusive_pre_waiting_time":1,"surcharge":[],"rates_lower_than_usual":false,"rates_higher_than_usual":false},{"type":"flat_rate","minimum_distance":4,"minimum_time":1,"base_fare":29,"minimum_fare":0,"cost_per_distance":10,"ride_cost_per_minute":1,"waiting_cost_per_minute":1.2,"max_waiting_time":100,"inclusive_pre_waiting_time":1,"surcharge":[],"rates_lower_than_usual":false,"rates_higher_than_usual":false},{"type":"flat_rate","minimum_distance":4,"minimum_time":30,"base_fare":24,"minimum_fare":0,"cost_per_distance":10,"ride_cost_per_minute":1,"waiting_cost_per_minute":1.2,"max_waiting_time":100,"inclusive_pre_waiting_time":1,"surcharge":[],"rates_lower_than_usual":false,"rates_higher_than_usual":false},{"type":"flat_rate","minimum_distance":6,"minimum_time":0,"base_fare":25,"minimum_fare":0,"cost_per_distance":14,"ride_cost_per_minute":0,"waiting_cost_per_minute":1.2,"max_waiting_time":100,"inclusive_pre_waiting_time":1,"surcharge":[],"rates_lower_than_usual":false,"rates_higher_than_usual":false},{"type":"flat_rate","minimum_distance":4,"minimum_time":0,"base_fare":30,"minimum_fare":0,"cost_per_distance":11,"ride_cost_per_minute":0,"waiting_cost_per_minute":1.2,"max_waiting_time":100,"inclusive_pre_waiting_time":1,"surcharge":[],"rates_lower_than_usual":false,"rates_higher_than_usual":false}]},{"id":"lux","display_name":"Lux","currency":"INR","distance_unit":"kilometre","time_unit":"minute","eta":-1,"distance":-1,"ride_later_enabled":"false","ride_later_allowed":false,"ride_now_allowed":true,"image":"http://d1foexe15giopy.cloudfront.net/lux.png","cancellation_policy":{"cancellation_charge":75,"currency":"INR","cancellation_charge_applies_after_time":5,"time_unit":"minute"},"fare_breakup":[{"type":"delhi_extension","minimum_distance":0,"minimum_time":0,"base_fare":450,"minimum_fare":550,"cost_per_distance":25,"ride_cost_per_minute":3,"waiting_cost_per_minute":1.2,"max_waiting_time":100,"inclusive_pre_waiting_time":1,"surcharge":[],"rates_lower_than_usual":false,"rates_higher_than_usual":false},{"type":"airport drop","minimum_distance":10,"minimum_time":30,"base_fare":499,"minimum_fare":499,"cost_per_distance":30,"ride_cost_per_minute":3,"waiting_cost_per_minute":1.2,"max_waiting_time":100,"inclusive_pre_waiting_time":1,"surcharge":[],"rates_lower_than_usual":false,"rates_higher_than_usual":false},{"type":"flat_rate","minimum_distance":4,"minimum_time":0,"base_fare":750,"minimum_fare":0,"cost_per_distance":19,"ride_cost_per_minute":1,"waiting_cost_per_minute":1.2,"max_waiting_time":100,"inclusive_pre_waiting_time":1,"surcharge":[],"rates_lower_than_usual":false,"rates_higher_than_usual":false}]},{"id":"bike","display_name":"Bike","currency":"INR","distance_unit":"kilometre","time_unit":"minute","eta":-1,"distance":-1,"ride_later_enabled":"false","ride_later_allowed":false,"ride_now_allowed":false,"image":"http://d1foexe15giopy.cloudfront.net/bike.png","cancellation_policy":{"cancellation_charge":15,"currency":"INR","cancellation_charge_applies_after_time":5,"time_unit":"minute"},"fare_breakup":[{"type":"flat_rate","minimum_distance":3,"minimum_time":5,"base_fare":20,"minimum_fare":0,"cost_per_distance":5,"ride_cost_per_minute":1,"waiting_cost_per_minute":1.2,"max_waiting_time":100,"inclusive_pre_waiting_time":1,"surcharge":[],"rates_lower_than_usual":false,"rates_higher_than_usual":false}]},{"id":"kp","display_name":"Kaali Peeli","currency":"INR","distance_unit":"kilometre","time_unit":"minute","eta":-1,"distance":-1,"ride_later_enabled":"false","ride_later_allowed":false,"ride_now_allowed":false,"image":"http://d1foexe15giopy.cloudfront.net/kp.png","cancellation_policy":{"cancellation_charge":25,"currency":"INR","cancellation_charge_applies_after_time":2,"time_unit":"minute"},"fare_breakup":[{"type":"flat_rate","minimum_distance":5,"minimum_time":1,"base_fare":30,"minimum_fare":0,"cost_per_distance":11,"ride_cost_per_minute":1,"waiting_cost_per_minute":1.2,"max_waiting_time":100,"inclusive_pre_waiting_time":1,"surcharge":[],"rates_lower_than_usual":false,"rates_higher_than_usual":false},{"type":"flat_rate","minimum_distance":2,"minimum_time":1,"base_fare":31,"minimum_fare":60,"cost_per_distance":6,"ride_cost_per_minute":1,"waiting_cost_per_minute":1.2,"max_waiting_time":100,"inclusive_pre_waiting_time":1,"surcharge":[],"rates_lower_than_usual":false,"rates_higher_than_usual":false},{"type":"flat_rate","minimum_distance":4,"minimum_time":0,"base_fare":60,"minimum_fare":70,"cost_per_distance":6,"ride_cost_per_minute":1,"waiting_cost_per_minute":1.2,"max_waiting_time":100,"inclusive_pre_waiting_time":1,"surcharge":[],"rates_lower_than_usual":false,"rates_higher_than_usual":false},{"type":"flat_rate","minimum_distance":3,"minimum_time":0,"base_fare":40,"minimum_fare":50,"cost_per_distance":6,"ride_cost_per_minute":1,"waiting_cost_per_minute":1.2,"max_waiting_time":100,"inclusive_pre_waiting_time":1,"surcharge":[],"rates_lower_than_usual":false,"rates_higher_than_usual":false},{"type":"flat_rate","minimum_distance":7,"minimum_time":1,"base_fare":50,"minimum_fare":0,"cost_per_distance":13,"ride_cost_per_minute":1,"waiting_cost_per_minute":1.2,"max_waiting_time":100,"inclusive_pre_waiting_time":1,"surcharge":[],"rates_lower_than_usual":false,"rates_higher_than_usual":false},{"type":"flat_rate","minimum_distance":4,"minimum_time":1,"base_fare":20,"minimum_fare":0,"cost_per_distance":10,"ride_cost_per_minute":1,"waiting_cost_per_minute":1.2,"max_waiting_time":100,"inclusive_pre_waiting_time":1,"surcharge":[],"rates_lower_than_usual":false,"rates_higher_than_usual":false},{"type":"flat_rate","minimum_distance":4,"minimum_time":1,"base_fare":20,"minimum_fare":0,"cost_per_distance":10,"ride_cost_per_minute":10,"waiting_cost_per_minute":1.2,"max_waiting_time":100,"inclusive_pre_waiting_time":1,"surcharge":[],"rates_lower_than_usual":false,"rates_higher_than_usual":false},{"type":"flat_rate","minimum_distance":6,"minimum_time":1,"base_fare":40,"minimum_fare":0,"cost_per_distance":12,"ride_cost_per_minute":1,"waiting_cost_per_minute":1.2,"max_waiting_time":100,"inclusive_pre_waiting_time":1,"surcharge":[],"rates_lower_than_usual":false,"rates_higher_than_usual":false},{"type":"flat_rate","minimum_distance":4,"minimum_time":3,"base_fare":20,"minimum_fare":40,"cost_per_distance":4,"ride_cost_per_minute":1,"waiting_cost_per_minute":1.2,"max_waiting_time":100,"inclusive_pre_waiting_time":1,"surcharge":[],"rates_lower_than_usual":false,"rates_higher_than_usual":false}]}]
     * ride_estimate : []
     * previous_cancellation_charges : []
     */

    private HotspotZoneBean hotspot_zone;
    private List<CategoriesBean> categories;
    private List<CategoriesBean.FareBreakupBean> fareBreakup;

    public List<CategoriesBean.FareBreakupBean> getFareBreakup() {
        return fareBreakup;
    }

    public void setFareBreakup(List<CategoriesBean.FareBreakupBean> fareBreakup) {
        this.fareBreakup = fareBreakup;
    }

    private List<?> ride_estimate;
    private List<?> previous_cancellation_charges;

    public List<CategoriesBean> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoriesBean> categories) {
        this.categories = categories;
    }

    public HotspotZoneBean getHotspot_zone() {
        return hotspot_zone;
    }


    public void setHotspot_zone(HotspotZoneBean hotspot_zone) {
        this.hotspot_zone = hotspot_zone;
    }




    public List<?> getRide_estimate() {
        return ride_estimate;
    }

    public void setRide_estimate(List<?> ride_estimate) {
        this.ride_estimate = ride_estimate;
    }

    public List<?> getPrevious_cancellation_charges() {
        return previous_cancellation_charges;
    }

    public void setPrevious_cancellation_charges(List<?> previous_cancellation_charges) {
        this.previous_cancellation_charges = previous_cancellation_charges;
    }

    public static class HotspotZoneBean {
        /**
         * is_hotpot_zone : false
         */

        private boolean is_hotpot_zone;

        public boolean isIs_hotpot_zone() {
            return is_hotpot_zone;
        }

        public void setIs_hotpot_zone(boolean is_hotpot_zone) {
            this.is_hotpot_zone = is_hotpot_zone;
        }
    }

    public static class CategoriesBean {
        /**
         * id : share
         * display_name : Share
         * currency : INR
         * distance_unit : kilometre
         * time_unit : minute
         * eta : -1
         * distance : -1
         * ride_later_enabled : false
         * ride_later_allowed : false
         * ride_now_allowed : false
         * image : http://d1foexe15giopy.cloudfront.net/share.png
         * cancellation_policy : {"cancellation_charge":25,"currency":"INR","cancellation_charge_applies_after_time":2,"time_unit":"minute"}
         * fare_breakup : [{"type":"standard_rate","fare":"Save up to 50% on Mini fares","surcharge":[]}]
         */

        private String id;
        private String display_name;
        private String currency;
        private String distance_unit;
        private String time_unit;
        private int eta;
        private int distance;
        private String ride_later_enabled;
        private boolean ride_later_allowed;
        private boolean ride_now_allowed;
        private String image;
        private CancellationPolicyBean cancellation_policy;
        private List<FareBreakupBean> fare_breakup;



        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getDisplay_name() {
            return display_name;
        }

        public void setDisplay_name(String display_name) {
            this.display_name = display_name;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public String getDistance_unit() {
            return distance_unit;
        }

        public void setDistance_unit(String distance_unit) {
            this.distance_unit = distance_unit;
        }

        public String getTime_unit() {
            return time_unit;
        }

        public void setTime_unit(String time_unit) {
            this.time_unit = time_unit;
        }

        public int getEta() {
            return eta;
        }

        public void setEta(int eta) {
            this.eta = eta;
        }

        public int getDistance() {
            return distance;
        }

        public void setDistance(int distance) {
            this.distance = distance;
        }

        public String getRide_later_enabled() {
            return ride_later_enabled;
        }

        public void setRide_later_enabled(String ride_later_enabled) {
            this.ride_later_enabled = ride_later_enabled;
        }

        public boolean isRide_later_allowed() {
            return ride_later_allowed;
        }

        public void setRide_later_allowed(boolean ride_later_allowed) {
            this.ride_later_allowed = ride_later_allowed;
        }

        public boolean isRide_now_allowed() {
            return ride_now_allowed;
        }

        public void setRide_now_allowed(boolean ride_now_allowed) {
            this.ride_now_allowed = ride_now_allowed;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public CancellationPolicyBean getCancellation_policy() {
            return cancellation_policy;
        }

        public void setCancellation_policy(CancellationPolicyBean cancellation_policy) {
            this.cancellation_policy = cancellation_policy;
        }

        public List<FareBreakupBean> getFare_breakup() {
            return fare_breakup;
        }

        public void setFare_breakup(List<FareBreakupBean> fare_breakup) {
            this.fare_breakup = fare_breakup;
        }

        public static class CancellationPolicyBean {
            /**
             * cancellation_charge : 25
             * currency : INR
             * cancellation_charge_applies_after_time : 2
             * time_unit : minute
             */

            private int cancellation_charge;
            private String currency;
            private int cancellation_charge_applies_after_time;
            private String time_unit;

            public int getCancellation_charge() {
                return cancellation_charge;
            }

            public void setCancellation_charge(int cancellation_charge) {
                this.cancellation_charge = cancellation_charge;
            }

            public String getCurrency() {
                return currency;
            }

            public void setCurrency(String currency) {
                this.currency = currency;
            }

            public int getCancellation_charge_applies_after_time() {
                return cancellation_charge_applies_after_time;
            }

            public void setCancellation_charge_applies_after_time(int cancellation_charge_applies_after_time) {
                this.cancellation_charge_applies_after_time = cancellation_charge_applies_after_time;
            }

            public String getTime_unit() {
                return time_unit;
            }

            public void setTime_unit(String time_unit) {
                this.time_unit = time_unit;
            }
        }

        public static class FareBreakupBean {
            /**
             * type : standard_rate
             * fare : Save up to 50% on Mini fares
             * surcharge : []
             */

            private String type;
            private String fare;
            private String minimum_time;
            private String base_fare;
            private String minimum_fare;
            private List<?> surcharge;

            public String getMinimum_time() {
                return minimum_time;
            }

            public void setMinimum_time(String minimum_time) {
                this.minimum_time = minimum_time;
            }

            public String getBase_fare() {
                return base_fare;
            }

            public void setBase_fare(String base_fare) {
                this.base_fare = base_fare;
            }

            public String getMinimum_fare() {
                return minimum_fare;
            }

            public void setMinimum_fare(String minimum_fare) {
                this.minimum_fare = minimum_fare;
            }

            public String getType() {
                return type;
        }

            public void setType(String type) {
                this.type = type;
            }

            public String getFare() {
                return fare;
            }

            public void setFare(String fare) {
                this.fare = fare;
            }

            public List<?> getSurcharge() {
                return surcharge;
            }

            public void setSurcharge(List<?> surcharge) {
                this.surcharge = surcharge;
            }
        }
    }

/*
    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private String message;

    @SerializedName("requestKey")
    private String requestKey;

    @SerializedName("previous_cancellation_charges")
    private ArrayList<TaxiOlaInner> previous_cancellation_charges;

    @SerializedName("categories")
    private ArrayList<TaxiOlaInner> categories;

    @SerializedName("fare_breakup")
    private ArrayList<TaxiOlaInner> fare_breakup;

    @SerializedName("ride_estimate")
    private ArrayList<TaxiOlaInner> ride_estimate;

    @SerializedName("hotspot_zone")
    private TaxiOlaInner hotspot_zone;




    public ArrayList<TaxiOlaInner> getPrevious_cancellation_charges() {
        return previous_cancellation_charges;
    }

    public void setPrevious_cancellation_charges(ArrayList<TaxiOlaInner> previous_cancellation_charges) {
        this.previous_cancellation_charges = previous_cancellation_charges;
    }



    public ArrayList<TaxiOlaInner> getRide_estimate() {
        return ride_estimate;
    }

    public void setRide_estimate(ArrayList<TaxiOlaInner> ride_estimate) {
        this.ride_estimate = ride_estimate;
    }

    public TaxiOlaInner getHotspot_zone() {
        return hotspot_zone;
    }

    public void setHotspot_zone(TaxiOlaInner hotspot_zone) {
        this.hotspot_zone = hotspot_zone;
    }

    public ArrayList<TaxiOlaInner> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<TaxiOlaInner> categories) {
        this.categories = categories;
    }



    public ArrayList<TaxiOlaInner> getFare_breakup() {
        return fare_breakup;
    }

    public void setFare_breakup(ArrayList<TaxiOlaInner> fare_breakup) {
        this.fare_breakup = fare_breakup;
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
    }*/


}
