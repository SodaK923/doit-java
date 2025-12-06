package interfaceex;

public class CalculatorTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        CompleteCalc calc = new CompleteCalc();
        System.out.println(calc.add(num1, num2));
        System.out.println(calc.substract(num1, num2));
        System.out.println(calc.times(num1, num2));
        System.out.println(calc.divide(num1, num2));
        calc.showInfo();
        calc.description();

        Calc calc1 = new CompleteCalc(); // 묵시적 형변환(업캐스팅)
        Calc newCalc = calc1; // Calc 형 newCalc 변수에 calc1 대입
        // Calc 인터페이스에 선언한 메서드만 사용 가능

        Calculator calc2 = new CompleteCalc();

        int[] arr = {1,2,3,4,5};
        System.out.println(Calc.total(arr));

    }
}
