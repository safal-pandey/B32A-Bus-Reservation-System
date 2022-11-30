package models;

public class Bus {
    private int bus_no;
    private int seat_num;
    private String from_city;
    private String to_city;
    private String status;

    public Bus(int bus_no, int seat_num, String from_city, String to_city, String status) {
        this.bus_no = bus_no;
        this.seat_num = seat_num;
        this.from_city = from_city;
        this.to_city = to_city;
        this.status = status;
    }

    public int getBus_no() {
        return this.bus_no;
    }

    public void setBus_no(int bus_no) {
        this.bus_no = bus_no;
    }

    public int getSeat_num() {
        return this.seat_num;
    }

    public void setSeat_num(int seat_num) {
        this.seat_num = seat_num;
    }

    public String getFrom_city() {
        return this.from_city;
    }

    public void setFrom_city(String from_city) {
        this.from_city = from_city;
    }

    public String getTo_city() {
        return this.to_city;
    }

    public void setTo_city(String to_city) {
        this.to_city = to_city;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
