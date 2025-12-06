package staticex;

public class StudentTest3 {
    public static void main(String[] args) {
        Student1 studentLee = new Student1();
        studentLee.setStudentName("이정후");
        System.out.println(Student1.serialNum);
        System.out.println(studentLee.studentName+" 학번: "+studentLee.studentID);

    }
}
