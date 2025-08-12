import java.util.ArrayList;
class Test {
public static void main(String[] args) {
	ArrayList <String>a1=new <String> ArrayList();
//	a1.add(10);
//	a1.add(30);
//	a1.add(20);
	a1.add("tushar");
	a1.add("Shashi");
	a1.add("Shraddha");
	      System.out.println(a1);
	for ( int i=0;i<a1.size();i++) {
		String str = (String )a1.get(i);
		System.out.println(str.charAt(i));
		

	}
	}
}
