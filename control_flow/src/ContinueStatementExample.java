public class ContinueStatementExample {
    public static void main(String[] args) {
        System.out.println("Printing even numbers from 1 to 10 (skipping odd numbers):");

        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                // Skip odd numbers
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
