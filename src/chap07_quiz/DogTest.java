package chap07_quiz;

public class DogTest {
    public static void main(String[] args) {
        Dog[] dog = new Dog[5];
        dog[0] = new Dog("dog1", "말티즈");
        dog[1] = new Dog("dog2", "포메");
        dog[2] = new Dog("dog3", "닥스훈트");
        dog[3] = new Dog("dog4", "웰시코기");
        dog[4] = new Dog("dog5", "치와와");

        for(int i=0; i<dog.length; i++){
            System.out.println(dog[i].showDogInfo());
        }

        for(Dog d : dog){
            System.out.println(d.showDogInfo());
        }

    }
}
