import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database";
        String username = "your_username";
        String password = "your_password";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM example WHERE id = ?")) {

            preparedStatement.setInt(1, 1);
            preparedStatement.executeUpdate();

            System.out.println("Data deleted successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
