package witharraylist;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<>();

        Customer customerLee = new Customer(10010, "이순신");
        Customer customerShin = new Customer(10020, "신사임당");
        Customer customerHong = new GoldCustomer(10030, "홍길동");
        Customer customerYoul = new GoldCustomer(10040, "이율곡");
        Customer customerKim = new VIPCustomer(10050, "김유신", 12345);

        customerList.add(customerLee);
        customerList.add(customerKim);
        customerList.add(customerHong);
        customerList.add(customerYoul);
        customerList.add(customerKim);

        System.out.println("======== 고객 정보 출력 ========");
        for (Customer c : customerList){
            System.out.println(c.showCustomerInfo());
        }

        // 다형성 구현
        System.out.println("======== 할인율과 보너스 계산 ========");
        int price = 10000;
        for(Customer c : customerList){
            int cost = c.calcPrice(price);
            System.out.println(c.getCustomerName()+" 님이 " + cost + "원 지불하셨습니다.");
            System.out.println(c.getCustomerName()+" 님의 현재 보너스 포인트는 " + c.bonusPoint + "점 입니다.");
        }
    }
}
