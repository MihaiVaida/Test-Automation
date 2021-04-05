public class StringSplitExample {
  
    public static void main(String[] args) {
      
        String stringToSplit = "it.is.a.beautiful.day.today";
        String[] stringAfterSplit = stringToSplit.split("\\.");
        System.out.println(stringAfterSplit[1]);

        for (String s : stringAfterSplit) {
            System.out.println(s);
        }

        for (int i = 0; i < stringAfterSplit.length; i++)
            System.out.println(stringAfterSplit[i]);
    }
}
