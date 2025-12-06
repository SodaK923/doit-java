package chap06_quiz;

public class Student1Card {
    public static void main(String[] args) {
        Student1 std1 = new Student1(1200);
        Student1 std2 = new Student1(1400);

        System.out.println(std1.getStudentID());
        System.out.println(std2.getStudentID());
    }
}
