public class Ch06_Array_MultiDimension_28 {
    public static void main(String[] args) {

        int[][] flats = new int[2][3];
        flats[0][0] = 100;
        flats[0][1] = 101;
        flats[0][2] = 102;

        flats[1][0] = 200;
        flats[1][1] = 201;
        flats[1][2] = 202;

        System.out.println("Display 2-D Array");

        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {

                System.out.print(flats[i][j] + " ");

            }
            System.out.println();
            System.out.println("Shanu");

        }

    }

}
