public class Ch07_Method_OverLoad_32 {

    static void tellJoke() {
        System.out.println("Fuck You");
    }

    static void change(int a) {
        a = 100;
    }

    static void change2(int[] arr) {
        arr[0] = 98;
    }

    // OverLoading

    static void greet() {
        System.out.println("Gd Morning");
    }

    static void greet(int a) {
        System.out.println("Gd Morning " + a);
    }

    static void greet(int a, int b) {
        System.out.println(b + " Gd Morning " + a);
    }

    public static void main(String[] args) {

        // tellJoke();
        // System.out.println();

        // Case 1: Changing the integer

        // int x = 50;
        // change(x);
        // System.out.println(x);

        // Case 2: Changing the Array

        // int[] y = { 14, 6, 33, 4, 99, 45 };
        // change2(y);
        // System.out.println("The array after changing is :" + y[0]);

        // Method Overloading

        greet();
        greet(3000);
        greet(10, 30); // a,b -> Parameter || 10,30 -> Argument

        // Arguments are actule

    }
}