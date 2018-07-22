package array;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Bribe people to get ahead in the queue")
public class BribeTest {
  @Test
  @DisplayName("bribe 0 times")
  public void testFor0() {
    assertEquals(0, Bribe.minimumBribes(new int[] {1, 2, 3, 4}));
  }
  @Test
  @DisplayName("empty q")
  public void testForEmptyQ() {
    assertEquals(0, Bribe.minimumBribes(new int[] {}));
  }
  @Test
  @DisplayName("Only one bribe")
  public void testForOneBribe() {
    assertEquals(1, Bribe.minimumBribes(new int[] {1, 2, 3, 5, 4}));
  }
  @Test
  @DisplayName("3 bribes")
  public void testForThreeBribes() {
    assertEquals(3, Bribe.minimumBribes(new int[] {2, 1, 5, 3, 4}));
  }
  @Test
  @DisplayName("4 bribes")
  public void testForFourBribes() {
    assertEquals(4, Bribe.minimumBribes(new int[] {2, 1, 5, 4, 3}));
  }
  @Test
  @DisplayName("Too chaotic")
  public void testTooChaotic() {
    assertEquals(-1, Bribe.minimumBribes(new int[] {2, 5, 1, 4, 3}));
  }
}
