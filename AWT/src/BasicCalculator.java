import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicCalculator extends Frame implements ActionListener {
    private TextField display;
    private double num1, num2, result;
    private String operator;

    public BasicCalculator() {
        // Set frame properties
        setTitle("Basic Calculator");
        setSize(300, 400);
        setLayout(new BorderLayout());

        // Display field
        display = new TextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        // Panel for buttons
        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        // Button array for digits and operations
        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        // Create buttons and add action listeners
        for (String label : buttonLabels) {
            Button button = new Button(label);
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        // Add button panel to the frame
        add(buttonPanel, BorderLayout.CENTER);

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
        String command = e.getActionCommand();

        switch (command) {
            case "=":
                calculateResult();
                break;
            case "/":
            case "*":
            case "-":
            case "+":
                handleOperator(command);
                break;
            default:
                appendToDisplay(command);
        }
    }

    private void appendToDisplay(String text) {
        display.setText(display.getText() + text);
    }

    private void handleOperator(String op) {
        operator = op;
        num1 = Double.parseDouble(display.getText());
        display.setText("");
    }

    private void calculateResult() {
        num2 = Double.parseDouble(display.getText());

        switch (operator) {
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    display.setText("Error");
                    return;
                }
                break;
            case "*":
                result = num1 * num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "+":
                result = num1 + num2;
                break;
        }

        display.setText(String.valueOf(result));
        operator = null;
    }

    public static void main(String[] args) {
        new BasicCalculator();
    }
}
