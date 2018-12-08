package net.kingsbery.hackwhs;

public class WhsDate {

  private int year;
  private int month;
  private int date;

  public WhsDate(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.date = date;
  }

  public WhsDayOfWeek getDayOfWeek() {
    return WhsDayOfWeek.getByValue(3);
  }

}