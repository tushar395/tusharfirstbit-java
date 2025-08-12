
public class  Area {
	    void area(float base, float height) 
	    {
	        System.out.println("Area of Triangle: " + (0.5 * base * height));
	    }

	    Area() {
			super();
		}

		void area(int length, int breadth) {
	        System.out.println("Area of Rectangle: " + (length * breadth));
	    }

	    void area(double radius) {
	        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
	    }
	}
class abs{
	 public static void main(String[] args) {
		 Area s = new Area();
        s.area(3f, 4f);
        s.area(5, 7);
        s.area(2.5);

	}
}
