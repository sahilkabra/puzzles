package array;

import java.util.stream.IntStream;
import java.util.LinkedList;

public class Bribe {
    public static int minimumBribes(int[] q) {
        int bribe = 0;
        for (int i = 0; i < q.length; i++) {
            if (q[i] - (i + 1) > 2) {
                return -1;
                // System.out.println("Too chaotic"); return;
            }
            for (int j = Math.max(0, q[i] - 2); j < i; j++) {
                if (q[j] > q[i]) bribe++;
            }
        }
        return bribe;
    }
}
