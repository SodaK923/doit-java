package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectTest {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = x -> x > 0;

        List<Integer> numbers = Arrays.asList(5, -10, -22, 0, 43, 7);

        List<Integer> positiveNumbers = numbers.stream()
                .filter(isPositive)
                // collect(): 중간 연산한 스트림의 결과를 다시 리스트로 반환받아 사용 가능(forEach(): 최종 연산)
                .collect(Collectors.toList()); // 반환값을 리스트로 출력
        System.out.println(positiveNumbers); // [5, 43, 7]

        // count(): 최종 연산이므로 반환받은 리스트에 다시 stream()을 호출해야 함
        Long count = positiveNumbers.stream()
                .count();
        System.out.println(count); // 3
    }
}
