import org.w3c.dom.ls.LSOutput;

public class DeclaringVariables {

    //Variables declared in a class are called FIELDS
    
    int a;
    String nume = "";

    //Variables declared in a method or block of code are called Local Variables
    
    public void SumOfTwoNumbers () {
        int b = 2;
        int c = 3;
        int sum = b + c;
    }

  // Variables inside a method are called PARAMETERS
    
    public static double calcAvg (int nr1, int nr2) {
        double avg;
        if (nr1 > nr2)
            avg = nr1 / nr2;
        else
            avg = nr2 / nr1;
        return avg;
    }

    public static void main(String[] args) {
        System.out.println(calcAvg(5,3));
    }

}
