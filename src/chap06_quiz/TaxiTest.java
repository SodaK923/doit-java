package chap06_quiz;

public class TaxiTest {
    public static void main(String[] args) {
        Student std1 = new chap06_quiz.Student("Edward", 20000);
        Taxi taxi1 = new Taxi(100);
        std1.takeTaxi(taxi1);
        taxi1.showInfo();
    }
}
