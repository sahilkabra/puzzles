package utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public class Reader {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static List<String> readInput() {
        return br.lines().collect(Collectors.toList());
    }
}
