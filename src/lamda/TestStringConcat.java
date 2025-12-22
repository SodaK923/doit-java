package lamda;

public class TestStringConcat {
    public static void main(String[] args) {

        // 객체지향 프로그래밍
        String s1 = "Hello";
        String s2 = "World";

        StringConcatImpl concat1 = new StringConcatImpl();
        concat1.makeString(s1, s2);

        // 람다식(함수형 프로그래밍)
        StringConcat concat2 = (s, v) -> System.out.println(s+", "+v);
        concat2.makeString(s1, s2);
    }
}
