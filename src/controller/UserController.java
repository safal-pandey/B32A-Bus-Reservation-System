package controller;

import java.sql.ResultSet;

import database.DbConnection;
import models.User;

public class UserController {
    DbConnection dbConnection;

    public int insertDetails(User user) {
        String username = user.getUsername();
        String email = user.getEmail();
        String dob = user.getDob();
        String pass = user.getPass();
        String cpass = user.getCpass();
        String sq = user.getSq();
        String insertQuery = "insert into user(username,email,dob,pass,cpass,sq)" + "values('" + username + "','"
                + email + "','" + dob + "','" + pass + "','" + cpass + "','" + sq + "')";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(insertQuery);
        return result;
    }

    public ResultSet login(User user) {
        String email = user.getEmail();
        String pass = user.getPass();
        String selectQuery = "select * from user where email='" + email + "'+pass='" + pass + "'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }

    public int updatestatus(User user) {
        String email = user.getEmail();
        String updateQuery = "update user set status='" + "active" + "' where email='" + email + "'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(updateQuery);
        return result;
    }

    public int changestatus(User user) {
        // String email = user.getEmail();
        String updateQuery = "update user set status='" + "inactive" + "' where status='" + "active" + "'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(updateQuery);
        return result;
    }
}