import java.util.Scanner;

public class BreakInSwitchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1-5): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected option 1.");
                break;
            case 2:
                System.out.println("You selected option 2.");
                break;
            case 3:
                System.out.println("You selected option 3.");
                break;
            case 4:
                System.out.println("You selected option 4.");
                break;
            case 5:
                System.out.println("You selected option 5.");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
