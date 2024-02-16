public class Ch04_elseif_03 {

    public static void main(String[] args) {
        int age = 18;
        // if (age < 18) {
        // System.out.println("No");

        // }
        // else if (age > 18) {

        // System.out.println("Most");

        // }
        // else{
        // System.out.println("Yes");
        // }

        switch (age) {
            case 18:
                System.out.println("Adult");
                break;

            case 16:
                System.out.println("Teen");

            default:
                System.out.println("Enjoy");
                break;
        }

    }

}
