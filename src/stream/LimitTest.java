package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LimitTest {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("파인애플", "사과", "바나나", "귤");

        System.out.print("기본 정렬(오름차순으로 정렬): ");
        // 오름차순으로 정렬
        fruits.stream()
                .sorted().limit(2) // 과일 이름을 오름차순으로 정렬한 결과에 limit()연산을 추가해 과일 2개를 출력
                .forEach(s -> System.out.print(s + " "));
        System.out.println();

        System.out.print("맞춤형 정렬(문자열 길이에 따라 정렬): ");
        // 문자열 길이에 따라 정렬
        fruits.stream()
                .sorted(Comparator.comparingInt(String::length)).limit(2)
                .forEach(s -> System.out.print(s + " "));
    }
}
