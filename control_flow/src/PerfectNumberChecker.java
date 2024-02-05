import java.util.Scanner;

public class PerfectNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isPerfectNumber(num)) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }

    private static boolean isPerfectNumber(int n) {
        int sum = 1;  // Start with 1 as every number is divisible by 1

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;

                // If the divisors are different, add the other divisor
                if (i != n / i) {
                    sum += n / i;
                }
            }
        }

        return sum == n;
    }
}
