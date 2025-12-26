package stream;

import java.util.Arrays;

public class IntArrayTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int sumVal = Arrays.stream(arr).sum();
        int count = (int)Arrays.stream(arr).count(); // count() 반환값이 long 이므로 int 형으로 변환

        System.out.println(sumVal);
        System.out.println(count);
    }
}
