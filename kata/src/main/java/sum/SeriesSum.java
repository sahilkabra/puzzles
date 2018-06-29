package sum;

import java.util.stream.IntStream;

public class SeriesSum {
    public static String get(int n) {
        double sum = IntStream.range(0, n).mapToDouble(r -> 1/(double)((3 * r) + 1)).sum();
        return String.format("%.2f", sum);
    }
}
