public class WhileExamples {
    public static void main(String[] args) {
        int x = 0;
        while (x < 5){
            System.out.println("x is less then 5 and has the following value: " + x);
            if (x==3) {
                System.out.println("BINGO");
                break;
            }
            x++;
        }

        String[] workingDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        String today = "Friday";

      // A prgram that reads the string. When it gets to "today" it prints "The weekend has begun!"

        for (int i = 0; i < workingDays.length; i++) {
            if(workingDays[i].equals(today))
                System.out.println("The weeeknd has begun!");
            else
                System.out.println(workingDays[i]);
        }

    }
}
