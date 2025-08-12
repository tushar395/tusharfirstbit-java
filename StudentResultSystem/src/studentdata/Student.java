package studentdata;

public class Student {
    public String name;
    public int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}
