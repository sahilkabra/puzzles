package nofive;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("No Five tests")
public class NoFiveTest {
  @Test
  @DisplayName("test for 0")
  public void testFor0() {
    assertEquals(1, NoFive.dontGiveMeFive(0, 0));
  }
  @Test
  @DisplayName("test for 8")
  public void testFor8() {
    assertEquals(8, NoFive.dontGiveMeFive(1, 9));
  }
  @Test
  @DisplayName("test for 12")
  public void testFor12() {
    assertEquals(12, NoFive.dontGiveMeFive(4, 17));
  }
  @Test
  @DisplayName("test for when 5 is not in the bit position")
  public void testFor5NotInEnd() {
    assertEquals(2, NoFive.dontGiveMeFive(49,60));
  }
}
