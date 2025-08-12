import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student  implements  Serializable {
	int rollNo;
	String Name;
	
	

	Student() {
		super();
	}


	Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		Name = name;
	}


	int getRollNo() {
		return rollNo;
	}


	void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	String getName() {
		return Name;
	}


	void setName(String name) {
		Name = name;
	}
	


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", Name=" + Name + "]";
	}

}

class Test {
	public static void main1(String[] args) {
		try {

			Student s1 = new Student(1,"Tushar ");
			
			FileOutputStream FoS = new FileOutputStream("myFile.txt");
			ObjectOutputStream Oos = new ObjectOutputStream(FoS);
			Oos.writeObject(s1);
			System.out.println("Data Stored");
		} catch (Exception e) {
			System.out.println("Not Found this File ");
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
	 FileInputStream Fis = new FileInputStream("myFile.txt");
	 ObjectInputStream ois = new ObjectInputaStream(FiS);
	 Student s1 = (Student) ois.readObject();
	 System.out.println(s1);
	 
	 
	}catch (DileNotFoundException e) {
		
	}
}

