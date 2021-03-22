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
//        a++; // incrementarea are loc la urmtoarea folosire  a lui "a"
//        ++a; // incrementarea are loc aici!

        System.out.println("Valoarea lui a: " + a + "Valoarea lui b: " +  b);

        System.out.println(a > b); // Raspunsul: false
        System.out.println(a != b); // Raspunsul:  true

        System.out.println("-----------------------------");
        boolean example = c > 0 || a == b; // true && false
        // = atribuire
        // == comparare
        System.out.println("Example are valoarea: " + example);



    }
}
