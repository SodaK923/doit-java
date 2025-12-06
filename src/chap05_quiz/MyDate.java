package chap05_quiz;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isValid() {
        if (month < 1 || month > 12) return false;

        int maxDay;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> maxDay = 31;
            case 4, 6, 9, 11 -> maxDay = 30;
            case 2 -> {
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    maxDay = 29;
                } else {
                    maxDay = 28;
                }
            }
            default -> {
                return false;
            }
        }
            if(day >= 1 && day <= maxDay){
                System.out.println("유효한 날짜입니다.");
                return true;
            }else{
                System.out.println("유효하지 않은 날짜입니다.");
                return false;
            }
    }
}
