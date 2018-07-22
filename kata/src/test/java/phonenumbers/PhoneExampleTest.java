package phonenumbers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Phone Example Tests")
public class PhoneExampleTest {
  @Test
  @DisplayName("happy path")
  public void tests() {
    assertEquals("(123) 456-7890", Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
  }
}
