package chap12_quiz;

public class CarTest{
    public static void main(String[] args) {
        CarFactory carFactory = CarFactory.getInstance();
        Car sonata1 = carFactory.createCar("연수 차");
        Car sonata2 = carFactory.createCar("연수 차");
        System.out.println(sonata1==sonata2);

        Car avante1 = carFactory.createCar("승연 차");
        Car avante2 = carFactory.createCar("승연 차");
        System.out.println(avante1==avante2);

        System.out.println(sonata1==avante1);
    }
}
