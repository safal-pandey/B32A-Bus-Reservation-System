package controller;

import database.DbConnection;
import models.Ticket;

public class TicketController {
    DbConnection dbConnection;

    public int insertDetails(Ticket ticket){
        int  bus_no = ticket.getbus_no();
        String seatno = ticket.getseat_no();
        int price = ticket.getticket_price();

        String insertQuery= "insert into ticket(bus_no,seat_no,ticket_price)" + "values('"+bus_no+"','"+seatno+"','"+price+"')";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(insertQuery);
        return result;

        
    }
}
