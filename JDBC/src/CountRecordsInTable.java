import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CountRecordsInTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database";
        String username = "your_username";
        String password = "your_password";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT COUNT(*) AS record_count FROM your_table")) {

            resultSet.next();
            int recordCount = resultSet.getInt("record_count");
            System.out.println("Number of records: " + recordCount);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
