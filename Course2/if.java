import java.util.Scanner;

public class IfExamples {

    //psvm
    public static void main(String[] args) {
        boolean isCloudyOutside = false;
        if (isCloudyOutside) {
            //sout
            System.out.println("Today is a cloudy day.");
        }
        //CTRL + D duplicate multiple lines of code
        if (!isCloudyOutside) {
            //sout
            System.out.println("Today is NOT a cloudy day.");
        }

        int hour = 23;
        if (isCloudyOutside && hour > 18) {
            System.out.println("Tonight is a cloudy night");
        }

        System.out.println("------------------------------------");
        if (hour + 1 > 25) {
            System.out.println("A new day has started.");
        } else {
            System.out.println("The current day hasn't ended yet.");
        }
        //CTRL + ALT + L => arrange the code
        hour = 49;
        if (hour < 50)
            if (hour % 10 != 0) {
                System.out.println("The variable is less than 50 and not divisible by 10.");
            } else {
                System.out.println("The variable is less than 50 and it is divisible by 10.");
            }
        else {
            System.out.println("The variable is greater or equal to 50.");
        }
      
      
        // Exercise

        // A program that takes user input and calculates if it's odd or even.

        // Scanner = class responsible with reading the user input
      
        Scanner userInput = new Scanner(System.in);
        int numberToBeVerified;
      
        //.print -> doesn't add a new line
        //.println -> ln means NEW LINE
      
        System.out.print("Please enter any number: ");
        numberToBeVerified = userInput.nextInt();
     
      // To check if a number is even, we divide it by 2 and check the remainder. If the remainder is 0, then the number is prime.
      
        if (numberToBeVerified % 2 == 0)
            System.out.println("Congratulations! Your number " + numberToBeVerified + " is even");
        else
            System.out.println("Your number " + numberToBeVerified + " is NOT even");
    }
}

