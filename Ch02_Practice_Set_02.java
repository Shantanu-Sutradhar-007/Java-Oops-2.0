import java.util.Scanner;
public class Ch02_Practice_Set_02 {
    public static void main(String[] args) {

        // System.out.println(7/4.0 * 9/2.0);


        // char grade = 'a';
        // grade += (char)8;
        // System.out.println(grade);

        // grade -= (char)8;
        // System.out.println(grade);


        int n = 10;
        System.out.println("Number");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        
        if(n < m) {
            System.out.println("Greater");
        } 
        if (n == m) {
            System.out.println("Equal");
        }
        else {
            System.out.println("Smaller");
        }
        sc.close();



    }
    
}
