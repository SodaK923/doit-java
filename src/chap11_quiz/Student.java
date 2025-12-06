package chap11_quiz;

public class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return name + ", " + id;
    }

    public static void main(String[] args) {
        Student std = new Student("이정후", 11111);
        System.out.println(std);
        System.out.println(std.toString());
    }
}
