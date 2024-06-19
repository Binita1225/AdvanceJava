import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/school";
        String user = "root";
        String password = "mysqlroot";

        String query = "insert into student (std_id, std_name, Roll_no, User_Name, Password) values (1, 'Binita', 1, 'Binita', 'xyz')";
        String query1 = "insert into student (std_id, std_name, Roll_no, User_Name, Password) values (2, 'Shweta', 2, 'Shweta', 'xyz')";
        String query2 = "insert into student (std_id, std_name, Roll_no, User_Name, Password) values (3, 'Praashna', 3, 'Praashna', 'xyz')";
        Connection connection = DriverManager.getConnection(url,user,password);
        Statement statement = connection.createStatement();
        statement.executeUpdate(query);
        statement.close();
        connection.close();
        JOptionPane.showMessageDialog(null, "Created Successfully");

    }
}