public class Ex4Vocals {
  
    public static void main(String[] args) {
      
        /**
         * Create a new String with the value “Testing is not that hard if you understand the concept behind it”.
         * 	Print in the console only the vocals from the String declared.
         * 	How many vocals have you found?
         * */

        String toStrip = "Testing is not that hard if you understand the concept behind it";
        String vocals[] = {"a", "e", "i", "o", "u"};
        int vocalFounds = 0;

        for (int i = 0; i < toStrip.length(); i++) {
            for (int j = 0; j < vocals.length; j++) {
                //String vocal = vocals[j];
                if (vocals[j].equals(String.valueOf(toStrip.charAt(i)))) {
                    System.out.println(vocals[j] + " vocal found!");
                    vocalFounds++;
                }
            }
        }
        System.out.println("The total number of vocals found is: " + vocalFounds);
    }
}
