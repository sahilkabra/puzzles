package sum;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Series sum tests")
public class SeriesSumTest {
  @Test
  @DisplayName("test for 0")
  public void testFor0() {
    assertEquals("0.00", SeriesSum.get(0));
  }
  @Test
  @DisplayName("test for 1")
  public void testFor1() {
    assertEquals("1.00", SeriesSum.get(1));
  }
  @Test
  @DisplayName("test for 2")
  public void testFor2() {
    assertEquals("1.25", SeriesSum.get(2));
  }
  @Test
  @DisplayName("test for 5")
  public void testFor5() {
    assertEquals("1.57", SeriesSum.get(5));
  }
}
