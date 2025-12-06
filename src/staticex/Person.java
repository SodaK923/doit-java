package staticex;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void say_hello(){
        System.out.println("Hello, I am "+name);
    }
}
