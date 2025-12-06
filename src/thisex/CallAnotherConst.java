package thisex;

class Person{
    String name;
    int age;

    Person(){
        this("이름없음", 1);
    }

    Person(String name, int age){
        this.name= name;
        this.age = age;
    }

    Person returnItSelf(){
        return this;
    }
}

public class CallAnotherConst {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);
        System.out.println(person.age);

        Person p = person.returnItSelf();
        System.out.println(p);
    }
}
