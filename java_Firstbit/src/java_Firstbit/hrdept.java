package java_Firstbit;

public class hrdept {
	int id;
	String name;
	double salary;
	double commission;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	
	
	
	 public void display() {
	        System.out.println("HR id is: " + id);
	        System.out.println("Name: " + name);
	        System.out.println("Salary : " + salary );
	        System.out.println("commission: " + commission );
	    }

	

}


class dept{
	public static void main(String[] args) {
		hrdept a1 = new hrdept ();
		a1.setId(1);
		a1.setName("Ranjit");
		a1.setSalary(25000.0);
		a1.setCommission(1000);
		
		
		hrdept b1 = new hrdept ();
		b1.setId(2);
		b1.setName("Shubham");
		b1.setSalary(3000.0);
		b1.setCommission(2000.0);
		
		
		
		
		
		a1.display();
		b1.display();
	}
}
















