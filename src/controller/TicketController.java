package controller;

import java.sql.ResultSet;

import database.DbConnection;
import models.Ticket;

public class TicketController {
    DbConnection dbConnection;

    public int insertDetails(Ticket ticket) {
        int bus_no = ticket.getBus_no();
        String seatno = ticket.getSeat_no();
        int price = ticket.getTicket_price();
        String time = ticket.getTime();

        String insertQuery = "insert into ticket(bus_no,seat_no,ticket_price,time,date)" + "values('" + bus_no + "','"
                + seatno
                + "','" + price + "','" + time + "','"+ticket.getDate()+"')";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(insertQuery);
        return result;

    }

    public int updateStatus(Ticket ticket) {
        int ticket_no = ticket.getTicket_no();
        String updateQuery = "update ticket set ticket_status='" + "active" + "' where ticket_no = '" + ticket_no + "'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(updateQuery);
        return result;
    }

    public ResultSet viewDetails(Ticket ticket) {
        String insertQuery = "select * from ticket";

        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(insertQuery);
        return result;

    }

    public ResultSet takeDetails(Ticket ticket) {
        String insertQuery = "select ticket.ticket_no,ticket.bus_no,bus.from_city,bus.to_city,ticket.seat_no,ticket.ticket_price,ticket.time,ticket.date from ticket join bus on ticket.bus_no=bus.bus_no" ;

        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(insertQuery);
        return result;

    }
    public ResultSet bookDetails(Ticket ticket) {
        String insertQuery = "select ticket.ticket_no,ticket.bus_no,bus.from_city,bus.to_city,ticket.seat_no,ticket.ticket_price,ticket.time,ticket.date from ticket join bus on ticket.bus_no=bus.bus_no where ticket.ticket_status='"+"active"+"'" ;

        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(insertQuery);
        return result;

    }

    public int updateDetails(Ticket ticket) {
        String email = ticket.getUser_email();
        int ticket1 = ticket.getTicket_no();
        String updateQuery = "update ticket set email='" + email + "' where ticket_no = '" + ticket1 + "'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(updateQuery);
        return result;
    }

    public int deselectEmail(){
        
        String query = "update ticket join user on ticket.email=user.email set ticket.email='"+"null"+"' where user.status='"+"active"+"'   ";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(query);
        return result;
    }
    public int cancelTicket(Ticket ticket){
        
        String query = "update ticket set email='"+"null"+"' where ticket_no='"+ticket.getTicket_no()+"'   ";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(query);
        return result;
    }

    public ResultSet viewTicket(Ticket ticket) {
        String selectQuery = "select ticket.ticket_no,ticket.bus_no,bus.from_city,bus.to_city,ticket.seat_no,ticket.ticket_price,ticket.time,ticket.date from ticket join bus on ticket.bus_no=bus.bus_no join user on ticket.email=user.email where user.status='"+"active"+"'";
                
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }

    public ResultSet priceTicket(Ticket ticket) {
        String selectQuery = "select ticket_price from ticket ";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;

    }

    public ResultSet filter(Ticket ticket) {
        int price = ticket.getTicket_price();
        String insertQuery = "select * from ticket where ticket_price='" + price + "'";

        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(insertQuery);
        return result;
    }

    public ResultSet browse(Ticket ticket) {
        String from = ticket.getFrom();
        String to = ticket.getTo();
        String selectQuery = "select ticket.* from ticket join bus on ticket.bus_no=bus.bus_no where bus.from_city='"
                + from + "'and bus.to_city='" + to + "'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }

    public int updateTicket(Ticket ticket){
        
        String seatno = ticket.getSeat_no();
        int price = ticket.getTicket_price();
        String time = ticket.getTime();
        String date = ticket.getDate();

        String query = "update ticket set seat_no='"+seatno+"',ticket_price='"+price+"',time='"+time+"',date='"+date+"' where ticket_status='"+"active"+"' ";
        dbConnection = new DbConnection();
        int result= dbConnection.manipulate(query);
        return result;
    }

    public int Report(Ticket ticket){
        String report = ticket.getReport();
        String query = "update ticket set report='"+report+"' where ticket_status='"+"active"+"'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(query);
        return result;

    }

    public int Rate(Ticket ticket){
        String rate = ticket.getRate();
        int id = ticket.getTicket_no();
        String query = "update ticket set rate='"+rate+"' where ticket_no='"+id+"'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(query);
        return result;
    }

    public ResultSet ticket_report(){
        String selectQuery = "select ticket.ticket_no,ticket.bus_no,bus.from_city,bus.to_city,ticket.report,ticket.rate from ticket join bus on ticket.bus_no=bus.bus_no";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }

    public int deleteTicket(Ticket ticket){
        int ticketId  = ticket.getTicket_no();
        String deleteQuery = "delete from ticket where ticket_no='"+ticketId+"'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(deleteQuery);
        return result;
    }   

    public int deleteTicketBus(Ticket ticket){
        int bus_no = ticket.getBus_no();
        String deleteQuery = "delete from ticket where bus_no='"+bus_no+"'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(deleteQuery);
        return result;
        
    }

}
