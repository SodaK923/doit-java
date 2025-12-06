package cooperation;

public class TakeTrans {
    public static void main(String[] args) {
        Student studentNoel = new Student("Noel", 5000);
        Student studentLiam = new Student("Liam", 10000);

        Bus bus100 = new Bus(100);
        studentNoel.takeBus(bus100);
        studentNoel.showInfo();
        bus100.showInfo();

        Subway subway2 = new Subway(2);
        studentLiam.takeSubway(subway2);
        studentLiam.showInfo();
        subway2.showInfo();

    }
}
