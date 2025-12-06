package string;

public class StringTest {
    public static void main(String[] args) {
        String javaStr = new String("java");
        String androidStr = new String("android");
        System.out.println(javaStr); // java
        System.out.println("처음 문자열 주솟값: " + System.identityHashCode(javaStr)); // 189568618

        javaStr = javaStr.concat(androidStr); // 문자열 연결

        System.out.println(javaStr); // javaandroid
        System.out.println("연결된 문자열 주솟값: " + System.identityHashCode(javaStr)); // 664223387
    }
}
