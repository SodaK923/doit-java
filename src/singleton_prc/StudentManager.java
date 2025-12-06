package singleton_prc;

public class StudentManager {
    private static StudentManager studentManager;
    private StudentManager(){}

    public static StudentManager getInstance(){
        if(studentManager==null){
            studentManager = new StudentManager();
        }
        return studentManager;
    }

    public Student createStudent(String name){
        return new Student(name);
    }
}
