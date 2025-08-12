package J1;

import java.util.*;

class Player implements Comparable<Player> {

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

	Player() {
		this.jursyno = 0;
		this.Teamneam = "Not Given";
		this.Playername = "not Given";
		this.Runs = 0;
		this.Wicket = 0;

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
		return "\n Player [jursyno=" + jursyno + ", Teamneam=" + Teamneam + ", Playername=" + Playername + ", Runs="
				+ Runs + ", Wicket=" + Wicket + "]";
	}

	public int compareTo(Player p2) {
		return p2.jursyno - this.jursyno;

	}
	

}

class TusharDemo {
	public static void main7(String[] args) {
		TreeSet<Player> t1 = new TreeSet<Player>();
		Player p1 = new Player(45, "MI", "rohit ", 20, 30);
		Player p2 = new Player(18, "India", "Virat ", 20, 30);
		Player p3 = new Player(17, "csk", "raina ", 20, 30);
		t1.add(p1);
		t1.add(p2);
		t1.add(p3);
		System.out.println(t1);
	}

public static void main(String[] args) {
	HashSet<Player> h1 = new HashSet<Player>();
	Player p1 = new Player(45, "bjdhcbdjfhI", "rohit ", 20, 30);
	Player p2 = new Player(18, "India", "Virat ", 20, 30);
	Player p3 = new Player(17, "csk", "raina ", 20, 30);
	h1.add(p1);
	h1.add(p2);
	h1.add(p3);
	System.out.println(h1);
	System.out.println("End");
}

class PlayerDemoCollection {
	public static void main1(String[] args) {
		ArrayList<Player> p1 = new ArrayList<Player>();
		p1.add(new Player(45, "MI", "rohit ", 20, 30));
		System.out.println(p1);

	}

	public static void main2(String[] args) {
		LinkedList<Player> p1 = new LinkedList<Player>();
		p1.add(new Player(45, "MI", "rohit ", 20, 30));
		System.out.println(p1);

	}

	public static void main3(String[] args) {
		TreeSet<Player> p1 = new TreeSet<Player>();
		p1.add(new Player(45, "MI", "rohit ", 20, 30));
		System.out.println(p1);

	}
}
}