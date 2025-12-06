package hiding;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
//        studentLee.studentName = "소다";
        studentLee.setStudentName("소다");

        System.out.println(studentLee.getStudentName());
    }
}
