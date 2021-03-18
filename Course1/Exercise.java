public class Exercise {

    /** Exercitiu
     * Declare a new class.
     * Create a variable to store the number 54.
     * Create a variable to store the number 23.
     * Declare a boolean which will store the result.
     * Check if the second variable is "divizibila" (%) with the 1st
     * and the double of the second variable is bigger than the first.
     * Print the boolean's value.
     * */

    public static void main(String[] args) {
        int a = 54;
        int b = 23;
        boolean result;
        result = a % b == 0 && 2 * b > a;
        System.out.println(result);

} }
