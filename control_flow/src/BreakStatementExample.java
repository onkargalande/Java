import java.util.Scanner;

public class BreakStatementExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to find its factorial (enter a negative number to exit):");

        int num;
        while (true) {
            System.out.print("Enter a number: ");
            num = scanner.nextInt();

            if (num < 0) {
                System.out.println("Exiting the program.");
                break;
            }

            int factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }

            System.out.println("Factorial of " + num + ": " + factorial);
        }
    }
}
