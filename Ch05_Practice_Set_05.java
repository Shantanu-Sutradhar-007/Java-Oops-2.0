public class Ch05_Practice_Set_05 {
    public static void main(String[] args) {

        // -> Question 01

        // int n = 4;

        // for (int i = n; i > 0; i--) {

        // for (int j = 0; j < i; j++) {

        // System.out.print("*");

        // }
        // System.out.println();

        // }

        // Question -> 02

        // int z = 4; // 0 2 4 6
        // int sum = 0;
        // for (int i = 0; i < z; i++) {
        // sum = sum + (2*i);

        // }
        // System.out.println("Sum of Even Number : " + sum);

        // Question -> 03

        // int num = 5;
        // for (int i = 1; i <= 10; i++) {
        // System.out.println(num + " X " + i + " = " + num * i);

        // }

        // Question -> 04

        // int num = 5;
        // for (int i = 10; i >= 1; i--) {
        // System.out.println(num + " X " + i + " = " + num * i);

        // }

        // Question -> 05

        // int m = 5;
        // int factorial = 1;
        // for (int i = 1; i <= m; i++) {
        // factorial *= i;

        // }
        // System.out.println(factorial);

        // Question -> 06
        int sum = 0;
        int num = 5;
        for (int i = 1; i <= 10; i++) {
            sum += num*i;

        }
        System.out.println(sum);

    }

}
