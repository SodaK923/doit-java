package chap06_quiz;

public class Menu {
    private String menu;
    private int price;

    public Menu(String menu, int price){
        this.menu = menu;
        this.price = price;
    }

    public String getMenu(){
        return menu;
    }

    public int getPrice(){
        return price;
    }
}
