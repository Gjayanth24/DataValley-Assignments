public class Problem2 {

    public static void divideNumbers(int numerator, int denominator) {
      try {
        // Perform division
        double result = (double) numerator / denominator;
        System.out.println("The result is: " + result);
      } catch (ArithmeticException e) {
        // Handle division by zero exception
        System.out.println("Error: Cannot divide by zero.");
      }
    }
  
    public static void main(String[] args) {
      divideNumbers(10, 2);  // Example usage with valid input
      divideNumbers(10, 0);  // Example usage with zero denominator
    }
  }
  
