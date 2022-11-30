package models;

public class Ticket {
    private int ticket_no;
    private int bus_no;
    private String user_email;
    private String seat_no;
    private String ticket_status;
    private int ticket_price;

    // creation of public getter and setter

    public int getticket_no() {
        return this.ticket_no;
    }

    public int getbus_no() {
        return this.bus_no;
    }

    public String getuser_email() {
        return this.user_email;
    }

    public String getseat_no() {
        return this.seat_no;
    }

    public String getticket_status() {
        return this.ticket_status;
    }

    public int getticket_price() {
        return this.ticket_price;
    }

    public void setticket_no(int newticket_no) {
        this.ticket_no = newticket_no;
    }

    public void setbus_no(int newbus_no) {
        this.bus_no = newbus_no;
    }

    public void setuser_email(String newuser_email) {
        this.user_email = newuser_email;
    }

    public void setseat_no(String newseat_no) {
        this.seat_no = newseat_no;
    }

    public void setticket_status(String newticket_status) {
        this.ticket_status = newticket_status;
    }

    public void setticket_price(int newticket_price) {
        this.ticket_price = newticket_price;
    }

    public Ticket(int ticket_no,
            int bus_no,
            String user_email,
            String seat_no,
            String ticket_status,
            int ticket_price) {
        this.ticket_no = ticket_no;
        this.bus_no = bus_no;
        this.user_email = user_email;
        this.seat_no = seat_no;
        this.ticket_price = ticket_price;
        this.ticket_status = ticket_status;

    }
}
