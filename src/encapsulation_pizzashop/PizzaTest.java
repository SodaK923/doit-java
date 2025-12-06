package encapsulation_pizzashop;

public class PizzaTest {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("치즈피자", 10000);
        PizzaShop pizzaShop = new PizzaShop(pizza);
        Customer customer = new Customer("소다", 1000);
        customer.orderPizza(pizzaShop, "치즈피자");
    }
}
