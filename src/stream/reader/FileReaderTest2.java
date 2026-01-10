package stream.reader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest1 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("reader.txt")) {
            char[] buf = new char[10];
            int i;
            while ((i = fr.read(buf)) != -1) {
                for (int k = 0; k < i; k++) {
                    System.out.print(buf[k]);
                }
                System.out.println(": " + i + "바이트 읽음");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
