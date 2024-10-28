package practice_Question.learn.oops;

public class Student {

    private String name;
    private int rollNo;
    private double marks;

    final String schoolName = "BBPS";
    static int numberOfStudents;

    public Student(String name, int rollNo, double marks) {
        this.name = name;
        this.marks = marks;
        this.rollNo = rollNo;
        numberOfStudents++;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public double getMarks() {
        return marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNo=" + rollNo + ", marks=" + marks + ", schoolName=" + schoolName
                + ", numberOfStudents=" + numberOfStudents + "]";
    }

}
