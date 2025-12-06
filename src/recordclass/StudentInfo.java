package recordclass;

public record StudentInfo(int id, String name) {
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof StudentInfo std){
            return (this.id == std.id);
        } else return false;
    }

    public static void main(String[] args) {
        StudentInfo studentInfo = new StudentInfo(12345, "최지원");
        StudentInfo studentInfo1 = new StudentInfo(12345, "김유신");

        System.out.println(studentInfo.equals(studentInfo1));
        System.out.println(studentInfo.name());
        System.out.println(studentInfo);
    }
}
