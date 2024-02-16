public class Ch07_VarArgs_33 {

    static int sum(int x, int... arr) {
        // Available as int [] arr;
        int s = x;
        for (int i : arr) {
            s += i;

        }
        return s;
    }

    public static void main(String[] args) {

        System.out.println(sum(10, 20, 300, 44, 59, 6));

    }

}