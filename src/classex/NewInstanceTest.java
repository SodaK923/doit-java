package classex;

public class NewInstanceTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        Person person1 = new Person();
        System.out.println(person1);

        Class pClass = Class.forName("classex.Person");
        Person person2 = (Person)pClass.newInstance(); // Person의 디폴트 생성자 호출
        System.out.println(person2);
    }
}
