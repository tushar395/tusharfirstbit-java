package p1;
public class Worker extends Thread
{
	@Override
	public void run() {
String str="12345678901234567890123456789";
		
		for(int i=0; i<str.length(); i++) {
			System.out.print(" "+str.charAt(i));
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
	
}
 class anotherworker implements Runnable
{
	@Override
	public void run() {
String str="!@#$%^&()!@#$%^&())$+)(&^%#";
		
		for(int i=0; i<str.length(); i++) {
			System.out.print(" "+str.charAt(i));
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
	
}

class Mainthread
{
	public static void main (String[] args) {
		
		Worker w=new Worker();
		w.start();
		
		anotherworker aw=new anotherworker();
		Thread t1=new Thread(aw);
		t1.start();
		String str="abcdefghijklmnopqrstuvwxyz";
		
		for(int i=0; i<str.length(); i++) {
			System.out.print(" "+str.charAt(i));
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}