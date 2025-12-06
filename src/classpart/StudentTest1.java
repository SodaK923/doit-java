package classpart;

public class StudentTest1 {
    public static void main(String[] args) {
        Student student1 = new Student(); // student1: 지역변수, 스택 메모리에 저장됨. 생성된 인스턴스는 힙 메모리에 저장됨
        // student1은 인스턴스가 아닌 인스턴스를 가리키는 참조변수
        // [스택 메모리]지역변수(student1) -> [힙 메모리]인스턴스
        student1.studentName="안연수"; // studentName: 클래스 Student의 인스턴스 변수, 힙 메모리에 저장됨
        System.out.println(student1.getStudentName());
        System.out.println(student1);

        Student student2 = new Student();
        student2.studentName="안승연";
        System.out.println(student2.getStudentName());
    }
}
