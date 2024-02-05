import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DisplayCSDeptEmployees {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database";
        String username = "your_username";
        String password = "your_password";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT eno, ename, department, sal FROM employees WHERE department = 'Computer Science'");
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                System.out.println("Employee Number: " + resultSet.getInt("eno"));
                System.out.println("Employee Name: " + resultSet.getString("ename"));
                System.out.println("Department: " + resultSet.getString("department"));
                System.out.println("Salary: " + resultSet.getDouble("sal"));
                System.out.println("---------------");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
