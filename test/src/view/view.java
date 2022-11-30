package view;

import java.sql.ResultSet;
import java.sql.SQLException;

import controller.StudentController;
import models.Student;

public class view {
    public static void main(String[] args) {

        try {
            Student s1 = new Student(null, null, null, null, null, null);
            StudentController sc = new StudentController();
            ResultSet result = sc.selectStudent(s1);
            if (result.next()) {
                String fname = result.getString(1);
                String lname = result.getString(2);
                String email = result.getString(3);
                String contact = result.getString(4);
                String address = result.getString(5);
                String password = result.getString(6);
                System.out.println(fname + lname + email + contact + address + password);
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
