package singleton_prc;

public class Student {
    private static int nextId=1000;
    private int studentId;
    private String name;

    public Student(String name){
        nextId++;
        studentId = nextId;
        this.name = name;
    }

    public int getStudentId(){
        return studentId;
    }

    public String getName(){
        return name;
    }
}
