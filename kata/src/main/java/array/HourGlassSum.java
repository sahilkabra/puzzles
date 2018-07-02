package array;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;

public class HourGlassSum {
    public static int hourglassSum(int[][] arr) {
        if (arr.length < 3 || arr[0].length < 3) return 0;

        int [][] sums = new int[arr.length - 2][arr[0].length - 2];
        for (int row = 1; row < arr.length - 1; row++) {
            for (int col = 1; col < arr[row].length - 1; col++) {
                sums[row - 1][col - 1] =
                    arr[row - 1][col - 1] + arr[row - 1][col] + arr[row - 1][col + 1]
                    + arr[row][col]
                    + arr[row + 1][col - 1] + arr[row + 1][col] + arr[row + 1][col + 1];
            }
        }
        Optional<Integer> max = Arrays.stream(sums)
            .flatMap(rowArray -> Arrays.stream(rowArray).boxed())
            .max((a, b) -> a.compareTo(b));
        return max.isPresent() ? max.get() : 0;
    }

    private static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
            System.out.println("\n");
        }
    }
}
