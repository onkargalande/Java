public class BreakNestedLoopExample {
    public static void main(String[] args) {
        System.out.println("Breaking out of a nested loop:");

        outerLoop:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i = " + i + ", j = " + j);

                if (i == 2 && j == 2) {
                    // Break out of both loops when i=2 and j=2
                    break outerLoop;
                }
            }
        }
    }
}
