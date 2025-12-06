package hello;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
            if (isPrime) {
                System.out.println(i);
            }
        }

    }
}
