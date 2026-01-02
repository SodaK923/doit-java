package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling1 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("a.txt");
        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e); // 오류를 JVM 으로 보냄
            System.out.println(e);
        }
        System.out.println("여기서도 수행됨");
    }
}
