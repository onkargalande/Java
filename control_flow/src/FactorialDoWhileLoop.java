import java.util.Scanner;

public class FactorialDoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();

        int factorial = 1;
        int i = 1;

        do {
            factorial *= i;
            i++;
        } while (i <= n);

        System.out.println("Factorial of " + n + ": " + factorial);
    }
}
