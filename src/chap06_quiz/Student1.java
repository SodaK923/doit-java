package chap06_quiz;

public class Student1 {
    private static int serialNum=100;
    private int studentID;

    public Student1(int studentID){
        this.studentID = studentID;
        this.studentID += serialNum;
    }

    public int getStudentID(){
        return studentID;
    }
}
