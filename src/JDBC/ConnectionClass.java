package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class  ConnectionClass
{
    public static void main(String[] args)
    {


    }


    private Connection openConnection() throws SQLException, ClassNotFoundException {
        //DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
//        (new oracle.jdbc.OracleDriver());

        String host = "localhost";
        String port = "1521";
        String dbName = "db11g";
        String userName = "DSHARMA";
        String password = "chulbul6";

        // Construct the JDBC URL
                   String dbURL = "jdbc:oracle:thin:@" + host + ":" + port + ":" + dbName;
                 return DriverManager.getConnection(dbURL, userName, password);

    }
}
