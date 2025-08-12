
import java.util.LinkedList;

 class StackUsingLinkedList {
	public static void main(String[] args)
	{
		LinkedList<Integer> stack = new LinkedList<>();
		 
		stack.push(10);
		stack.push(20);
		stack.push(30);

	System.out.println("Stack ;"+stack);
	int popped = stack.pop();
  System.out.println("Popped:" +popped);
  

	int  top=stack.peek() ;
	System.out.println("top Elements:" + top);
	System.out.println("final Stack:"+ stack);
	
	
	
	}
}
