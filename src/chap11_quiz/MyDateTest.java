package chap11_quiz;

import java.util.Objects;

class MyDate{
    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
//        if(obj instanceof MyDate date){
//            return (day == date.day && month == date.month && year == date.year);
//        }
//        return false;
        if(this == obj) return true;
        if(obj == null || this.getClass() != obj.getClass()) return false;
        MyDate date = (MyDate) obj;
        return (day == date.day && month == date.month && year == date.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }
}

public class MyDateTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(9, 19, 2004);
        MyDate date2 = new MyDate(9, 19, 2004);
        System.out.println(date1.equals(date2));
        System.out.println(date1.hashCode());
        System.out.println(date2.hashCode());
    }
}
