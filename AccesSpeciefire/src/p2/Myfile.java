package p2;



 class Myfile {
	void myfunX()
	{
		 p1.A ref = new p1.A();
		 ref.myfunA();
	}

}

class Y extends p1.A{
	void  myfunY()
	{
		 p1.A  ref = new p1.A();
		 ref.myfun();
		 super.myfunA();
		 this.myfunY();
	}

}
