package phonenumbers;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Kata {
  public static String createPhoneNumber(int[] numbers) {
    // Your code here!
    Stream<Integer> countryCode = Arrays.stream(numbers).boxed().limit(3);
    Stream<Integer> areaCode = Arrays.stream(numbers).boxed().skip(3).limit(3);
    Stream<Integer> rest = Arrays.stream(numbers).boxed().skip(6);

    return String.format("(%s) %s-%s",
        Kata.asString(countryCode), Kata.asString(areaCode), Kata.asString(rest));
  }

  private static String asString(Stream<Integer> s) {
      return s.map(Object::toString).collect(Collectors.joining());
  }
}
