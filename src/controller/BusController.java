package controller;

import java.sql.ResultSet;

import database.DbConnection;
import models.Bus;

public class BusController {
    DbConnection dbConnection;

    public ResultSet selectdetails(Bus bus) {
        int bus_no = bus.getBus_no();

        String selectQuery = "select from_city,to_city from bus where bus_no = '" + bus_no + "'";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(selectQuery);
        return result;
    }

    public int insertDetails(Bus bus) {
        String fromcity = bus.getFrom_city();
        String tocity = bus.getTo_city();
        String license_no = bus.getLicense_no();
        int seat_num = bus.getSeat_num();

        String insertDetails = "insert into bus(from_city,to_city,license_no,seat_num)" + "values('" + fromcity + "','"
                + tocity + "','" + license_no + "','" + seat_num + "')";
        dbConnection = new DbConnection();
        int result = dbConnection.manipulate(insertDetails);
        return result;
    }

    public ResultSet viewDetails(Bus bus) {
        String viewdetails = "select * from bus";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(viewdetails);
        return result;
    }

    public ResultSet viewBus(Bus bus) {
        String viewdetails = "select from_city,to_city from bus";
        dbConnection = new DbConnection();
        ResultSet result = dbConnection.retrieve(viewdetails);
        return result;
    }

}
