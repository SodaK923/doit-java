package constructor;

public class PersonTest {
    public static void main(String[] args) {
        Person personLee = new Person();
        Person person = new Person("소다", 166, 23);
        System.out.println(person.height);
    }
}
