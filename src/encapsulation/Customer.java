package encapsulation;

public class Customer {
    private String name;
    private double budget;

    public Customer(String name, double budget){
        this.name = name;
        this.budget = budget;
    }

    public double getBudget(){
        return budget;
    }

    public void buyPhone(PhoneStore store, String model){
        Phone phone = store.sellPhone(model, budget);
        if(phone!=null){
            System.out.println("고객: 핸드폰 구입 완료");
        }else{
            System.out.println("고객: 핸드폰 구입 실패");
        }
    }
}
