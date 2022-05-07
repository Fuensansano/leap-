import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearTest {

	@Test
	public void year_one_is_not_a_leap_year() {
		assertFalse(LeapYear.isLeapYear(1));
	}

  @Test
  public void year_four_is_a_leap_year() {
    assertTrue(LeapYear.isLeapYear(4));
  }

}
