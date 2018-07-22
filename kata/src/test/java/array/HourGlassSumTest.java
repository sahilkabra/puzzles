package array;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Calculate max sum of hour glass")
public class HourGlassSumTest {
  @Test
  @DisplayName("empty array")
  public void testForEmptyArray() {
    assertEquals(0, HourGlassSum.hourglassSum(new int[0][0]));
  }

  @Test
  @DisplayName("single glass")
  public void testForSingleGlass() {
    int [][] arr = {
        {2, 4, 4},
        {0, 2, 0},
        {1, 2, 4}
    };
    assertEquals(19, HourGlassSum.hourglassSum(arr));
  }

  @Test
  @DisplayName("complicated glass")
  public void testForComplicatedGlass() {
    int [][] arr = {
        {-9, -9, -9, 1, 1, 1},
        {0, -9, 0, 4, 3, 2},
        {-9, -9, -9, 1, 2, 3},
        {0, 0, 8, 6, 6, 0},
        {0, 0, 0, -2, 0, 0},
        {0, 0, 1, 2, 4, 0}
    };
    assertEquals(28, HourGlassSum.hourglassSum(arr));
  }
}
