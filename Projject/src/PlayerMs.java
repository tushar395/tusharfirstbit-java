//
//
//class PlayerMs {
//
//}
//class Player{
//	
//	    int jerseyNumber;
//	    String P_name ;
//	    int runs;
//	    double  wickets;
//	    double matches;
//	    double  playerCount = 0;
//	    
//	    
//	    
//	    
//		public Player(int jerseyNumber, String p_name, int runs, double wickets, double matches, double playerCount) {
//			super();
//			this.jerseyNumber = jerseyNumber;
//			P_name = p_name;
//			this.runs = runs;
//			this.wickets = wickets;
//			this.matches = matches;
//			this.playerCount = playerCount;
//		}
//		int getJerseyNumber() {
//			return jerseyNumber;
//		}
//		void setJerseyNumber(int jerseyNumber) {
//			this.jerseyNumber = jerseyNumber;
//		}
//		String getP_name() {
//			return P_name;
//		}
//		void setP_name(String p_name) {
//			P_name = p_name;
//		}
//		int getRuns() {
//			return runs;
//		}
//		void setRuns(int runs) {
//			this.runs = runs;
//		}
//		double getWickets() {
//			return wickets;
//		}
//		void setWickets(double wickets) {
//			this.wickets = wickets;
//		}
//		double getMatches() {
//			return matches;
//		}
//		void setMatches(double matches) {
//			this.matches = matches;
//		}
//		double getPlayerCount() {
//			return playerCount;
//		}
//		void setPlayerCount(double playerCount) {
//			this.playerCount = playerCount;
//		}
//	   	    
//	
//}
//class History{
//	
//Player[] PlayerArr= new Player[50];
//
//}
//	
//
//class Test {
//	public static void main (String[]  args) {
//		
//	}
//		
//		void addPlayer();{
//		       System.out.println("\n--- Player Management System ---\\n");
//		       System.out.println("1. Add Player\n");
//		       System.out.println("2. Remove Player\n");
//
//		       System.out.println("3. Search Player\n");
//		       System.out.println("4. Update Player\n");
//		       System.out.println("4. Update Player\n");
//		       System.out.println("5. Display Top Players\n");
//		       System.out.println("6. Display All Players\n");
//		       System.out.println("0. Exit\n");
//		       System.out.println("Enter your choice: ");
//		       Scanner sc=new scanner (System.in);
//		       
//		       
//		       
//}
//		
//
//}
//	
//	
	
	import java.util.Scanner;

// ------------------ Player Class -----------------------------------------------------------------------------------------------------
class Player {
    private int jerseyNumber;
    private String name;
    private int runs;
    private double wickets;
    private double matches;
    private static int playerCount = 0;

    public Player(int jerseyNumber, String name, int runs, double wickets, double matches) {
        this.jerseyNumber = jerseyNumber;
        this.name = name;
        this.runs = runs;
        this.wickets = wickets;
        this.matches = matches;
        playerCount++;
    }

    // Getters and Setters
    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public double getWickets() {
        return wickets;
    }

    public void setWickets(double wickets) {
        this.wickets = wickets;
    }

    public double getMatches() {
        return matches;
    }

    public void setMatches(double matches) {
        this.matches = matches;
    }

    public static int getPlayerCount() {
        return playerCount;
    }

    public void displayPlayer() {
        System.out.println("Jersey: " + jerseyNumber + ", Name: " + name + ", Runs: " + runs + ", Wickets: " + wickets + ", Matches: " + matches);
    }
}

// ------------------ History Class ------------------------------------------------------------------------------------------------------------------
class History {
    Player[] playerArr = new Player[50];
    int count = 0;

    void addPlayer(Player p) {
        if (count < playerArr.length) {
            playerArr[count++] = p;
            System.out.println("Player added successfully.");
        } else {
            System.out.println("Cannot add more players.");
        }
    }

    void displayAllPlayers() {
        if (count == 0) {
            System.out.println("No players to display.");
        } else {
            for (int i = 0; i < count; i++) {
                playerArr[i].displayPlayer();
            }
        }
    }
}

// ------------------ Main Test Class ----------------------------------------------------------------------------------------------------------------------
 class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        History history = new History();
        int choice;

        do {
            System.out.println("\n--- Player Management System ---");
            System.out.println("1. Add Player");
            System.out.println("2. Display All Players");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Jersey Number: ");
                    int jn = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Runs: ");
                    int runs = sc.nextInt();
                    System.out.print("Enter Wickets: ");
                    double wickets = sc.nextDouble();
                    System.out.print("Enter Matches: ");
                    double matches = sc.nextDouble();

                    Player newPlayer = new Player(jn, name, runs, wickets, matches);
                    history.addPlayer(newPlayer);
                    break;

                case 2:
                    history.displayAllPlayers();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	