import java.util.Scanner;

public class Ex1Pin {
  
    public static void main(String[] args) {

        /**
         * 2. Create a PIN program which has stored a desirable PIN number into a variable and reads an input from the user.
         * If the PIN number inserted by the user is not the correct one ( the one stored in the variable ),
         * prompt a message and ask the user for another PIN until it’s correct.
         * You can also add a condition of exiting the program after 3 incorrect inputs.
         * Or exit the program if the pin is correct.
         * */

        int pin = 1234;
        Scanner readPin = new Scanner(System.in);

        for (int i = 1; i < 4; i++) {
            System.out.print("Please enter your pin: ");
            int tempPin = readPin.nextInt();
            if (tempPin == pin) {
                System.out.println("Congratulations! You have entered the correct pin.");
                break;
            }
            else {
                System.out.println("You have entered an incorrect pin. You have " + (3-i) + " tries remaining.");
                if (i == 3)
                    System.out.println("Your card has been temporarily on hold!");
            }
        }
    }
}
