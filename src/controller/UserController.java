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
        String contact = user.getContact();
        String insertQuery = "insert into user(username,email,dob,pass,sq,contact)" + "values('" + username
                + "','"
                + email + "','" + dob + "','" + pass + "','" + sq + "','" + contact + "')";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(insertQuery);
        return result;
    }

    public ResultSet login(User user) {
        String email = user.getEmail();
        String pass = user.getPass();
        String selectQuery = "select * from user where email='" + email + "' and pass='" + pass + "'";
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

    public ResultSet selectdetails(User user) {
        String selectQuery = "select * from user where status='" + "active" + "'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;

    }

    public ResultSet selectEmail(User user) {
        String selectQuery = "select email,username,report from user where status='" + "active" + "'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;

    }

    public int resetPass(User user) {
        String email = user.getEmail();
        String pass = user.getPass();
        String sq = user.getSq();

        String resetQuery = "update user set pass='" + pass + "' where email='" + email + "' and sq='" + sq + "'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(resetQuery);
        return result;
    }

    public ResultSet passset(User user) {
        String pass = user.getPass();
        String query = "select pass from user where status='" + "active" + "' and pass='" + pass + "'";
        dbConnection = new DbConnection();
        ResultSet rs = dbConnection.retrieve(query);
        return rs;
    }

    public int changePass(User user){
        String pass = user.getPass();
        String query = "update user set pass='"+pass+"' where status='"+"active"+"'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(query);
        return result;

    }

    public int updateProfile(User user){
        String name = user.getUsername();
        String phone = user.getContact();
        String dob = user.getDob();
        String email = user.getEmail();

        String query = "update user set username='"+name+"',contact='"+phone+"',dob='"+dob+"' where email='"+email+"'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(query);
        return result;
    }

    public int logout(){
        String query = "update user set status='"+"inactive"+"' where status='"+"active"+"'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(query);
        return result;
    }

    public int delete(){
        String query = "delete from user where status='"+"active"+"'";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(query);
        return result;
    }

    public int contactUs(User user){
        String msg = user.getContact_us();
        String email = user.getEmail();
        String query = "update user set report='"+msg+"' where email='"+email+"' ";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(query);
        return result;
    }

    public ResultSet getMsg(){
        String selectQuery = "select email,username,report from user";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }
    
    
    

    
    
}
