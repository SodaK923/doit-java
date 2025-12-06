package classex;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException{
        // 1. Object 클래스의 getClass() 메서드 사용하기
        Person person = new Person(); // 인스턴스 생성 필요
        Class pClass1 = person.getClass();
        System.out.println(pClass1.getName());

        // 2. 직접 Class 파일 대입하기
        Class pClass2 = Person.class;
        System.out.println(pClass2.getName());

        // 3. 클래스 이름으로 가져오기
        Class pClass3 = Class.forName("classex.Person");
        System.out.println(pClass3.getName());

    }
}
