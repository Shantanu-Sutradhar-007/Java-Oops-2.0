import java.util.Scanner;
public class Ch01_User_input {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Number 1 : ");
        int a = sc.nextInt();

        System.out.println("Number 2 : ");
        int b = sc.nextInt();

        int sum = a+b;
        System.out.println("Sum = "+sum);

        
        System.out.println("Number 1 : ");
        float c = sc.nextFloat();

        System.out.println("Number 2 : ");
        float d = sc.nextFloat();

        float sum1 = c+d;
        System.out.println("Sum = "+sum1);

        // String

        System.out.println("Enter Your Name");
        String st = sc.next();
        System.out.println(st);


       

        // To check the data type

        // boolean b1 = sc.hasNextFloat();
        // System.out.println(b1);

        sc.close();
    }
}
