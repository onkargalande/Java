import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RemovePercentageColumn {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database";
        String username = "your_username";
        String password = "your_password";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement()) {

            statement.executeUpdate("ALTER TABLE student DROP COLUMN percentage");
            System.out.println("Column 'percentage' removed successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
