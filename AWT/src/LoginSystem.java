import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginSystem extends Frame implements ActionListener {
    private TextField usernameField, passwordField;
    private Label statusLabel;

    public LoginSystem() {
        // Set frame properties
        setTitle("Login System");
        setSize(300, 200);
        setLayout(new FlowLayout());

        // Username label and text field
        Label usernameLabel = new Label("Username: ");
        usernameField = new TextField(20);

        // Password label and text field
        Label passwordLabel = new Label("Password: ");
        passwordField = new TextField(20);
        passwordField.setEchoChar('*'); // Mask the password with '*'

        // Login button
        Button loginButton = new Button("Login");
        loginButton.addActionListener(this);

        // Status label for displaying login status
        statusLabel = new Label("");

        // Add components to the frame
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);
        add(statusLabel);

        // Close the application on window close
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        // Make the frame visible
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Simple validation (replace with actual authentication logic)
        if (username.equals("admin") && password.equals("password")) {
            statusLabel.setText("Login Successful!");
        } else {
            statusLabel.setText("Login Failed. Please try again.");
        }
    }

    public static void main(String[] args) {
        new LoginSystem();
    }
}
