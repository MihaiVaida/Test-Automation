public class ArrayExample {
    public static void main(String[] args) {
		
        /**
         * Up until now, we assigned only one value to a variable
         * int x = 2; String home = "City";
         * Array == list / matrix
         * */
		 
        //CTRL + D = Copy
        int[] intArray = new int[5]; // 5 = how many spaces are allocated to memory
        int[] nicerLookingArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        intArray[0] = 2;
        intArray[1] = 4;
        intArray[2] = 6;
        intArray[3] = 8;
        intArray[4] = 10;

        System.out.println(intArray.length);
        System.out.println(nicerLookingArray.length);

        // How can we print the contets of the array without writing every line?
        for (int i = 0; i<intArray.length; i++)
            System.out.println(intArray[i]);

        // fori + TAB => autocomplete for loop
        System.out.println("-------------------------");

        //for each
        for (int j : nicerLookingArray) {
            System.out.println(nicerLookingArray[j]);
        }

       // System.out.println(intArray[0]);
        String[] arrayString = new String[3];
        arrayString[0] = "firstString";
        arrayString[1] = "secondString";
        arrayString[2] = "thirdString";

        String[] nicerStringArray = {"firstString", "secondString", "thirdString"};
    }
}
