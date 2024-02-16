import java.util.Scanner;

public class Ch03_String_01  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = "Shanu";
        System.out.print("Hello " + name);
        System.out.println();
        int a = 5;
        float b = 9.0f;
        System.out.printf("a = %d and b = %.2f\n",a,b);

        System.out.format("a = %d and b = %f\n",a,b);

        String info = sc.nextLine();
        System.out.println(info);

        sc.close();
    }
    
}
