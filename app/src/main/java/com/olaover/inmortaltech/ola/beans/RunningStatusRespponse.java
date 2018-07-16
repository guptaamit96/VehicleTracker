package com.olaover.inmortaltech.ola.beans;

import java.util.List;

public class RunningStatusRespponse {


    /**
     * position : Train is currently at Source and late by 0 minutes.
     * debit : 2
     * route : [{"day":0,"actdep":"16:35","actarr":"00:00","scharr":"Source","actarr_date":"11 Jul 2018","latemin":0,"status":"0 mins late","has_arrived":false,"scharr_date":"11 Jul 2018","station":{"lat":26.75845,"code":"GKP","name":"GORAKHPUR","lng":83.3752175},"has_departed":false,"schdep":"16:35","distance":0},{"day":0,"actdep":"17:15","actarr":"17:13","scharr":"17:13","actarr_date":"11 Jul 2018","latemin":0,"status":"0 mins late","has_arrived":false,"scharr_date":"11 Jul 2018","station":{"lat":27.8071138,"code":"KLD","name":"KHALILABAD","lng":61.8248298},"has_departed":false,"schdep":"17:15","distance":35},{"day":0,"actdep":"17:43","actarr":"17:40","scharr":"17:40","actarr_date":"11 Jul 2018","latemin":0,"status":"0 mins late","has_arrived":false,"scharr_date":"11 Jul 2018","station":{"lat":29.06004035,"code":"BST","name":"BASTI","lng":81.1798504114246},"has_departed":false,"schdep":"17:43","distance":64},{"day":0,"actdep":"19:15","actarr":"19:10","scharr":"19:10","actarr_date":"11 Jul 2018","latemin":0,"status":"0 mins late","has_arrived":false,"scharr_date":"11 Jul 2018","station":{"lat":27.25,"code":"GD","name":"GONDA JN","lng":82},"has_departed":false,"schdep":"19:15","distance":154},{"day":0,"actdep":"20:50","actarr":"20:48","scharr":"20:48","actarr_date":"11 Jul 2018","latemin":0,"status":"0 mins late","has_arrived":false,"scharr_date":"11 Jul 2018","station":{"lat":26.9469069,"code":"BBK","name":"BARABANKI JN","lng":81.375995181223},"has_departed":false,"schdep":"20:50","distance":242},{"day":0,"actdep":"21:50","actarr":"21:40","scharr":"21:40","actarr_date":"11 Jul 2018","latemin":0,"status":"0 mins late","has_arrived":false,"scharr_date":"11 Jul 2018","station":{"lat":26.8381,"code":"LKO","name":"LUCKNOW","lng":80.9346001},"has_departed":false,"schdep":"21:50","distance":270},{"day":0,"actdep":"22:45","actarr":"22:43","scharr":"22:43","actarr_date":"11 Jul 2018","latemin":0,"status":"0 mins late","has_arrived":false,"scharr_date":"11 Jul 2018","station":{"lat":26.5,"code":"ON","name":"UNNAO JN","lng":80.5},"has_departed":false,"schdep":"22:45","distance":327},{"day":0,"actdep":"23:28","actarr":"23:23","scharr":"23:23","actarr_date":"11 Jul 2018","latemin":0,"status":"0 mins late","has_arrived":false,"scharr_date":"11 Jul 2018","station":{"lat":26.4547354,"code":"CNB","name":"KANPUR CENTRAL","lng":80.3506961},"has_departed":false,"schdep":"23:28","distance":344},{"day":1,"actdep":"06:05","actarr":"05:40","scharr":"05:40","actarr_date":"12 Jul 2018","latemin":0,"status":"0 mins late","has_arrived":false,"scharr_date":"12 Jul 2018","station":{"lat":39.0317139,"code":"NDLS","name":"NEW DELHI","lng":-90.2612233},"has_departed":false,"schdep":"06:05","distance":792},{"day":1,"actdep":"06:31","actarr":"06:29","scharr":"06:29","actarr_date":"12 Jul 2018","latemin":0,"status":"0 mins late","has_arrived":false,"scharr_date":"12 Jul 2018","station":{"lat":28.68079985,"code":"SSB","name":"SHAKURBASTI","lng":77.1273398706355},"has_departed":false,"schdep":"06:31","distance":803},{"day":1,"actdep":"06:42","actarr":"06:40","scharr":"06:40","actarr_date":"12 Jul 2018","latemin":0,"status":"0 mins late","has_arrived":false,"scharr_date":"12 Jul 2018","station":{"lat":28.6787059,"code":"NNO","name":"NANGLOI","lng":77.0671807},"has_departed":false,"schdep":"06:42","distance":810},{"day":1,"actdep":"06:56","actarr":"06:54","scharr":"06:54","actarr_date":"12 Jul 2018","latemin":0,"status":"0 mins late","has_arrived":false,"scharr_date":"12 Jul 2018","station":{"lat":28.6933239,"code":"BGZ","name":"BAHADURGARH","lng":76.9332373},"has_departed":false,"schdep":"06:56","distance":823},{"day":1,"actdep":"07:55","actarr":"07:34","scharr":"07:34","actarr_date":"12 Jul 2018","latemin":0,"status":"0 mins late","has_arrived":false,"scharr_date":"12 Jul 2018","station":{"lat":28.833333,"code":"ROK","name":"ROHTAK JN","lng":76.666667},"has_departed":false,"schdep":"07:55","distance":863},{"day":1,"actdep":"09:05","actarr":"08:45","scharr":"08:45","actarr_date":"12 Jul 2018","latemin":0,"status":"0 mins late","has_arrived":false,"scharr_date":"12 Jul 2018","station":{"lat":28.7931703,"code":"BNW","name":"BHIWANI","lng":76.1391283},"has_departed":false,"schdep":"09:05","distance":912},{"day":1,"actdep":"00:00","actarr":"10:00","scharr":"10:00","actarr_date":"12 Jul 2018","latemin":0,"status":"0 mins late","has_arrived":false,"scharr_date":"12 Jul 2018","station":{"lat":29.168807,"code":"HSR","name":"HISAR","lng":75.7461103},"has_departed":false,"schdep":"Destination","distance":972}]
     * response_code : 200
     * train : {"number":"12555","classes":[{"code":"2S","available":"Y","name":"SECOND SEATING"},{"code":"3E","available":"N","name":"3rd AC ECONOMY"},{"code":"CC","available":"N","name":"AC CHAIR CAR"},{"code":"SL","available":"Y","name":"SLEEPER CLASS"},{"code":"3A","available":"N","name":"THIRD AC"},{"code":"FC","available":"N","name":"FIRST CLASS"},{"code":"1A","available":"Y","name":"FIRST AC"},{"code":"2A","available":"Y","name":"SECOND AC"}],"name":"GORAKHDHAM EXPRESS","days":[{"runs":"Y","code":"MON"},{"runs":"Y","code":"TUE"},{"runs":"Y","code":"WED"},{"runs":"Y","code":"THU"},{"runs":"Y","code":"FRI"},{"runs":"Y","code":"SAT"},{"runs":"Y","code":"SUN"}]}
     * current_station : {"lat":26.75845,"code":"GKP","name":"GORAKHPUR","lng":83.3752175}
     * start_date : 11 Jul 2018
     */

