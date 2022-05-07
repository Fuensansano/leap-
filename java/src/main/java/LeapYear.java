public class LeapYear {

  public static boolean isLeapYear(int year) {
    if (year % 4 == 0 && year != 100 && year != 200 && year != 300) {
      return true;
    }
    return false;
  }
}
