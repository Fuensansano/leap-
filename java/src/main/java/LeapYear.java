public class LeapYear {

  public static boolean isLeapYear(int year) {
    if (year % 4 == 0 && year % 100 != 0 || year == 400 || year == 800 || year == 1200) {
      return true;
    }
    return false;
  }
}
