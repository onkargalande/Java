import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteEmployeesStartingWithA {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database";
        String username = "your_username";
        String password = "your_password";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM employees WHERE ename LIKE 'A%'")) {

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " record(s) deleted successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
