package com.olaover.inmortaltech.ola.beans;

import java.util.List;

public class TrainRoutesListResponse {

    /**
     * trains : [{"name":"SHIV GANGA EXP","classes":[{"name":"SECOND SEATING","code":"2S","available":"N"},{"name":"SLEEPER CLASS","code":"SL","available":"Y"},{"name":"FIRST AC","code":"1A","available":"Y"},{"name":"FIRST CLASS","code":"FC","available":"N"},{"name":"AC CHAIR CAR","code":"CC","available":"N"},{"name":"3rd AC ECONOMY","code":"3E","available":"N"},{"name":"THIRD AC","code":"3A","available":"Y"},{"name":"SECOND AC","code":"2A","available":"Y"}],"days":[{"runs":"Y","code":"MON"},{"runs":"Y","code":"TUE"},{"runs":"Y","code":"WED"},{"runs":"Y","code":"THU"},{"runs":"Y","code":"FRI"},{"runs":"Y","code":"SAT"},{"runs":"Y","code":"SUN"}],"number":"12559"},{"name":"SHIVGANGA","classes":[{"name":"SECOND SEATING","code":"2S","available":"N"},{"name":"SLEEPER CLASS","code":"SL","available":"Y"},{"name":"FIRST AC","code":"1A","available":"Y"},{"name":"FIRST CLASS","code":"FC","available":"N"},{"name":"AC CHAIR CAR","code":"CC","available":"N"},{"name":"3rd AC ECONOMY","code":"3E","available":"N"},{"name":"THIRD AC","code":"3A","available":"Y"},{"name":"SECOND AC","code":"2A","available":"Y"}],"days":[{"runs":"Y","code":"MON"},{"runs":"Y","code":"TUE"},{"runs":"Y","code":"WED"},{"runs":"Y","code":"THU"},{"runs":"Y","code":"FRI"},{"runs":"Y","code":"SAT"},{"runs":"Y","code":"SUN"}],"number":"12560"},{"name":"NGP BSP SHIVNATH EXP","classes":[{"name":"SECOND SEATING","code":"2S","available":"N"},{"name":"SLEEPER CLASS","code":"SL","available":"Y"},{"name":"FIRST AC","code":"1A","available":"Y"},{"name":"FIRST CLASS","code":"FC","available":"N"},{"name":"AC CHAIR CAR","code":"CC","available":"N"},{"name":"3rd AC ECONOMY","code":"3E","available":"N"},{"name":"THIRD AC","code":"3A","available":"Y"},{"name":"SECOND AC","code":"2A","available":"Y"}],"days":[{"runs":"Y","code":"MON"},{"runs":"Y","code":"TUE"},{"runs":"Y","code":"WED"},{"runs":"Y","code":"THU"},{"runs":"Y","code":"FRI"},{"runs":"Y","code":"SAT"},{"runs":"Y","code":"SUN"}],"number":"18240"},{"name":"KLK-SML SHIVALIK DELUXE","classes":[{"name":"SECOND SEATING","code":"2S","available":"N"},{"name":"SLEEPER CLASS","code":"SL","available":"N"},{"name":"FIRST AC","code":"1A","available":"N"},{"name":"FIRST CLASS","code":"FC","available":"N"},{"name":"AC CHAIR CAR","code":"CC","available":"Y"},{"name":"3rd AC ECONOMY","code":"3E","available":"N"},{"name":"THIRD AC","code":"3A","available":"N"},{"name":"SECOND AC","code":"2A","available":"N"}],"days":[{"runs":"Y","code":"MON"},{"runs":"Y","code":"TUE"},{"runs":"Y","code":"WED"},{"runs":"Y","code":"THU"},{"runs":"Y","code":"FRI"},{"runs":"Y","code":"SAT"},{"runs":"Y","code":"SUN"}],"number":"52451"},{"name":"KLK-SML SHIVALIK DELUX","classes":[{"name":"SECOND SEATING","code":"2S","available":"N"},{"name":"SLEEPER CLASS","code":"SL","available":"N"},{"name":"FIRST AC","code":"1A","available":"N"},{"name":"FIRST CLASS","code":"FC","available":"N"},{"name":"AC CHAIR CAR","code":"CC","available":"Y"},{"name":"3rd AC ECONOMY","code":"3E","available":"N"},{"name":"THIRD AC","code":"3A","available":"N"},{"name":"SECOND AC","code":"2A","available":"N"}],"days":[{"runs":"Y","code":"MON"},{"runs":"Y","code":"TUE"},{"runs":"Y","code":"WED"},{"runs":"Y","code":"THU"},{"runs":"Y","code":"FRI"},{"runs":"Y","code":"SAT"},{"runs":"Y","code":"SUN"}],"number":"52452"},{"name":"GAD NGP SHIVNATH EXP","classes":[{"name":"SECOND SEATING","code":"2S","available":"N"},{"name":"SLEEPER CLASS","code":"SL","available":"Y"},{"name":"FIRST AC","code":"1A","available":"Y"},{"name":"FIRST CLASS","code":"FC","available":"N"},{"name":"AC CHAIR CAR","code":"CC","available":"N"},{"name":"3rd AC ECONOMY","code":"3E","available":"N"},{"name":"THIRD AC","code":"3A","available":"Y"},{"name":"SECOND AC","code":"2A","available":"Y"}],"days":[{"runs":"Y","code":"MON"},{"runs":"Y","code":"TUE"},{"runs":"Y","code":"WED"},{"runs":"Y","code":"THU"},{"runs":"Y","code":"FRI"},{"runs":"Y","code":"SAT"},{"runs":"Y","code":"SUN"}],"number":"18239"}]
     * debit : 1
     * response_code : 200
     */

    private int debit;
    private int response_code;
    private List<TrainsBean> trains;

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

    public List<TrainsBean> getTrains() {
        return trains;
    }

    public void setTrains(List<TrainsBean> trains) {
        this.trains = trains;
    }

    public static class TrainsBean {
        /**
         * name : SHIV GANGA EXP
         * classes : [{"name":"SECOND SEATING","code":"2S","available":"N"},{"name":"SLEEPER CLASS","code":"SL","available":"Y"},{"name":"FIRST AC","code":"1A","available":"Y"},{"name":"FIRST CLASS","code":"FC","available":"N"},{"name":"AC CHAIR CAR","code":"CC","available":"N"},{"name":"3rd AC ECONOMY","code":"3E","available":"N"},{"name":"THIRD AC","code":"3A","available":"Y"},{"name":"SECOND AC","code":"2A","available":"Y"}]
         * days : [{"runs":"Y","code":"MON"},{"runs":"Y","code":"TUE"},{"runs":"Y","code":"WED"},{"runs":"Y","code":"THU"},{"runs":"Y","code":"FRI"},{"runs":"Y","code":"SAT"},{"runs":"Y","code":"SUN"}]
         * number : 12559
         */

        private String name;
        private String number;
        private List<ClassesBean> classes;
        private List<DaysBean> days;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
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
             * name : SECOND SEATING
             * code : 2S
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
}
