package encapsulation_pizzashop;

public class PizzaShop {
    private Pizza pizza;

    public PizzaShop(Pizza pizza){
        this.pizza = pizza;
    }

    public Pizza makePizza(String name, int money){
        if(name.equals(pizza.getName()) && money >= pizza.getPrice()){
            prepareDough();
            addTopping();
            return pizza;
        }else{
            return null;
        }
    }

    private void addTopping() {
        System.out.println("피자샵: 토핑 추가 완료");
    }

    private void prepareDough() {
        System.out.println("피자샵: 도우 준비 완료");
    }
}
