package chap06_quiz;

public class Student {
    private String name;
    private int money;

    public Student(String name, int money){
        this.name = name;
        this.money = money;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void takeTaxi(Taxi taxi){
        taxi.take(10000);
        this.money -= 10000;
    }
}
