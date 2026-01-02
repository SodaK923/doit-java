package chap13_quiz.lambda;

public class CalcTest {
    public static void main(String[] args) {
        Calc calcSum = (a, b) -> a + b;
        Calc calcSumMethod = Integer::sum;

        System.out.println("Sum: " + calcSum.add(2, 4));
    }
}
