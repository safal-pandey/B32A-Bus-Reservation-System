package models;

public class Ticket {
    private int ticket_no;
    private int bus_no;
    private String user_email;
    private String seat_no;
    private String ticket_status;
    private int ticket_price;
    private String time;
    private String from;
    private String to;

    public Ticket(int ticket_no, int bus_no, String user_email, String seat_no, String ticket_status, int ticket_price,
            String time, String from, String to) {
        this.ticket_no = ticket_no;
        this.bus_no = bus_no;
        this.user_email = user_email;
        this.seat_no = seat_no;
        this.ticket_status = ticket_status;
        this.ticket_price = ticket_price;
        this.time = time;
        this.from = from;
        this.to = to;
    }

    public int getTicket_no() {
        return this.ticket_no;
    }

    public void setTicket_no(int ticket_no) {
        this.ticket_no = ticket_no;
    }

    public int getBus_no() {
        return this.bus_no;
    }

    public void setBus_no(int bus_no) {
        this.bus_no = bus_no;
    }

    public String getUser_email() {
        return this.user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getSeat_no() {
        return this.seat_no;
    }

    public void setSeat_no(String seat_no) {
        this.seat_no = seat_no;
    }

    public String getTicket_status() {
        return this.ticket_status;
    }

    public void setTicket_status(String ticket_status) {
        this.ticket_status = ticket_status;
    }

    public int getTicket_price() {
        return this.ticket_price;
    }

    public void setTicket_price(int ticket_price) {
        this.ticket_price = ticket_price;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getFrom() {
        return this.from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return this.to;
    }

    public void setTo(String to) {
        this.to = to;
    }

}