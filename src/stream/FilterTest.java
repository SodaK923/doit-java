package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterTest {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = x -> x > 0; // 양수를 찾는 Predicate

        List<Integer> numbers = Arrays.asList(5, -20, -22, 0, 43, 7);
        Stream<Integer> s = numbers.stream().filter(isPositive);
        s.forEach(System.out::println); // s.forEach(s -> System.out.println(s))


        /* 메서드 참조 참고
        List<String> words = Arrays.asList("apple", "banana", "cherry");

        // Function<T, R>: T 자료형의 인자를 받아 R 자로형으로 출력
        Function<String, Integer> stringLength = String::length; // s -> s.length()
        /**/
    }
}
