package encapsulation_pizzashop;

public class Customer {
    private String name;
    private int money;

    public Customer(String name, int money){
        this.name = name;
        this.money = money;
    }

    public void orderPizza(PizzaShop pizzaShop, String pizzaName){
        Pizza pizza = pizzaShop.makePizza(pizzaName, money);
        if(pizza!=null){
            System.out.println("고객: 피자 주문 완료");
        }else{
            System.out.println("고객: 피자 주문 실패");
        }
    }

    // 이 패턴!
//    public void action(외부객체 obj, 파라미터들) {
//        결과 = obj.메서드(파라미터);
//
//        if(결과 != null) {
//            성공 처리
//        } else {
//            실패 처리
//        }
//    }
}
