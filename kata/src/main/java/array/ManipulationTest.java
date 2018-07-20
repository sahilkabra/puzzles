package array;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Manipulate an array")
public class ManipulationTest {
  @Test
  @DisplayName("single query")
  public void testForSingleQuery() {
    int [][] queries = new int[][]{
          { 1, 5, 3 }
      };
    assertEquals(3, Manipulation.arrayManipulation(10, queries));
  }
  @Test
  @DisplayName("two queries")
  public void testForTwoQueries() {
    int [][] queries = new int[][]{
          { 1, 5, 3 },
          { 4, 8, 7 }
      };
    assertEquals(10, Manipulation.arrayManipulation(10, queries));
  }
  @Test
  @DisplayName("sample")
  public void testForSample() {
    int [][] queries = new int[][]{
          { 1, 5, 3 },
          { 4, 8, 7 },
          { 6, 9, 1 }
      };
    assertEquals(10, Manipulation.arrayManipulation(10, queries));
  }
  @Test
  @DisplayName("test case 15")
  public void testForTestCase15() {
    int [][] queries = new int[][]{
          { 2, 6, 8 },
          { 3, 5, 7 },
          { 1, 8, 1 },
          { 5, 9, 15 }
      };
    assertEquals(31, Manipulation.arrayManipulation(10, queries));
  }
}
