package chap06_quiz;

public class CoffeeTest {
    public static void main(String[] args) {
        Person kim = new Person("kim", 10000);
        Menu coffee = new Menu("coffee", 4000);
        Cafe star = new Cafe("star", coffee);
        kim.buyCoffee(star, "coffee", 4000);

        Person lee = new Person("lee", 20000);
        Menu latte = new Menu("latte", 4500);
        Cafe bean = new Cafe("bean", latte);
        lee.buyCoffee(bean, "latte", 4500);

    }
}
