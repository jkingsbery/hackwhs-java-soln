package net.kingsbery.hackwhs;

public enum WhsDayOfWeek {
  SATURDAY(0), SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6);

  private int value;

  private WhsDayOfWeek(int value) {
    this.value = value;
  }

  public static WhsDayOfWeek getByValue(int value) {
    for(WhsDayOfWeek day : WhsDayOfWeek.values()) {
      if(day.value == value) {
        return day;
      }
    }
    throw new IllegalArgumentException("Couldn't find day");
  }
}