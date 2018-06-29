package nofive;

import java.util.stream.IntStream;

public class NoFive {
    public static int dontGiveMeFive(int start, int end) {
        return (int)IntStream.rangeClosed(start, end)
            .mapToObj(Integer::toString)
            .filter(n -> !n.contains("5"))
            .count();
    }
}
