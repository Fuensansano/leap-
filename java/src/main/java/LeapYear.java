public class LeapYear {

  public static boolean isLeapYear(int year) {
    if (year % 4 == 0 && year % 100 != 0 || year == 400) {
      return true;
    }
    return false;
  }
}
