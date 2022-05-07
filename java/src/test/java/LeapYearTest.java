import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearTest {
  @ParameterizedTest
  @CsvSource({
    "4",
    "8",
    "12"
  })
  public void year_divisible_by_four_is_a_leap_year(int year) {
    assertTrue(LeapYear.isLeapYear(year));
  }


	@Test
	public void year_one_is_not_a_leap_year() {
		assertFalse(LeapYear.isLeapYear(1));
	}

  @Test
  public void year_one_hundred_is_not_a_leap_year() {
    assertFalse(LeapYear.isLeapYear(100));
  }

}
