public class Dog {

        String breed;
        int age;
        int size;
        String color;

        public void bark() {
            System.out.println("I am a " + breed + ", and I bark!");
        }

        //Constructor
        public Dog(String b, int a, int d, String c) {
            breed = b;
            age = a;
            size = d;
            color = c;
        }
}
