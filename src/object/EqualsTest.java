package object;

class Student {
    int studentID;
    String studentName;


    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    @Override
    public String toString(){
        return studentID + ", " + studentName;
    }


    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student){ // 1. 타입 비교
            // 1-1. 타입이 같은 경우
            Student std = (Student)obj; // 2. Student 타입으로 다운캐스팅
            if(this.studentID == std.studentID) // 3. 객체 비교(this: studentLee, Object: studentSang)
                return true; // 3-1. 같으므로 true
            else return false; // 3-2. 다르므로 false
        }
        return false; // 1-2. 타입이 다르므로 false
    }

    @Override
    public int hashCode(){
        return studentID;
    }
}

public class EqualsTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100, "이상원");
        Student studentLee2 = studentLee;
        Student studentSang = new Student(100, "이상원");

        if(studentLee == studentLee2){
            System.out.println("studentLee와 studentLee2의 주소는 같다.");
        }else{
            System.out.println("studentLee와 studentLee2의 주소는 다르다.");
        }

        if(studentLee.equals(studentLee2)){
            System.out.println("studentLee와 studentLee2는 동일하다.");
        }else{
            System.out.println("studentLee와 studentLee2는 동일하지 않다.");
        }

        if(studentLee == studentSang){
            System.out.println("studentLee와 studentSang의 주소는 같다.");
        }else{
            System.out.println("studentLee와 studentSang의 주소는 다르다.");
        }

        if(studentLee.equals(studentSang)){
            System.out.println("studentLee와 studentSang은 동일하다.");
        }else {
            System.out.println("studentLee와 studentSang은 동일하지 않다.");
        }

        System.out.println("studentLee의 hashCode: " + studentLee.hashCode());
        System.out.println("studentSang의 hashCode: " + studentSang.hashCode());
        System.out.println("studentLee의 실제 주솟값: " + System.identityHashCode(studentLee));
        System.out.println("studentSang의 실제 주솟값: " + System.identityHashCode(studentSang));
    }
}
