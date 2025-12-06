package chap06_quiz;

public class Cafe {
    private String cafeName;
    private Menu menuName;

    public Cafe(String cafeName, Menu menuName){
        this.cafeName = cafeName;
        this.menuName = menuName;
    }
//
//    public void buy(int money){
//        this.money += money;
//    }

    public String getCafeName(){
        return cafeName;
    }
    public Menu makeCoffee(String menu, int money){
        if(menu.equals(menuName.getMenu()) && money >= menuName.getPrice()){
            System.out.println(menu+" 제조 중..");
            return menuName;
        }else{
            return null;
        }
    }
}
