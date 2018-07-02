package string;

import java.util.stream.IntStream;

public class ReverseStringNTimes {
    private static String oneiteration(String s) {
        StringBuilder sb = new StringBuilder(s).reverse();
        return sb.length() > 2
            ? sb.substring(0, 1) + oneiteration(sb.substring(1))
            : sb.toString();
    }
    public static String reverse(String s, long n) {
        if (n == 0) return s;
        for (;n > 0 ; n--) {
            s =  oneiteration(s);
        }
        return s;
    }
}
