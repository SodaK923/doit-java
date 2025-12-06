package chap06_quiz;

public class Taxi {
    private int taxiNumber;
    private int money;

    public Taxi(int taxiNumber){
        this.taxiNumber = taxiNumber;
    }

    public void take(int money){
        this.money += money;
    }

    public void showInfo(){
        System.out.println(taxiNumber+"번 택시의 수입은 "+money+"원 입니다.");
    }
}
