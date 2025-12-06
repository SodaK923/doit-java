package string;

public class StringBuilderTest {
    public static void main(String[] args) {
        String sodaStr = new String("soda");
        System.out.println("javaStr 문자열 주소: " + System.identityHashCode(sodaStr)); // 189568618

        StringBuilder buffer = new StringBuilder(sodaStr);
        System.out.println("연산 전 buffer 메모리 주소: " + System.identityHashCode(buffer)); // 664223387

        buffer.append(" and");
        buffer.append(" android");
        buffer.append(" programming is fun!");
        System.out.println("연산 후 buffer 메모리 주소: " + System.identityHashCode(buffer)); // 664223387

        sodaStr = buffer.toString();
        System.out.println(sodaStr); // java and android programming is fun!
        System.out.println("새로 만들어진 javaStr 문자열 주소: " + System.identityHashCode(sodaStr)); // 824909230

    }
}
