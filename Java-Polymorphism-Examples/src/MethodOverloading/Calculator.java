/**
 * The Calculator class provides methods to perform arithmetic operations.
 */
public class Calculator {
    
    /**
     * Adds two integer numbers and returns the result.
     * @param a the first integer number
     * @param b the second integer number
     * @return the sum of the two integer numbers
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Adds two double numbers and returns the result.
     * @param a the first double number
     * @param b the second double number
     * @return the sum of the two double numbers
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Subtracts two integer numbers and returns the result.
     * @param a the first integer number
     * @param b the second integer number
     * @return the difference between the two integer numbers
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integer numbers and returns the result.
     * @param a the first integer number
     * @param b the second integer number
     * @return the product of the two integer numbers
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides two integer numbers and returns the result.
     * @param a the numerator
     * @param b the denominator
     * @return the result of dividing the numerator by the denominator
     * @throws ArithmeticException if the denominator is zero
     */
    public int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
}
