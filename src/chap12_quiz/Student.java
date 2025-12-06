package chap12_quiz;

public class Student {
    private String studentId;
    private String studentName;

    public Student(String studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(studentId);
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(obj==null || this.getClass()!=obj.getClass()) return false;
        Student std = (Student) obj;
        return this.studentId.equals(std.studentId);
    }

    @Override
    public String toString() {
        return studentId+":"+studentName;
    }
}
