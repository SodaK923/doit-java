package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

// BinaryOperator를 구현한 클래스 정의
class CompareString implements BinaryOperator<String>{
    @Override
    public String apply(String s1, String s2) {
        if(s1.getBytes().length >= s2.getBytes().length) return s1;
        else return s2;
    }
}

public class ReduceTest {
    public static void main(String[] args) {
        String[] greetings = {"안녕하세요~~~", "hello", "Good morning", "반갑습니다!"};
        System.out.println(Arrays.stream(greetings)
                // 람다식 구현
                .reduce("", (s1, s2) ->{ // identity: "" -> 스트림이 비어있어도 " " 반환 보장
            if(s1.getBytes().length >= s2.getBytes().length) return s1;
            else return s2;
        }));

        // BinaryOperator를 구현한 CompareString 클래스 사용
        String str = Arrays.stream(greetings)
                // identity 없음 -> Optional 반환
                .reduce(new CompareString())
                .get(); // Optional 에서 값을 꺼내는 메서드, 스트림이 비어있으면 예외발생
                // .orElse("") 또는 .ifPresent(System.out::println) 추천
        System.out.println(str);
    }
}
