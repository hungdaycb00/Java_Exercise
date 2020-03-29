package Lession4;

public class Date {
    private int year, month, day;

    //The constructors
    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //the public getters/setterts for te private variables

    public int getYear() {
        return year;
    }
    public int getMonth(){
        return this.month;
    }
    public int getDay(){
        return this.day;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setDay(int day){
        this.day = day;
    }

    //return "mm/dd/yyyy with leading zero gfor mm and dd.
    public String toString(){
        return String.format("%02d/%02d/%4d", day,month, year);
    }

    //set year,month and day - no input validation
    public void setDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
}
