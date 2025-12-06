package polymorphism;

class Animal{
    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal{
    public void move(){
        System.out.println("사람이 두 발로 걷습니다.");
    }
}

class Tiger extends Animal{
    public void move(){
        System.out.println("호랑이가 네 발로 뜁니다.");
    }
}

class Eagle extends Animal{
    public void move(){
        System.out.println("독수리가 하늘을 납니다.");
    }
}

public class AnimalTest1 {
    public static void main(String[] args) {
        AnimalTest1 aTest = new AnimalTest1();
        aTest.moveAnimal(new Human());
        aTest.moveAnimal(new Tiger());
        aTest.moveAnimal(new Eagle());
    }

    public void moveAnimal(Animal animal){
        // 매개변수로 상위 클래스를 넘겨줬기 때문에 전부 Animal 형으로 인스턴스가 생성됨
        // 모두 같은 move() 메서드인데도 Animal의 move()가 아닌 각 인스턴스의 메서드가 실행됨
        animal.move();
    }
}
