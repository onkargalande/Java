public class ContinueWithLabelExample {
    public static void main(String[] args) {
        outerLoop:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    // Skip the current iteration of the outer loop
                    continue outerLoop;
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}
