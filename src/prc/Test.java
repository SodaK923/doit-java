package prc;

public class Test {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        Operate result = calculate();
        result.operate(num1, num2);
    }

    public static Operate calculate(){
        return (a,b)->a+b;
    }
}
