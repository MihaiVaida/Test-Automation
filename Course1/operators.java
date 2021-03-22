public class Operators {
    public static void main(String[] args) {
        /**
         * Simple Assignment Operator
         * =
         * Arithmetic Operators
         * + - * / %
         * Unary Operators
         * + - ++ -- !
         * Relational Operators
         * < <= > >= == !=
         * Logical Operators
         * && || !
         * Ternary or Conditional Operators
         * ?:
         * */

        int a = 3;
        int b = 5;

        System.out.println(a+b);

        int c = a +b;
        System.out.println(c);

        //double d = (double) b/a;
        //System.out.println(d);

        System.out.println("B modulo a: " + b % a);
//        System.out.println(a++); // a = a + 1;
//        System.out.println(b--); // b = b - 1;
//
//        a++; // the incrementation takes place in the next use of "a"
//        ++a; // the incrementation takes place here!

        System.out.println("Tha value of a: " + a + "The value of b: " +  b);

        System.out.println(a > b); // The response is false
        System.out.println(a != b); // Thhe response is true

        System.out.println("-----------------------------");
        boolean example = c > 0 || a == b; // true && false
        // = assigning
        // == comparing
        System.out.println("Example has the followig value: " + example);
    }
}
