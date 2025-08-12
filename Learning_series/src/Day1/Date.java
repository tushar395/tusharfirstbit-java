package Day1;

public class Date {
	int day=29 ,Month=07,Year=2025;
	void Display() {
		System.out.println("Date is : "+ this.day + "/" +this.Month + "/" + this.Year);
	}

}

class Test{
	public static void main(String[] args) {
		Date d1= new Date();
		d1.Display();
	}
}