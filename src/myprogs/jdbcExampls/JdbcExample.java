package myprogs.jdbcExampls;

import java.sql.*;

public class JdbcExample {
    public static void main(String[] args) {
        try {
            //Loading driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String url = "jdbc:sqlserver://DESKTOP-5LSI3B5:1433;databaseName=mydb";
            String username = "DESKTOP-5LSI3B5\\DELL E5450";
            String password = "";
            //creating connection
            Connection con = DriverManager.getConnection(url, username, password);

            Statement s = con.createStatement(); //creating statement

            ResultSet rs = s.executeQuery("select * from Employee"); //executing statement

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }

            con.close(); //closing connection
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
	