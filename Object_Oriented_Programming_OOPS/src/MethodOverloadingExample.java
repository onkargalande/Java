class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloadingExample {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.add(5, 10));      // Invoking int version
        System.out.println(myCalculator.add(5.5, 10.5));  // Invoking double version
    }
}
