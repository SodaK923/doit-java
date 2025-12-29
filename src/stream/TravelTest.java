package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class TravelTest {
    public static void main(String[] args) {
        TravelCustomer customerLee = new TravelCustomer("이정후", 40, 100);
        TravelCustomer customerKim = new TravelCustomer("김혜성", 20, 100);
        TravelCustomer customerSong = new TravelCustomer("송성문", 13, 50);

        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(customerLee);
        customerList.add(customerKim);
        customerList.add(customerSong);

        System.out.println("== 고객 명단 추가된 순서대로 출력 ==");
        customerList.stream()
                .map(TravelCustomer::getName)
                .forEach(System.out::println);

        int total = customerList.stream()
                        .mapToInt(TravelCustomer::getPrice)
                                .sum();
        System.out.println("총 여행 비용은: " + total + "만 원입니다.");

        System.out.println("== 20세 이상 고객 명단 정렬하여 출력");
        List<String> names = customerList.stream()
                .filter(c -> c.getAge() >= 20)
                .map(TravelCustomer::getName)
                .sorted()
                .toList();

        IntStream.range(0, names.size()) // 0~(size-1) 정수 스트림 생성
                .forEach(i -> System.out.println((i+1) + ". " + names.get(i)));
    }
}

/*
map을 쓰는 경우 (객체 스트림): 결과를 ‘값’으로 들고 있을 때
- 결과 타입: Stream<T>
- 목적: 변환, 가공, 전달
- 계산 X
- 데이터 형태 바꾸기용

mapToInt를 쓰는 경우 (기본형 스트림): 숫자로 연산할 때
- 결과 타입: IntStream
- 목적: 합계, 평균, 최대, 최소
- 계산
- 연산 전용

뒤에 붙일 수 있음
sum / average / max / min -> mapToInt
collect / forEach / map -> map
* */