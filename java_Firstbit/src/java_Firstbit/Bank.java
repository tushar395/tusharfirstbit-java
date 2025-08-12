package java_Firstbit;


public class Bank {
	int aac_no ;
	String Name;
	double balance;
	double i_rate=10.30;
	 
	 
	int getAac_no() {
		return aac_no;
	}
	void setAac_no(int aac_no) {
		this.aac_no = aac_no;
	}
	String getName() {
		return Name;
	}
	void setName(String name) {
		Name = name;
	}
	double getBalance() {
		return balance;
	}
	void setBalance(double balance) {
		this.balance = balance;
	}
	
		
	
	void setI_rate(double i_rate) {
		i_rate = i_rate;
	}
	 Bank(){
		 this.aac_no=0;
		 this.Name= "Not Given";
		 this.balance= 0;
		 
	 }
	 void display() {
		 System.out.println("Account Number:"+ this.aac_no);
		 System.out.println("name:"+ this.Name);
		 System.out.println("balance:"+ this.balance);
		 System.out.println("interest:");
		 
	 }
}
	
	 class Namak
	 {
		   public static void main (String[] arg) {
			   Bank b1= new Bank();
			   b1.setAac_no(101);
			   b1.setName("Tushar");
			   b1.setBalance(10);
			  
			   
			   
			   Bank b2 = new Bank();
			   b2.setAac_no(102);
			   b2.setName("raj");
			   b2.setBalance(20);
			  
			   b1.display();
			   b2.display();
			   
	
		   }
		   
		  
		   
	 }
	 
	


	
	
	
	
	
	
	

	
	

