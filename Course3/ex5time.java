public class Ex5Time {
  
    public static void main(String[] args) {
      
        // Declare an hour, minute and second variable
    // Add the second time period to the first and print the result
    // BONUS: Try to make your code work for any time period, not only the bellow example
    // 21:23:42
    // 00:54:19

        int h1 = 21;
        int m1 = 33;
        int s1 = 42;
        int h2 = 6;
        int m2 = 54;
        int s2 = 12;

        if (s1 + s2 > 59) {
            s2 = s1 + s2 - 60; // has the value of 1
            ++m2;
        } else
            s2 = s1 + s2;

        if (m1 + m2 > 59) {
            m2 = m1 + m2 - 60;
            ++h2;
        } else
            m2 = m1 + m2;

        if (h1 + h2 > 23) {
            h2 = h1 + h2 - 24;
        } else
            h2 += h1;

        System.out.println("The time is: " + h2 + ":" + m2 + ":" + s2);

    }
}
