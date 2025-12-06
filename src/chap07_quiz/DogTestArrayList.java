package chap07_quiz;

import java.util.ArrayList;

public class DogTestArrayList {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<Dog>();

        dogs.add(new Dog("dog1", "말티즈"));
        dogs.add(new Dog("dog2", "말티즈"));
        dogs.add(new Dog("dog3", "말티즈"));
        dogs.add(new Dog("dog4", "말티즈"));
        dogs.add(new Dog("dog5", "말티즈"));

        for(int i=0; i<dogs.size(); i++){
            Dog dog = dogs.get(i);
            System.out.println(dog.showDogInfo());
        }

        System.out.println("============");

        for(Dog d : dogs){
            System.out.println(d.showDogInfo());
        }
    }
}
