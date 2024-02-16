import java.util.Scanner;

public class Ch04_Practice_Set_04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // -> Q1

        // int a = 11;
        // if(i = 11){
        // System.out.println("Yes");
        // }
        // else{
        // System.out.println("No");
        // }




        // -> Q2

        // System.out.println("Enter First Subject Number");
        // int b = sc.nextInt();
        // System.out.println("Enter Second Subject Number");
        // int c = sc.nextInt();
        // System.out.println("Enter Third Subject Number");
        // int d = sc.nextInt();

        // if ( b < 33 || c < 33 || d < 33 || (((b+c+d)*100)/100) <= 40){
        // System.out.println("You Are Fail !");

        // }
        // else{
        // System.out.println("You Are Pass");
        // }




        // -> Q3 [Tax System]

        // System.out.println("Enter The Amount in Lakhs");
        // float income = sc.nextFloat();
        // float tax = 0;

        // if (income < 2.5f) {

        //     tax = tax + 0;

        // } else if (income > 2.5f && income <= 5f) {
        //     tax = tax + 0.05f * (income - 2.5f);

        // } else if (income > 5f && income <= 10f) {
        //     tax = tax + 0.05f * (5f - 2.5f);
        //     tax = tax + 0.2f * (income - 5f);

        // } else if (income > 10f) {
        //     tax = tax + 0.05f * (5f - 2.5f);
        //     tax = tax + +0.2f * (10f - 5f);
        //     tax = tax + +0.3f * (income - 10f);

        // }

        // System.out.print("Total Tax Paid : " + tax);



        // -> Q4 [leap year]

        System.out.println("Enter The Year");
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 100 == 0 && year % 400 == 0) {

            System.out.println(year + " is a Leapyear ");
            
        }
        else{
        System.out.println(year+" is Not a Leap Year");
        }

        sc.close();

    }

}
