
import java.util.LinkedList;

 class QueueUsingLinkedList {
	public static void main(String[] args)
	{
		LinkedList<Integer>Queue= new LinkedList<>();
		 
		Queue.add(10);
		Queue.add(20);
		Queue.add(30);

	System.out.println("Queue ;"+Queue);
	int removed =Queue.removed();
  System.out.println("remove:" +removed);
  

	int  front=removed.peek() ;
	System.out.println("top Elements:" + top);
	System.out.println("final Stack:"+ stack);
	
	
	
	}
}
