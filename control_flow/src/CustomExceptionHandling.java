class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class CustomExceptionHandling {
    public static void main(String[] args) {
        try {
            validateNumber(150);
        } catch (CustomException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }

    private static void validateNumber(int number) throws CustomException {
        if (number > 100) {
            throw new CustomException("Number cannot be greater than 100.");
        }
        System.out.println("Number is valid.");
    }
}
