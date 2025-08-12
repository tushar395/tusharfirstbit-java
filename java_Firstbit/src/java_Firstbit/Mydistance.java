package java_Firstbit;

class Mydistance {  

    int id;
    String name;
    double price;

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void display() {
        System.out.println("Product is: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}




class MainTest {
    public static void main(String[] args) {
    	Mydistance  d1 = new Mydistance ();
        d1.setId(1);
        d1.setName("Kanda");
        d1.setPrice(25.5);
        
        Mydistance d2 = new Mydistance();
        d2.setId(2);
        d2.setName("Batata");
        d2.setPrice(30.0);

        d1.display();
        d2.display();
    }
}



