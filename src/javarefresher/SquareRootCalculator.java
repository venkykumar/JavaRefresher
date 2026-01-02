package javarefresher;

public class SquareRootCalculator {

    /**
     * Calculates the square root of the given number.
     * @param number value to compute sqrt for (must be >= 0)
     * @return square root of number
     * @throws IllegalArgumentException if number is negative
     */
    public double calculateSquareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("number must be non-negative");
        }
        return Math.sqrt(number);
    }
}
