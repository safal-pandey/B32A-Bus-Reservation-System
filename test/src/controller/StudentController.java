package controller;

import java.sql.ResultSet;

import database.DbConnection;
import models.Student;

public class StudentController {
    DbConnection dbConnection;

    public ResultSet selectStudent(Student student) {

        String selectQuery = "select * from user where status='" + "active" + "' ";
        // System.out.println(insertQuery);
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }

    // public int updateStudent(Student student) {
    // int id = student.getStd_id();
    // String name = student.getStd_name();
    // String updateQuery = String.format(
    // "update tbl_student set std_name='%s' where std_id = %d", name, id);
    // dbConnection = new DbConnection();
    // int result = dbConnection.manipulate(updateQuery);
    // return result;
    // }

}