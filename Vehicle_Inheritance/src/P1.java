import java.util.*;
class Player{
	int jursyno;
	String Teamneam;
	String Playername;
	int Runs;
	int Wicket;
	int getJursyno() {
		return jursyno;
	}
	void setJursyno(int jursyno) {
		this.jursyno = jursyno;
	}
	String getTeamneam() {
		return Teamneam;
	}
	void setTeamneam(String teamneam) {
		Teamneam = teamneam;
	}
	String getPlayername() {
		return Playername;
	}
	void setPlayername(String playername) {
		Playername = playername;
	}
	int getRuns() {
		return Runs;
	}
	void setRuns(int runs) {
		Runs = runs;
	}
	int getWicket() {
		return Wicket;
	}
	void setWicket(int wicket) {
		Wicket = wicket;
	}
	Player(){
		this.jursyno=0;
		this.Teamneam="Not Given";
		this.Playername="not Given";
		this.Runs=0;
		this.Wicket=0;
		
	}
	Player(int jursyno, String teamneam, String playername, int runs, int wicket) {
		
		this.jursyno = jursyno;
		this.Teamneam = teamneam;
		this.Playername = playername;
		this.Runs = runs;
		this.Wicket = wicket;
	}
	@Override
	public String toString() {
		return "Player [jursyno=" + jursyno + ", Teamneam=" + Teamneam + ", Playername=" + Playername + ", Runs=" + Runs
				+ ", Wicket=" + Wicket + "]";
	}
	
	
	
	
	
}
//public class P1 {
//	
//	
//	public static void main(String[] args) {
//		ArrayList <String>a1=new <String> ArrayList();
////		a1.add(10);
////		a1.add(30);
////		a1.add(20);
//		a1.add("tushar");
//		a1.add("Shashi");
//		a1.add("Shraddha");
//		      System.out.println(a1);
//		for ( int i=0;i<a1.size();i++) {
//			String str = (String )a1.get(i);
//			System.out.println(str.charAt(i));
//			
//
//		}
//		}
//	}
//
//class P2 {
//public static void main (String[] args) {
//	
//	
//  
//
//	LinkedList <String> a1=new <String> LinkedList();
//		a1.add("Rohit");
//		a1.add("Dhoni");
//		a1.add("Rohit");
//		System.out.println("player is");
//		System.out.println(a1);
//	for (int i=0;i<a1.size();i++) {
//		String Str = (String)a1.get(i);
//		
//		
//		System.out.println(Str);
//		
//	}
//	
//}
//}
//
//
//
//class P3 {
//  public static void main(String[] args) {
//	
//	   TreeSet <Integer> a1= new TreeSet<>();
//	   a1.add(10);
//	   a1.add(30);
//	   a1.add(20);
//	   System.out.println(a1);
//	   
//}
//
//}


public class playerDemoCollection {
	public static void main(String[] args) {
		ArrayList <Player>p1=new ArrayList <Player>();
		p1.add(new Player(45,"MI","rohit ",20,30));
		
	}
}



















