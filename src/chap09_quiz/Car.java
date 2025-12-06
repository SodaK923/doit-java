package chap09_quiz;

public abstract class Car {
    public abstract void start();
    public abstract void drive();
    public abstract void stop();
    public abstract void turnOff();
    public void washCar(){
        System.out.println("세차를 합니다.");
    }

    final public void run(){
        start();
        drive();
        stop();
        turnOff();
        washCar();
    }

//    public void start(){
//        System.out.println("시동을 켭니다.");
//    }
//
//    public void turnOff(){
//        System.out.println("시동을 끕니다.");
//    }
}
