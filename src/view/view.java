package view;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import controller.BusController;
import controller.StudentController;
import controller.TicketController;
import models.Bus;
import models.Student;
import models.Ticket;

public class view {
    public static void main(String[] args) {

        try {
            Bus b1 = new Bus(1, 0, null, null, null);
            BusController bc = new BusController();
            ResultSet rSet = bc.selectdetails(b1);
            if(rSet.next()){
                String from = rSet.getString(1);
                String to= rSet.getString(2);
                System.out.println(from + to);
            }
            
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
