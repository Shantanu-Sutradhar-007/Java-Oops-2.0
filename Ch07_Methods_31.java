public class Ch07_Methods_31 {

    static int logic(int a, int b) {

        int c;
        if (a > b) {
            c = a + b;
        } else {
            c = (a + b) * 5;
        }

        return c;

    }

    public static void main(String[] args) {

        int c = logic(5, 7);
        System.out.println("Result: " + c);

        int c1 = logic(15, 7);
        System.out.println("Result: " + c1);

        // Method invocation using object

        // Methods_31 obj = new Methods_31();

        // int d = obj.logic(10, 20); // We don't need static for obj
        // System.out.println("Result: " + d);

    }

}