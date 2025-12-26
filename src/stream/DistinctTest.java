package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Student{
    private int id;
    private String name;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    // 직접 오버라이딩 할 경우
    @Override
    public boolean equals(Object obj) {
        // 1단계: 같은 객체인지 확인 (주소값 비교)
        if(this == obj) return true;
        // 2단계: null 체크 + 클래스 타입 체크
        if(obj == null || this.getClass() != obj.getClass()) return false;
        // 3단계: Object를 Student로 다운캐스팅
        Student student = (Student) obj;
        // 4단계: 실제 필드 값 비교
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id); // equals()와 기준이 같아야 함(name도 비교했으면 Objects.hash(id, name) 이렇게 써야 됨)
    }
}

public class DistinctTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100, "이정후");
        Student studentKim = new Student(200, "김혜성");
        Student studentLee1 = new Student(100, "이정후"); // studentLee와 물리적으로 동일하지 않음(주솟값 다름)

        List<Student> studentList = new ArrayList<>();
        studentList.add(studentLee);
        studentList.add(studentKim);
        studentList.add(studentLee1);

        studentList.stream()
                .map(Student::getName) // Student -> String 타입 변경, s -> s.getName()과 동일
                // 1. Stream<Student> → Stream<String> 으로 타입이 변경됨
                // 2. 이후 연산은 Student가 아니라 String 기준으로 수행됨
                .distinct()
                // String 클래스는 equals()가 값 비교로 이미 오버라이드되어 있어
                // 서로 다른 객체라도 내용이 같으면 중복으로 판단됨
                .forEach(System.out::println); // s -> System.out.println(s)

                // equals(), hashCode()를 직접 오버라이딩 할 경우: .map 코드 삭제
                //.forEach(s -> System.out.println(s.getName()));
    }
}
