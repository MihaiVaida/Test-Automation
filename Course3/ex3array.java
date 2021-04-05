public class Ex3Array {
  
    public static void main(String[] args) {
      
        /**
         *  Create an int array with the following numbers : 12, 17, 6, 19, 27, 43, 24, 33
         * 	Write a program to print only the prime numbers from the in array declared above
         * 	Print how many prime numbers have been found
         * */

        int array[] = {12, 17, 6, 19, 27, 43, 24, 33};
        int primeCounter = 0;
        // 17 -> 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 , 14 ,15 ,16
        for (int i = 0; i < array.length; i++) {
            for (int j = 2; j <= (array[i]/2); j++) {
                if (array[i] % j == 0) {
                    System.out.println("The number " + array[i] + " is NOT prime");
                    break;
                } else
                    if (j == (array[i] / 2)) {
                        System.out.println("The number " + array[i] + " is prime");
                        primeCounter++;
                    }
                }
            }

        System.out.println("The total number of prime numbers found is: " + primeCounter);


//        for (int i : array){
//            if(isPrime(i)){
//                System.out.println(i);
//            }
//        }
//    }
//    public static boolean isPrime (int number){
//        for(int i = 2;i<(number/2);i++){
//            if(number%i==0){
//                return false;
//            }
//        }
//        return true;
    }
    }




