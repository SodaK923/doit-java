package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedTest {
    public static void main(String[] args) {
        // 문자열 리스트 생성
        List<String> fruits = Arrays.asList("파인애플", "사과", "바나나", "귤");

        System.out.print("기본 정렬(오름차순으로 정렬): ");
        // 오름차순으로 성렬
        fruits.stream()
                .sorted()
                .forEach(s -> System.out.print(s + " ")); // 기본 정렬(오름차순으로 정렬): 귤 바나나 사과 파인애플
        System.out.println();

        System.out.print("맞춤형 정렬(문자열 길이에 따라 정렬): ");
        // 문자열 길이에 따라 정렬
        fruits.stream()
                .sorted((f1, f2) -> Integer.compare(f1.length(), f2.length())) // Comparator.comparing(String::length)
                .forEach(s -> System.out.print(s + " "));
    }
}

/*
* collect: 스트림을 다른 자료형으로 수거하는 최종연산
* delimiter(구분자): 각 문자열 사이에 들어갈 것
* collect: 반환값 있음, 결과가 필요할 때
* forEach: 반환값 없음(void), 출력만 하고 싶을 때
*       String result = fruits.stream()
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println(result); // 기본 정렬(오름차순으로 정렬): 귤, 바나나, 사과, 파인애플
* */


/*
sorted() vs sorted(Comparator)
.sorted()
- 내부적으로 compareTo() 사용
- 요소 타입이 Comparable 구현해야 함
기준: 자기 자신 기준 (자연 정렬)

sorted(Comparator)
.sorted((a, b) -> ...)
- compare(a, b) 사용
- 외부에서 비교 기준 주입
기준: 내가 정한 기준
*/