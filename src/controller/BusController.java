package controller;

import java.sql.ResultSet;

import database.DbConnection;
import models.Bus;

public class BusController {
    DbConnection dbConnection;

    public ResultSet selectdetails(Bus bus){
        int bus_no = bus.getBus_no();

        String selectQuery = "select from_city,to_city from bus where bus_no = '"+bus_no+"'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }
}
