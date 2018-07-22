package array;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Find minimum number of swaps needed")
public class MinimumSwapTest {
  @Test
  @DisplayName("swap 0 times")
  public void testFor0() {
    assertEquals(0, MinimumSwap.swaps(new int[] {1, 2, 3, 4}));
  }
  @Test
  @DisplayName("swap 1 times")
  public void testFor1() {
    assertEquals(1, MinimumSwap.swaps(new int[] {1, 3, 2, 4}));
  }
  @Test
  @DisplayName("swap 2 times")
  public void testFor2() {
    assertEquals(2, MinimumSwap.swaps(new int[] {4, 3, 2, 1}));
  }
  @Test
  @DisplayName("swap 3 times")
  public void testFor3() {
    assertEquals(3, MinimumSwap.swaps(new int[] {4, 3, 1, 2}));
  }
  @Test
  @DisplayName("swap as example")
  public void testForExample() {
    assertEquals(5, MinimumSwap.swaps(new int[] {7, 1, 3, 2, 4, 5, 6}));
  }
}
