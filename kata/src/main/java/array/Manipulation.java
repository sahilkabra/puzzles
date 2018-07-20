package array;

import java.util.stream.IntStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Manipulation {
    public static long arrayManipulation(int n, int[][]queries) {
        long[] calculated = Arrays.copyOf(new long[1], n);
        for (int i = 0; i < queries.length; i++) {
            int[] currentQuery = queries[i];
            calculated = manipulate(currentQuery[0], currentQuery[1], currentQuery[2], calculated);
            System.out.println(String.format("a: %d, b: %d, k: %d", currentQuery[0], currentQuery[1], currentQuery[2]));
            Arrays.stream(calculated).forEach(System.out::print);
            System.out.println();
        }
        return Arrays.stream(calculated).summaryStatistics().getMax();
    }

    private static long[] manipulate(int startIdx, int endIdx, int valueToAdd, long[] q) {
        for (int i = startIdx - 1; i <= endIdx - 1; i++) {
            q[i] = q[i] + valueToAdd;
        }
        return q;
    }
}
