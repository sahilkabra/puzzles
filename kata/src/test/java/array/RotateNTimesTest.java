package array;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@DisplayName("Left Rotate Array N times")
public class RotateNTimesTest {
  @Test
  @DisplayName("rotate empty array")
  public void testForEmpty() {
    int [] a = {};
    assertArrayEquals(a, RotateNTimes.rotate(a, 10));
  }
  @Test
  @DisplayName("rotate 0 times")
  public void testFor0() {
    int [] a = {1, 2, 3, 4};
    assertArrayEquals(a, RotateNTimes.rotate(a, 0));
  }
  @Test
  @DisplayName("rotate 1 times")
  public void testFor1() {
    int [] a = {1, 2, 3, 4};
    assertArrayEquals(new int[] {2, 3, 4, 1}, RotateNTimes.rotate(a, 1));
  }
  @Test
  @DisplayName("rotate 3 times")
  public void testFor3() {
    int [] a = {1, 2, 3, 4};
    assertArrayEquals(new int[] {4, 1, 2, 3}, RotateNTimes.rotate(a, 3));
  }
}
