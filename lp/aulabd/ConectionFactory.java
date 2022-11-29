package aulabd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionFactory {

    public static Connection createConnection() {
        String url = "jdbc:mysql://localhost:3306/aulabd";
        String user = "root";
        String pwd = "";

        try {
            // correga o driver do mysql
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, pwd);
            System.out.println("Conected!!!");
            return conn;

        } catch (ClassNotFoundException e) {
            System.out.println("Error: Driver not found");
        } catch (SQLException e) {
            System.out.println("Error: Connection failed!!");
            e.printStackTrace();
        }

        return null;
    }

}