package singleton_prc;

public class StudentManagerTest {
    public static void main(String[] args) {
        StudentManager manager = StudentManager.getInstance();

        Student s1 = manager.createStudent("철수");
        Student s2 = manager.createStudent("영희");
        Student s3 = manager.createStudent("민수");

        System.out.println(s1.getName()+": "+s1.getStudentId());
        System.out.println(s2.getStudentId());
        System.out.println(s3.getStudentId());
    }
}