    private String position;
    private int debit;
    private int response_code;
    private TrainBean train;
    private CurrentStationBean current_station;
    private String start_date;
    private List<RouteBean> route;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getDebit() {
        return debit;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public int getResponse_code() {
        return response_code;
    }

    public void setResponse_code(int response_code) {
        this.response_code = response_code;
    }

    public TrainBean getTrain() {
        return train;
    }

    public void setTrain(TrainBean train) {
        this.train = train;
    }

    public CurrentStationBean getCurrent_station() {
        return current_station;
    }

    public void setCurrent_station(CurrentStationBean current_station) {
        this.current_station = current_station;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public List<RouteBean> getRoute() {
        return route;
    }

    public void setRoute(List<RouteBean> route) {
        this.route = route;
    }

    public static class TrainBean {
        /**
         * number : 12555
         * classes : [{"code":"2S","available":"Y","name":"SECOND SEATING"},{"code":"3E","available":"N","name":"3rd AC ECONOMY"},{"code":"CC","available":"N","name":"AC CHAIR CAR"},{"code":"SL","available":"Y","name":"SLEEPER CLASS"},{"code":"3A","available":"N","name":"THIRD AC"},{"code":"FC","available":"N","name":"FIRST CLASS"},{"code":"1A","available":"Y","name":"FIRST AC"},{"code":"2A","available":"Y","name":"SECOND AC"}]
         * name : GORAKHDHAM EXPRESS
         * days : [{"runs":"Y","code":"MON"},{"runs":"Y","code":"TUE"},{"runs":"Y","code":"WED"},{"runs":"Y","code":"THU"},{"runs":"Y","code":"FRI"},{"runs":"Y","code":"SAT"},{"runs":"Y","code":"SUN"}]
         */

        private String number;
        private String name;
        private List<ClassesBean> classes;
        private List<DaysBean> days;

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
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

        public static class ClassesBean {
            /**
             * code : 2S
             * available : Y
             * name : SECOND SEATING
             */

            private String code;
            private String available;
            private String name;

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getAvailable() {
                return available;
            }

            public void setAvailable(String available) {
                this.available = available;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        public static class DaysBean {
            /**
             * runs : Y
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

    public static class CurrentStationBean {
        /**
         * lat : 26.75845
         * code : GKP
         * name : GORAKHPUR
         * lng : 83.3752175
         */

        private double lat;
        private String code;
        private String name;
        private double lng;

        public double getLat() {
            return lat;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getLng() {
            return lng;
        }

        public void setLng(double lng) {
            this.lng = lng;
        }
    }

    public static class RouteBean {
        /**
         * day : 0
         * actdep : 16:35
         * actarr : 00:00
         * scharr : Source
         * actarr_date : 11 Jul 2018
         * latemin : 0
         * status : 0 mins late
         * has_arrived : false
         * scharr_date : 11 Jul 2018
         * station : {"lat":26.75845,"code":"GKP","name":"GORAKHPUR","lng":83.3752175}
         * has_departed : false
         * schdep : 16:35
         * distance : 0
         */

        private int day;
        private String actdep;
        private String actarr;
        private String scharr;
        private String actarr_date;
        private int latemin;
        private String status;
        private boolean has_arrived;
        private String scharr_date;
        private StationBean station;
        private boolean has_departed;
        private String schdep;
        private int distance;

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public String getActdep() {
            return actdep;
        }

        public void setActdep(String actdep) {
            this.actdep = actdep;
        }

        public String getActarr() {
            return actarr;
        }

        public void setActarr(String actarr) {
            this.actarr = actarr;
        }

        public String getScharr() {
            return scharr;
        }

        public void setScharr(String scharr) {
            this.scharr = scharr;
        }

        public String getActarr_date() {
            return actarr_date;
        }

        public void setActarr_date(String actarr_date) {
            this.actarr_date = actarr_date;
        }

        public int getLatemin() {
            return latemin;
        }

        public void setLatemin(int latemin) {
            this.latemin = latemin;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public boolean isHas_arrived() {
            return has_arrived;
        }

        public void setHas_arrived(boolean has_arrived) {
            this.has_arrived = has_arrived;
        }

        public String getScharr_date() {
            return scharr_date;
        }

        public void setScharr_date(String scharr_date) {
            this.scharr_date = scharr_date;
        }

        public StationBean getStation() {
            return station;
        }

        public void setStation(StationBean station) {
            this.station = station;
        }

        public boolean isHas_departed() {
            return has_departed;
        }

        public void setHas_departed(boolean has_departed) {
            this.has_departed = has_departed;
        }

        public String getSchdep() {
            return schdep;
        }

        public void setSchdep(String schdep) {
            this.schdep = schdep;
        }

        public int getDistance() {
            return distance;
        }

        public void setDistance(int distance) {
            this.distance = distance;
        }

        public static class StationBean {
            /**
             * lat : 26.75845
             * code : GKP
             * name : GORAKHPUR
             * lng : 83.3752175
             */

            private double lat;
            private String code;
            private String name;
            private double lng;

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }
        }
    }
}
