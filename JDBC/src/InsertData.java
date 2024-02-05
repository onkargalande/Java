import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database";
        String username = "your_username";
        String password = "your_password";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO example (id, name) VALUES (?, ?)")) {

            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, "John Doe");
            preparedStatement.executeUpdate();

            System.out.println("Data inserted successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
