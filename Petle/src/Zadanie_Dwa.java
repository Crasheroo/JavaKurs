import java.util.Arrays;

public class Zadanie_Dwa {
    public static void main(String[] args) {
        int[][] array = new int[3][3];

        int x = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = x++;
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
