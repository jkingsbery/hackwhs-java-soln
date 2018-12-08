package net.kingsbery.hackwhs;

import java.util.Random;

public class WhsDate {

  private static final int[] MONTH_ADJUSTMENTS = {1,4,3,0,2,5,0,3,6,1,4,6};
  
  private static final int[] DAYS_IN_MONTH={31,28,31,30,31,30,31,31,30,31,30,31};

  private static Random rand = new Random();

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

  public static WhsDate random() {
    int year = rand.nextInt(199) + 1900;
    int month = rand.nextInt(12);
    int day = rand.nextInt(DAYS_IN_MONTH[month]);
    return new WhsDate(year, month + 1, day);
  }

  public String toString() {
    return year + "-" + month + "-" + day;
  }

}