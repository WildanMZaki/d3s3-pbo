public class MathUtils {
    public static int factorial(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative integers: " + n);
        }
        if (n > 16) {
            throw new IllegalArgumentException("Arithmetic overflow: factorial is not defined for arguments over 16 (given: " + n + ")");
        }

        int fac = 1;
        for (int i = n; i > 0; i--) {
            fac *= i;
        }
        return fac;
    }
}
