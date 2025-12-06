package chap07_quiz;

import java.util.ArrayList;

public class StudentArrayList {
    private int studentID;
    private String name;
    private ArrayList<Student> students;

    public StudentArrayList(){
        this.studentID = studentID;
        this.name = name;
        students = new ArrayList<>();
    }

    public void addStudentList(int id, String name){
        Student student = new Student();
        student.setStudentID(id);
        student.setName(name);
        students.add(student);
    }
}
