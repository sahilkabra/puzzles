package array;

import java.util.stream.IntStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class MinimumSwap {
    public static int swaps(int[] q) {
        boolean [] solvedState = initSolvedState(q.length);
        Map<Integer, List<Integer>> graphs = new HashMap<Integer, List<Integer>>();
        int graphNum = 0;

        for (int i = 0; i < q.length; i++) {
            int current = q[i];
            int expected = q[current - 1];
            // System.out.println(String.format("c: %d, e: %d", current, expected));
            // if this has already been solved, continue
            if (solvedState[current - 1]) continue;
            if (expected == current) {
                // if the element is at the correct index, it does not need to be swapped
                solvedState[current - 1] = true;
            } else {
                List<Integer> nodes = getNodesFrom(current, q, solvedState, new ArrayList<Integer>());
                graphs.put(graphNum, nodes);
                graphNum++;
            }
        }
        // printMap(graphs);
        int numSwaps = 0;
        for (List<Integer> l : graphs.values()) {
            numSwaps = numSwaps + (l.size() - 1);
        }
        return numSwaps;
    }

    private static void printMap(Map<Integer, List<Integer>> m) {
        int num = 0;
        for (List<Integer> l : m.values()) {
            System.out.println(num++);
            l.stream().forEach(System.out::print);
            System.out.println();
        }
    }

    private static List<Integer> getNodesFrom(int current, int[] q, boolean[] solvedState, List<Integer> nodes) {
        if (solvedState[current - 1]) return nodes;
        solvedState[current - 1] = true;
        nodes.add(current);
        return getNodesFrom(q[current - 1], q, solvedState, nodes);
    }

    private static boolean [] initSolvedState(int length) {
        boolean [] solvedState = new boolean[length];
        Arrays.fill(solvedState, false);
        return solvedState;
    }
}
