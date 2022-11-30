package database;



import javax.swing.*;

import java.sql.*;



public class DbConnection {

    public Connection connection;

    PreparedStatement pst;

    ResultSet resultSet;

    int value;



    public DbConnection(){

        try {

            String username = "root";

            String password = "Appleapple!1";

            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(

                    "jdbc:mysql://localhost:3306/logindb",username,password);



                    if(connection!=null){

                        System.out.println("Connected to database");

                    }else{

                        System.out.println("Error connecting to database");

                    }

            pst = connection.prepareStatement("select * from user where username=? and password=?");

        }catch (Exception e){

            e.printStackTrace();

        }

    }



    // Via the use of sql query

    // insert, update and delete

    public int manipulate(String query){

        try {

            value = pst.executeUpdate(query);

            connection.close();

        }catch (SQLIntegrityConstraintViolationException ex){

            JOptionPane.showMessageDialog(null, "These details already exist!");

        }catch (SQLException e){

            e.printStackTrace();

        }

        return value;

    }



    public ResultSet retrieve(String query){

        try {

            resultSet = pst.executeQuery(query);

        }catch (SQLException e){

            e.printStackTrace();

        }

        return resultSet;

    }
public Boolean checkLogin(String uname, String pwd) {
        try {

            pst.setString(1, uname); //this replaces the 1st  "?" in the query for username
            pst.setString(2, pwd);    //this replaces the 2st  "?" in the query for password
            //executes the prepared statement
            resultSet = pst.executeQuery();
            if (resultSet.next()) {
                System.out.print("Success");
                //TRUE if the query founds any corresponding data
                return true;
            } else {
                System.out.print("Failed");
                
                return false;
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("error while validating" + e);
            return false;
        }
    }


    public static void main(String[] args) {

        new DbConnection();

    }

}