package JDBCTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {

    public static void main(String[] args) {
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/may_bank",
                            "postgres", "madlim");
            selectData(c);
            insertData(c);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
    }

    public static void selectData(Connection connection) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("select * from student");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int id = rs.getInt("id");
            String firstName = rs.getString("fName");
            String lastName = rs.getString("lName");
            String city = rs.getString("city");
            System.out.println(id + " " + firstName + " " + lastName + " " + city);
        }
        rs.close();
        ps.close();
    }

    public static void insertData(Connection connection) throws SQLException {
        Statement stmt = null;
        stmt = connection.createStatement();
        String sql = "insert into student values (2, 'Ahmad', 'Syamil', 'Seremban')";
        stmt.executeUpdate(sql);
        stmt.close();
        System.out.println("Record created succesfully");
    }
}
