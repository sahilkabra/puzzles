package mult;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Mult 3 of 5 test")
public class Mult3or5Test {
  @Test
  @DisplayName("test for 4")
  public void testFor4() {
    assertEquals(3, Mult3or5.solution(4));
  }
  @Test
  @DisplayName("test for 3")
  public void testFor3() {
    assertEquals(0, Mult3or5.solution(3));
  }
  @Test
  @DisplayName("test for 3 and 5")
  public void testFor3and5() {
    assertEquals(8, Mult3or5.solution(6));
  }
  @Test
  @DisplayName("test for 16")
  public void testFor16() {
    assertEquals(60, Mult3or5.solution(16));
  }
  @Test
  @DisplayName("test for 10")
  public void testFor10() {
    assertEquals(23, Mult3or5.solution(10));
  }
}
