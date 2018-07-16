package com.olaover.inmortaltech.ola.beans;

import java.util.List;

public class TrainSearchResponse {


    /**
     * response_code : 200
     * total : 1
     * debit : 1
     * trains : [{"src_departure_time":"14:00","from_station":{"name":"GORAKHPUR","code":"GKP","lng":83.3752175,"lat":26.75845},"number":"15653","classes":[{"name":"AC CHAIR CAR","code":"CC"},{"name":"SECOND SEATING","code":"2S"},{"name":"THIRD AC","code":"3A"},{"name":"SECOND AC","code":"2A"},{"name":"FIRST AC","code":"1A"},{"name":"3rd AC ECONOMY","code":"3E"},{"name":"FIRST CLASS","code":"FC"},{"name":"SLEEPER CLASS","code":"SL"}],"to_station":{"name":"JAMMU TAWI","code":"JAT","lng":74.8799925,"lat":32.7060401},"name":"AMARNATH EXPRESS","dest_arrival_time":"12:35","travel_time":"22:35","days":[{"runs":"N","code":"MON"},{"runs":"N","code":"TUE"},{"runs":"N","code":"WED"},{"runs":"Y","code":"THU"},{"runs":"N","code":"FRI"},{"runs":"N","code":"SAT"},{"runs":"N","code":"SUN"}]}]
     */

    private int response_code;
    private int total;
    private int debit;
    private List<TrainsBean> trains;

    public int getResponse_code() {
        return response_code;
    }

    public void setResponse_code(int response_code) {
        this.response_code = response_code;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getDebit() {
        return debit;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public List<TrainsBean> getTrains() {
        return trains;
    }

    public void setTrains(List<TrainsBean> trains) {
        this.trains = trains;
    }

    public static class TrainsBean {
        /**
         * src_departure_time : 14:00
         * from_station : {"name":"GORAKHPUR","code":"GKP","lng":83.3752175,"lat":26.75845}
         * number : 15653
         * classes : [{"name":"AC CHAIR CAR","code":"CC"},{"name":"SECOND SEATING","code":"2S"},{"name":"THIRD AC","code":"3A"},{"name":"SECOND AC","code":"2A"},{"name":"FIRST AC","code":"1A"},{"name":"3rd AC ECONOMY","code":"3E"},{"name":"FIRST CLASS","code":"FC"},{"name":"SLEEPER CLASS","code":"SL"}]
         * to_station : {"name":"JAMMU TAWI","code":"JAT","lng":74.8799925,"lat":32.7060401}
         * name : AMARNATH EXPRESS
         * dest_arrival_time : 12:35
         * travel_time : 22:35
         * days : [{"runs":"N","code":"MON"},{"runs":"N","code":"TUE"},{"runs":"N","code":"WED"},{"runs":"Y","code":"THU"},{"runs":"N","code":"FRI"},{"runs":"N","code":"SAT"},{"runs":"N","code":"SUN"}]
         */

        private String src_departure_time;
        private FromStationBean from_station;
        private String number;
        private ToStationBean to_station;
        private String name;
        private String dest_arrival_time;
        private String travel_time;
        private List<ClassesBean> classes;
        private List<DaysBean> days;

        public String getSrc_departure_time() {
            return src_departure_time;
        }

        public void setSrc_departure_time(String src_departure_time) {
            this.src_departure_time = src_departure_time;
        }

        public FromStationBean getFrom_station() {
            return from_station;
        }

        public void setFrom_station(FromStationBean from_station) {
            this.from_station = from_station;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public ToStationBean getTo_station() {
            return to_station;
        }

        public void setTo_station(ToStationBean to_station) {
            this.to_station = to_station;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDest_arrival_time() {
            return dest_arrival_time;
        }

        public void setDest_arrival_time(String dest_arrival_time) {
            this.dest_arrival_time = dest_arrival_time;
        }

        public String getTravel_time() {
            return travel_time;
        }

        public void setTravel_time(String travel_time) {
            this.travel_time = travel_time;
        }

        public List<ClassesBean> getClasses() {
            return classes;
        }

        public void setClasses(List<ClassesBean> classes) {
            this.classes = classes;
        }

        public List<DaysBean> getDays() {
            return days;
        }

        public void setDays(List<DaysBean> days) {
            this.days = days;
        }

        public static class FromStationBean {
            /**
             * name : GORAKHPUR
             * code : GKP
             * lng : 83.3752175
             * lat : 26.75845
             */

            private String name;
            private String code;
            private double lng;
            private double lat;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }
        }

        public static class ToStationBean {
            /**
             * name : JAMMU TAWI
             * code : JAT
             * lng : 74.8799925
             * lat : 32.7060401
             */

            private String name;
            private String code;
            private double lng;
            private double lat;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }
        }

        public static class ClassesBean {
            /**
             * name : AC CHAIR CAR
             * code : CC
             */

            private String name;
            private String code;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }
        }

        public static class DaysBean {
            /**
             * runs : N
             * code : MON
             */

            private String runs;
            private String code;

            public String getRuns() {
                return runs;
            }

            public void setRuns(String runs) {
                this.runs = runs;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }
        }
    }
}
