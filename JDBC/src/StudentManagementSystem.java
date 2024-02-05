import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentManagementSystem {

    private static final String URL = "jdbc:mysql://localhost:3306/your_database";
    private static final String USERNAME = "your_username";
    private static final String PASSWORD = "your_password";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            createStudentTable(connection);
            boolean exit = false;
            Scanner scanner = new Scanner(System.in);

            while (!exit) {
                System.out.println("\nStudent Management System Menu:");
                System.out.println("1. Insert Student");
                System.out.println("2. Update Student");
                System.out.println("3. Delete Student");
                System.out.println("4. Search Student");
                System.out.println("5. Display All Students");
                System.out.println("6. Exit");

                System.out.print("Enter your choice (1-6): ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        insertStudent(connection, scanner);
                        break;
                    case 2:
                        updateStudent(connection, scanner);
                        break;
                    case 3:
                        deleteStudent(connection, scanner);
                        break;
                    case 4:
                        searchStudent(connection, scanner);
                        break;
                    case 5:
                        displayAllStudents(connection);
                        break;
                    case 6:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                }
            }

            System.out.println("Exiting Student Management System.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createStudentTable(Connection connection) throws SQLException {
        try (PreparedStatement statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS Student (rno INT PRIMARY KEY, sname VARCHAR(255), per DOUBLE)")) {
            statement.executeUpdate();
        }
    }

    private static void insertStudent(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Enter Roll Number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Percentage: ");
        double percentage = scanner.nextDouble();

        try (PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Student VALUES (?, ?, ?)")) {
            preparedStatement.setInt(1, rollNumber);
            preparedStatement.setString(2, studentName);
            preparedStatement.setDouble(3, percentage);

            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " student(s) inserted successfully.");
        }
    }

    private static void updateStudent(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Enter Roll Number of the Student to Update: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter New Student Name: ");
        String newStudentName = scanner.nextLine();

        System.out.print("Enter New Percentage: ");
        double newPercentage = scanner.nextDouble();

        try (PreparedStatement preparedStatement = connection.prepareStatement("UPDATE Student SET sname = ?, per = ? WHERE rno = ?")) {
            preparedStatement.setString(1, newStudentName);
            preparedStatement.setDouble(2, newPercentage);
            preparedStatement.setInt(3, rollNumber);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println(rowsAffected + " student(s) updated successfully.");
            } else {
                System.out.println("No student found with the provided Roll Number.");
            }
        }
    }

    private static void deleteStudent(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Enter Roll Number of the Student to Delete: ");
        int rollNumber = scanner.nextInt();

        try (PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM Student WHERE rno = ?")) {
            preparedStatement.setInt(1, rollNumber);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println(rowsAffected + " student(s) deleted successfully.");
            } else {
                System.out.println("No student found with the provided Roll Number.");
            }
        }
    }

    private static void searchStudent(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Enter Roll Number of the Student to Search: ");
        int rollNumber = scanner.nextInt();

        try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Student WHERE rno = ?")) {
            preparedStatement.setInt(1, rollNumber);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                System.out.println("Student Details:");
                System.out.println("Roll Number: " + resultSet.getInt("rno"));
                System.out.println("Name: " + resultSet.getString("sname"));
                System.out.println("Percentage: " + resultSet.getDouble("per"));
            } else {
                System.out.println("No student found with the provided Roll Number.");
            }
        }
    }

    private static void displayAllStudents(Connection connection) throws SQLException {
        try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Student");
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                System.out.println("Student Details:");
                System.out.println("Roll Number: " + resultSet.getInt("rno"));
                System.out.println("Name: " + resultSet.getString("sname"));
                System.out.println("Percentage: " + resultSet.getDouble("per"));
                System.out.println("---------------");
            }
        }
    }
}
