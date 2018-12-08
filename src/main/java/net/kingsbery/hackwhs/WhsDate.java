package net.kingsbery.hackwhs;

public class WhsDate {

  int[] MONTH_ADJUSTMENTS = {1,4,3,0,2,5,0,3,6,1,4,6};

  private int year;
  private int month;
  private int day;

  public WhsDate(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  public WhsDayOfWeek getDayOfWeek() {
    int monthAdjustment = MONTH_ADJUSTMENTS[month-1];
    if(year % 4 == 0 && (month == 1 || month == 2)) {
      monthAdjustment--;
    }
    int yearAdjustment = year - 1900;
    int yearAdjustment2 = yearAdjustment / 4;
    int sum = monthAdjustment + day + yearAdjustment + yearAdjustment2;
    return WhsDayOfWeek.getByValue(sum % 7);
  }

}