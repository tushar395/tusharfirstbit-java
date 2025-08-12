
public class Product {
	int id ;
	String Name;
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getName() {
		return Name;
	}
	void setName(String name) {
		Name = name;
	}
	Product() {
		super();
	}
	Product(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}
	

}
class Test{
	public static void main(String[] args) {
		Product p1= new Product  (101,"Parle-G");
		Product p2= new Product  (102,"Good Day");
		Product p3= new Product  (103,"20-20");
		Product p4= new Product  (104,"Oreo");
		Product p5= new Product  (105,"Burbon");
		
	}
}