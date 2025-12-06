package recordclass;

import java.util.Objects;

public class Student {
    private int id;
    private String name;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || this.getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return (this.id == student.id) && (Objects.equals(this.name, student.name));
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student studentLee = new Student(12345, "이순신");
        Student studentLee2 = new Student(12345, "이순신");
        System.out.println(studentLee);
        System.out.println(studentLee.equals(studentLee2));
        studentLee.setName("김유신");
        System.out.println(studentLee.getName());
    }

}
