import javax.swing.*;
import java.sql.*;

public class SelectData {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/school";
        String user = "root";
        String password = "mysqlroot";

        String query = "select * from student";
        Connection connection = DriverManager.getConnection(url,user,password);
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        while (rs.next()){
            int id = rs.getInt("std_id");
            String std_name = rs.getString("std_name");
            int roll = rs.getInt("Roll_no");
            System.out.println("Id: " + id + "Name: " + std_name);

        }
        statement.close();
        connection.close();
        JOptionPane.showMessageDialog(null, "Created Successfully");

    }
}
