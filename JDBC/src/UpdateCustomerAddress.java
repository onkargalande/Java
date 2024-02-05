import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateCustomerAddress {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database";
        String username = "your_username";
        String password = "your_password";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement updateStatement = connection.prepareStatement("UPDATE customers SET address = ? WHERE cid = ?");
             PreparedStatement selectStatement = connection.prepareStatement("SELECT * FROM customers WHERE cid = ?")) {

            int customerIdToUpdate = 1;
            String newAddress = "New Address";

            // Display current details
            selectStatement.setInt(1, customerIdToUpdate);
            ResultSet resultSetBefore = selectStatement.executeQuery();
            if (resultSetBefore.next()) {
                System.out.println("Customer Details Before Update:");
                System.out.println("CID: " + resultSetBefore.getInt("cid"));
                System.out.println("Name: " + resultSetBefore.getString("cname"));
                System.out.println("Address: " + resultSetBefore.getString("address"));
                System.out.println("---------------");
            }

            // Update address
            updateStatement.setString(1, newAddress);
            updateStatement.setInt(2, customerIdToUpdate);
            updateStatement.executeUpdate();

            // Display updated details
            selectStatement.setInt(1, customerIdToUpdate);
            ResultSet resultSetAfter = selectStatement.executeQuery();
            if (resultSetAfter.next()) {
                System.out.println("Customer Details After Update:");
                System.out.println("CID: " + resultSetAfter.getInt("cid"));
                System.out.println("Name: " + resultSetAfter.getString("cname"));
                System.out.println("Address: " + resultSetAfter.getString("address"));
                System.out.println("---------------");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
