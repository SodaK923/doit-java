package chap06_quiz;

public class CarFactory {
    private static CarFactory carFactory;
    private CarFactory(){
    }

    public static CarFactory getInstance(){
        if(carFactory==null){
            carFactory = new CarFactory();
        }
        return carFactory;
    }

    public Car createCar(){
        return new Car();
    }
}
