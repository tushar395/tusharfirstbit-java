

package p1;

public class Student {
    int rollno;
    String name;
    int marks;
    
    public Student() {
		this.rollno = 0;
		this.name = "not given";
		this.marks = 0;
	}
	public Student(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "\nStudent rollno=" + rollno + ", name=" + name + ", marks=" + marks;
	}
}