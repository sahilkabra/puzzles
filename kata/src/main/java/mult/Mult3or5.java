package mult;

import java.util.stream.IntStream;

public class Mult3or5 {
    public static int solution(int number) {
        return IntStream.range(3, number)
            .filter(n ->
                 (n%3 == 0 || n%5 == 0)
        ).sum();
    }
}
