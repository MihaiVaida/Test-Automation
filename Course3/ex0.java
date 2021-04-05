import java.util.Scanner;

public class Ex0 {
  
    public static void main(String[] args) {

        /**
         * 1. Store an int variable with a number which will represent an age.
         * Using if statements make the program ( you can use a new class with public static void main method)
         * print the following statements depending on the age :
         * - less than 18 : You can’t drive
         * - 18 - 21 : You can drive a car, but not a motorcycle
         * - above 21 : You can drive any vehicle you want
         * */

        int age;
        Scanner readAge = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        age = readAge.nextInt();

        if (age < 18)
            System.out.println("I'm sorry, you can't drive!");
        else
            if (age > 21)
                System.out.println("You can drive any vehicle you want.");
            else
                System.out.println("You can drive a car, but not a motorcycle.");
    }
}
