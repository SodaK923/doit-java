package chap12_quiz;

import java.util.HashMap;

public class CarFactory {
    private HashMap<String, Car> carHashMap;
    private static CarFactory instance;
    private CarFactory(){
        carHashMap = new HashMap<>();
    }

    public static CarFactory getInstance(){
        if(instance==null){
            instance = new CarFactory();
        }
        return instance;
    }

    public Car createCar(String name){
        if(carHashMap.containsKey(name)){
            return carHashMap.get(name); // 같은 key 값이면 해당 value 리턴(싱글톤)
        }
        Car car = new Car();
        carHashMap.put(name, car); // hashmap에 추가한다는 건가?
        return car;
    }
}
