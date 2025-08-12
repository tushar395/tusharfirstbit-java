package java_Firstbit;

class employee {
	int id ;
	String name ; 
	double salary ;

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


	void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
    }
}


class company  {
	public static void main(String[] args) {
		employee e1 = new employee();
		e1.setId(101);
		e1.setName("Tushar");
		e1.setSalary(15000);
		e1.display(); 
	}
}