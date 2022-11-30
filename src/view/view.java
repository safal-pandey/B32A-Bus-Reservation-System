package view;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import controller.BusController;
import controller.UserController;
import controller.TicketController;
import models.Bus;
import models.User;
import models.Ticket;

public class view {
    public static void main(String[] args) {

        try {
            // Bus b1 = new Bus(1, 0, null, null, null);
            // BusController bc = new BusController();
            // ResultSet rSet = bc.selectdetails(b1);
            // if(rSet.next()){
            // String from = rSet.getString(1);
            // String to= rSet.getString(2);
            // System.out.println(from + to);
            // }

            /*
            */
            // Add bus
            Bus b1 = new Bus(0, 40, "KTM", "Butwal", null, "01 2121");
            BusController bc = new BusController();
            int result = bc.insertDetails(b1);
            if (result > 0) {
                JOptionPane.showMessageDialog(null, "Success");
            }

            /*
             * View Bus
             * 
             */

            /*
             * Search ticket
             * Ticket t1 = new Ticket(0, 0, null, null, null, 0);
             * TicketController tc = new TicketController();
             * ResultSet result = tc.viewDetails(t1);
             * while (result.next()) {
             * String ticket = result.getString(1);
             * String bus = result.getString(2);
             * String seat_no = result.getString(4);
             * String ticket_price = result.getString(6);
             * 
             * JOptionPane.showMessageDialog(null, ticket + " " + bus + " " + seat_no + " "
             * + ticket_price);
             * 
             * }
             */
            /*
             * Book ticket
             * 
             * Ticket t1 = new Ticket(2, 0, "khadka@gmail.com ", null, null, 0);
             * TicketController tc = new TicketController();
             * int result = tc.updateDetails(t1);
             * if (result > 0) {
             * JOptionPane.showMessageDialog(null, "Booked Success");
             * }
             */

            /*
             * View TIcket
             * Ticket t1 = new Ticket(0, 0, null, null, null, 0);
             * TicketController tc = new TicketController();
             * ResultSet result = tc.viewTicket(t1);
             * while (result.next()) {
             * String ticket = result.getString(1);
             * String bus = result.getString(2);
             * String seat_no = result.getString(4);
             * String ticket_price = result.getString(6);
             * String email = result.getString(3);
             * JOptionPane.showMessageDialog(null, ticket + " " + bus + " " + seat_no + " "
             * + ticket_price + " " + email);
             * }
             */

        } catch (

        Exception e) {
            // TODO Auto-generated catch block
            JOptionPane.showMessageDialog(null, e);
            // e.printStackTrace();

        }
    }
}
