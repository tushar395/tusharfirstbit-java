
public class Test {
	public static void main(String[] args) {
		try {
		int arr[]= {10,2};
		int a =arr[0];
 		int b=arr[1];
		int c;
		c =a/b;
		System.out.println("Answer is "+c);
				
				
				
			
		}
		catch(ArithmeticException   e) {
			System.out.println("plzz don't Provide  0 In b");
		}
		catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("plzz provide 0 or 1");
		}
		catch (Exception e) {	
			System.out.println(" Someting ERROR");

			
		}
		
		
	}
}



