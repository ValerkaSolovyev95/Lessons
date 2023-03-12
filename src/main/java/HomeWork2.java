import java.sql.Array;
import java.util.Arrays;

public class HomeWork2 {

    public static int[][] createDoubleArray(int x, int y) {
        return new int[x][y];
    }

    public static int[][] fillArray(int x, int y) {
        int[][] doubleArray = new int[x][y];
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                doubleArray[i][j] = (int) (Math.random() * 10);
            }
        }
        return doubleArray;
    }

    public static int[][] reverseToHour(int x, int y) {
        int[][] firstArray = fillArray(x, y);
        int[][] doubleArrayReverse = new int[x][y];

        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < firstArray[i].length; j++) {
                doubleArrayReverse[i][j] = firstArray[firstArray.length - i - 1][firstArray[i].length - j - 1];

            }

        }
        System.out.println(Arrays.deepToString(firstArray));
        return doubleArrayReverse;
    }

    ;

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(fillArray(3, 4)));
        System.out.println(Arrays.deepToString(createDoubleArray(3, 5)));
        System.out.println(Arrays.deepToString(reverseToHour(3, 3)));

    }
}
