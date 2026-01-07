package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
    public Class loadClass(String fileName, String className) throws // 두 예외를 메서드가 호출될 때 처리하도록 미룸
            FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }

    public static void main(String[] args) {
        ThrowsException test = new ThrowsException();
        try {
            test.loadClass("a.text", "java.lang.String");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
