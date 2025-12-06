package chap06_quiz;

public class Person {
    private String name;
    private int money;

    public Person(String name, int money){
        this.name = name;
        this.money = money;
    }

    public void buyCoffee(Cafe cafe, String menuName, int price){
        Menu menu = cafe.makeCoffee(menuName, price);
        if(menu!=null){
            this.money -= price;
            System.out.println(name+": "+cafe.getCafeName()+"카페에서 "+menuName+"주문, 남은돈: "+money);
        }else{
            System.out.println("주문 실패");
        }
    }

//    public void showInfo(){
//        System.out.println(name+"님의 남은 돈은 "+money+"원 입니다.");
//    }
}
