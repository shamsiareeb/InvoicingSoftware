package DButil;

import java.sql.Connection;
import java.sql.DriverManager;

public class LoadDriver {
    private static Connection con;
    public static Connection createConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getConstructor().newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db'","root","root");
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return con;
    }
    public static void main(String[] args) {
        con = createConnection();
    }
}