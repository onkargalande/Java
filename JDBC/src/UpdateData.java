import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database";
        String username = "your_username";
        String password = "your_password";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement preparedStatement = connection.prepareStatement("UPDATE example SET name = ? WHERE id = ?")) {

            preparedStatement.setString(1, "Jane Doe");
            preparedStatement.setInt(2, 1);
            preparedStatement.executeUpdate();

            System.out.println("Data updated successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
