public class StringExample {
    // psvm
    public static void main(String[] args) {
        String simpleString = "first string";

        // first string
        // 01234567891011

        System.out.println(simpleString);
        int stringLength = simpleString.length();
        System.out.println(stringLength);

        System.out.println(simpleString.charAt(1));
        System.out.println(simpleString.contains("st st")); // returns true or false

        boolean stringEndsWithG = simpleString.endsWith("g");
        System.out.println(stringEndsWithG);

        System.out.println("-------------------------------------");

        boolean stringStartsWithG = simpleString.startsWith("f");
        System.out.println(stringStartsWithG);

        System.out.println(simpleString.isEmpty());

        String withSpaces = "   a a  a a a    ";
        System.out.println(withSpaces);
        System.out.println(withSpaces.trim());

        System.out.println(withSpaces.replaceAll("a", "1"));

        String lowerCase = "CANADA";
        String upperCase = "canada";

        System.out.println(lowerCase.toLowerCase());
        System.out.println(upperCase.toUpperCase());

    }

}
