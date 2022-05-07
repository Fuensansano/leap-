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
    "12",
    "16",
  })
  public void year_divisible_by_four_is_a_leap_year(int year) {
    assertTrue(LeapYear.isLeapYear(year));
  }


  @ParameterizedTest
  @CsvSource({
    "1",
    "2",
    "3",
    "5"
  })
  public void year_not_divisible_by_a_four_are_not_leap_year(int year) {
    assertFalse(LeapYear.isLeapYear(year));
  }

  @ParameterizedTest
  @CsvSource({
    "100",
    "200",
    "300",
    "500"
  })
  public void year_divisible_by_a_hundred_but_not_four_hundred_are_not_leap_year(int year) {
    assertFalse(LeapYear.isLeapYear(year));
  }

  @Test
  public void year_divisible_by_four_hundred_is_a_leap_year() {
    assertTrue(LeapYear.isLeapYear(400));
  }

  @Test
  public void year_divisible_by_eight_hundred_is_a_leap_year() {
    assertTrue(LeapYear.isLeapYear(800));
  }

  @Test
  public void year_divisible_by_1200_is_a_leap_year() {
    assertTrue(LeapYear.isLeapYear(1200));
  }
}
