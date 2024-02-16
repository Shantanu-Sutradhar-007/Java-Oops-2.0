public class Ch06_Array_Operations_27 {
    public static void main(String[] args) {
        int a[] = { 11, 5, 9, 66, 7, 3 };
        System.out.println(a[4]);
        System.out.println(a.length);

        String s[] = { "Shanu", "Soma", "Subha", "Sujit", "Podu", "Khusi" };

        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }

        System.out.println();

        // Reverce

        for (int i = s.length - 1; i >= 0; i--) {
            System.out.print(s[i] + " ");
        }

        System.out.println();

        // For each Loop

        for (String item : s) {
            System.out.print(item + " ");

        }
        System.out.println();
    }
}