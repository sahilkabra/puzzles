package array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;


public class RotateNTimes {
    public static int [] rotate(int[] a, int d) {
        if (a.length < 2 || d < 1) return a;
        for (;d > 0; d--) {
            int head = a[0];
            for (int i = 0; i < a.length - 1; i++) {
                a[i] = a[i+1];
            }
            a[a.length - 1] = head;
        }
        return a;
    }
}
