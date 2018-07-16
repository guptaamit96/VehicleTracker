package com.olaover.inmortaltech.ola.beans;

import java.util.List;

public class TrainRoutesDetaiilsResponse {


    /**
     * train : {"number":"12006","name":"KLK-NDLS SHATABDI EXP","days":[{"runs":"Y","code":"MON"},{"runs":"Y","code":"TUE"},{"runs":"Y","code":"WED"},{"runs":"Y","code":"THU"},{"runs":"Y","code":"FRI"},{"runs":"Y","code":"SAT"},{"runs":"Y","code":"SUN"}],"classes":[{"name":"SLEEPER CLASS","code":"SL","available":"N"},{"name":"THIRD AC","code":"3A","available":"N"},{"name":"FIRST CLASS","code":"FC","available":"N"},{"name":"SECOND AC","code":"2A","available":"N"},{"name":"FIRST AC","code":"1A","available":"N"},{"name":"3rd AC ECONOMY","code":"3E","available":"N"},{"name":"AC CHAIR CAR","code":"CC","available":"Y"},{"name":"SECOND SEATING","code":"2S","available":"N"}]}
     * route : [{"station":{"name":"KALKA","lat":30.8366771,"code":"KLK","lng":76.9369298},"no":1,"scharr":"SOURCE","halt":-1,"distance":0,"day":1,"schdep":"06:15"},{"station":{"name":"CHANDIGARH","lat":30.7194022,"code":"CDG","lng":76.7646552},"no":2,"scharr":"06:45","halt":8,"distance":37,"day":1,"schdep":"06:53"},{"station":{"name":"AMBALA CANT JN","lat":4.4571909,"code":"UMB","lng":-75.200602},"no":3,"scharr":"07:33","halt":5,"distance":105,"day":1,"schdep":"07:38"},{"station":{"name":"KURUKSHETRA JN","lat":30,"code":"KKDE","lng":76.75},"no":4,"scharr":"08:09","halt":2,"distance":146,"day":1,"schdep":"08:11"},{"station":{"name":"NEW DELHI","lat":39.0317139,"code":"NDLS","lng":-90.2612233},"no":5,"scharr":"10:20","halt":-1,"distance":303,"day":1,"schdep":"DEST"}]
     * response_code : 200
     * debit : 1
     */

    private TrainBean train;
    private int response_code;
    private int debit;
    private List<RouteBean> route;

    public TrainBean getTrain() {
        return train;
    }

    public void setTrain(TrainBean train) {
        this.train = train;
    }

    public int getResponse_code() {
        return response_code;
    }

    public void setResponse_code(int response_code) {
        this.response_code = response_code;
    }

    public int getDebit() {
        return debit;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public List<RouteBean> getRoute() {
        return route;
    }

    public void setRoute(List<RouteBean> route) {
        this.route = route;
    }

    public static class TrainBean {
        /**
         * number : 12006
         * name : KLK-NDLS SHATABDI EXP
         * days : [{"runs":"Y","code":"MON"},{"runs":"Y","code":"TUE"},{"runs":"Y","code":"WED"},{"runs":"Y","code":"THU"},{"runs":"Y","code":"FRI"},{"runs":"Y","code":"SAT"},{"runs":"Y","code":"SUN"}]
         * classes : [{"name":"SLEEPER CLASS","code":"SL","available":"N"},{"name":"THIRD AC","code":"3A","available":"N"},{"name":"FIRST CLASS","code":"FC","available":"N"},{"name":"SECOND AC","code":"2A","available":"N"},{"name":"FIRST AC","code":"1A","available":"N"},{"name":"3rd AC ECONOMY","code":"3E","available":"N"},{"name":"AC CHAIR CAR","code":"CC","available":"Y"},{"name":"SECOND SEATING","code":"2S","available":"N"}]
         */

        private String number;
        private String name;
        private List<DaysBean> days;
        private List<ClassesBean> classes;

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

        public List<DaysBean> getDays() {
            return days;
        }

        public void setDays(List<DaysBean> days) {
            this.days = days;
        }

        public List<ClassesBean> getClasses() {
            return classes;
        }

        public void setClasses(List<ClassesBean> classes) {
            this.classes = classes;
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

        public static class ClassesBean {
            /**
             * name : SLEEPER CLASS
             * code : SL
             * available : N
             */

            private String name;
            private String code;
            private String available;

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

            public String getAvailable() {
                return available;
            }

            public void setAvailable(String available) {
                this.available = available;
            }
        }
    }

    public static class RouteBean {
        /**
         * station : {"name":"KALKA","lat":30.8366771,"code":"KLK","lng":76.9369298}
         * no : 1
         * scharr : SOURCE
         * halt : -1
         * distance : 0
         * day : 1
         * schdep : 06:15
         */

        private StationBean station;
        private int no;
        private String scharr;
        private int halt;
        private int distance;
        private int day;
        private String schdep;

        public StationBean getStation() {
            return station;
        }

        public void setStation(StationBean station) {
            this.station = station;
        }

        public int getNo() {
            return no;
        }

        public void setNo(int no) {
            this.no = no;
        }

        public String getScharr() {
            return scharr;
        }

        public void setScharr(String scharr) {
            this.scharr = scharr;
        }

        public int getHalt() {
            return halt;
        }

        public void setHalt(int halt) {
            this.halt = halt;
        }

        public int getDistance() {
            return distance;
        }

        public void setDistance(int distance) {
            this.distance = distance;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public String getSchdep() {
            return schdep;
        }

        public void setSchdep(String schdep) {
            this.schdep = schdep;
        }

        public static class StationBean {
            /**
             * name : KALKA
             * lat : 30.8366771
             * code : KLK
             * lng : 76.9369298
             */

            private String name;
            private double lat;
            private String code;
            private double lng;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

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

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }
        }
    }
}
