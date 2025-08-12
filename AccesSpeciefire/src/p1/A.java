package p1;

  public class A {

	protected  void myfunA()
	{
		System.out.println("hello");
	}
}
 

 class B{
	 void myfunB()
	 {
		 A  ref = new A();
		 ref.myfunA();
	 }
 }
 
 class C extends A{
	 void myfunC()
	 {
		 A  ref = new A();
		 ref.myfunA();
	 }
 }
