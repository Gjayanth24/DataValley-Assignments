/*
Create a custom exception class in Java named CustomValidationException. 
Implement a method that takes an integer as input and throw
this custom exception if the number is negative.
 */

class CustomValidationException extends Exception {
    // Custom exception class for negative number validation
    public CustomValidationException(String message) {
        // Call the base class constructor with the message
        super(message);
    }
}

public class Problem1 {
    // Function to validate a number and raise a CustomValidationException if
    // negative
    public static void validateNumber(int number) throws CustomValidationException {
        if (number < 0) {
            throw new CustomValidationException("Error: Negative number provided");
        }
    }

    // Example usage
    public static void main(String[] args) {
        try {
            validateNumber(-7); // This will throw the exception
        } catch (CustomValidationException e) {
            System.out.println(e); // Print the exception message
        }
    }
}
