package controller;

<<<<<<< HEAD
import java.sql.ResultSet;

=======
>>>>>>> 837d3e218f57e9edbd1f812dabfab133ce834cdb
import database.DbConnection;
import models.Ticket;

public class TicketController {
    DbConnection dbConnection;

<<<<<<< HEAD
    public int insertDetails(Ticket ticket) {
        int bus_no = ticket.getbus_no();
        String seatno = ticket.getseat_no();
        int price = ticket.getticket_price();

        String insertQuery = "insert into ticket(bus_no,seat_no,ticket_price)" + "values('" + bus_no + "','" + seatno
                + "','" + price + "')";
=======
    public int insertDetails(Ticket ticket){
        int  bus_no = ticket.getbus_no();
        String seatno = ticket.getseat_no();
        int price = ticket.getticket_price();

        String insertQuery= "insert into ticket(bus_no,seat_no,ticket_price)" + "values('"+bus_no+"','"+seatno+"','"+price+"')";
>>>>>>> 837d3e218f57e9edbd1f812dabfab133ce834cdb
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(insertQuery);
        return result;

<<<<<<< HEAD
    }

    public ResultSet viewDetails(Ticket ticket) {
        String insertQuery = "select * from ticket";

        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(insertQuery);
        return result;

    }

    public int updateDetails(Ticket ticket) {
        String email = ticket.getuser_email();
        int ticket1 = ticket.getticket_no();
        String updateQuery = "update ticket set email='" + email + "' where ticket_no = '" + ticket1 + "'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(updateQuery);
        return result;
    }

    public ResultSet viewTicket(Ticket ticket) {
        String selectQuery = "select ticket.* from ticket join user on ticket.email = user.email where user.status='"
                + "active" + "'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }

=======
        
    }
>>>>>>> 837d3e218f57e9edbd1f812dabfab133ce834cdb
}
