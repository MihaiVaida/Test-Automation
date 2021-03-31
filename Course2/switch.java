public class SwitchExamples {
    public static void main(String[] args) {
        String weather = "sunny2";

        switch (weather) {
            case "sunny":
                System.out.println("It's a sunny day today");
                break;
            case "rainy":
                System.out.println("It's a rainy day today.");
                break;
            default:
                System.out.println("The weather forecast was not emitted today.");
                break;
            case "sunny2":
            case "snow":
                System.out.println("It's a snowy day today.");
                break;
        }
        int x = 10;
        switch (x) {
            case 0:
                System.out.println("Event 0 took place.");
                break;
            case 1:
                System.out.println("......");
        }
    }
}
