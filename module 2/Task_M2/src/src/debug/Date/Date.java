package src.debug.Date;

import java.time.Year;

public class Date {
    private int day;
    private int month;
    private int year;
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;

    }
    public Date(){}

    public int getDay() {
        return day  ;
    }


    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }
    public void setMonth(int month) throws Exception {
        if (month < 1 || month > 12) {}
        this.month = month;

    }
    public int getYear() throws Exception {
        if (year < year) {
            throw new Exception();
        }

        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public void checkDayLife(){


    }


    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
