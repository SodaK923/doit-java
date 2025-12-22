package lamda;

interface PrintString{
    void showString(String str); // 문자열 출력 메서드 정의
}

public class TestLambda {
    public static void main(String[] args) {
        PrintString reStr = returnString();
        reStr.showString("hello");

        // 람다식: 인터페이스 구현 객체!! 무조건 객체임
        PrintString lambdaStr = s -> System.out.println(s); // 받은 문자열을 출력해주는 기능을 가진 객체(람다식)을 인터페이스형 변수에 대입
        lambdaStr.showString("hello lambda_1");
        showMyString(lambdaStr); // 람다식 전달
    }
    public static void showMyString(PrintString p){ // 매개변수를 인터페이스형으로 받음(람다식을 받음)
        p.showString("hello lambda_2");
    }

    public static PrintString returnString(){
        return str -> System.out.println(str+"world"); // 받은 문자열에 world를 더한 객체를 반환하는 메서드
    }
}
