package template;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();
    public abstract void wiper();

    public void startCar(){
        System.out.println("시동을 켭니다.");
    }

    public void turnOff(){
        System.out.println("시동을 끕니다.");
    }

    // 템플릿 메서드 run()
    // 차의 작동 순서(시나리오)를 정의한 메서드 -> 하위 클래스에서 재정의 될 수 없음 -> final 선언
    final public void run(){
        startCar();
        drive();
        wiper();
        stop();
        turnOff();
    }
}
