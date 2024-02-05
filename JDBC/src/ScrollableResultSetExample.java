import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ScrollableResultSetExample {

    private static final String URL = "jdbc:mysql://localhost:3306/your_database";
    private static final String USERNAME = "your_username";
    private static final String PASSWORD = "your_password";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            createEmpTable(connection);

            // Insert some sample data
            insertSampleData(connection);

            // Scrollable ResultSet Example
            scrollableResultSetExample(connection);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createEmpTable(Connection connection) throws SQLException {
        try (PreparedStatement statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS Emp (eno INT PRIMARY KEY, ename VARCHAR(255), sal DOUBLE)")) {
            statement.executeUpdate();
        }
    }

    private static void insertSampleData(Connection connection) throws SQLException {
        try (PreparedStatement statement = connection.prepareStatement("INSERT INTO Emp VALUES (?, ?, ?)")) {
            statement.setInt(1, 1);
            statement.setString(2, "John Doe");
            statement.setDouble(3, 50000.0);
            statement.executeUpdate();

            statement.setInt(1, 2);
            statement.setString(2, "Jane Doe");
            statement.setDouble(3, 60000.0);
            statement.executeUpdate();

            statement.setInt(1, 3);
            statement.setString(2, "Bob Smith");
            statement.setDouble(3, 75000.0);
            statement.executeUpdate();
        }
    }

    private static void scrollableResultSetExample(Connection connection) throws SQLException {
        try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Emp", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            // Move to the first record
            moveFirst(resultSet);

            // Move to the next record
            moveNext(resultSet);

            // Move to the previous record
            movePrevious(resultSet);

            // Move to the last record
            moveLast(resultSet);
        }
    }

    private static void moveFirst(ResultSet resultSet) throws SQLException {
        System.out.println("Moving to the First Record:");
        if (resultSet.first()) {
            displayRecord(resultSet);
        } else {
            System.out.println("No records found.");
        }
    }

    private static void moveNext(ResultSet resultSet) throws SQLException {
        System.out.println("Moving to the Next Record:");
        if (resultSet.next()) {
            displayRecord(resultSet);
        } else {
            System.out.println("No more records found.");
        }
    }

    private static void movePrevious(ResultSet resultSet) throws SQLException {
        System.out.println("Moving to the Previous Record:");
        if (resultSet.previous()) {
            displayRecord(resultSet);
        } else {
            System.out.println("No more records found.");
        }
    }

    private static void moveLast(ResultSet resultSet) throws SQLException {
        System.out.println("Moving to the Last Record:");
        if (resultSet.last()) {
            displayRecord(resultSet);
        } else {
            System.out.println("No records found.");
        }
    }

    private static void displayRecord(ResultSet resultSet) throws SQLException {
        System.out.println("Employee Details:");
        System.out.println("Employee Number: " + resultSet.getInt("eno"));
        System.out.println("Employee Name: " + resultSet.getString("ename"));
        System.out.println("Salary: " + resultSet.getDouble("sal"));
        System.out.println("---------------");
    }
}
