class PlayerDemo {
    int JursyNo;
    String name;
    double age;
    String gender;
    String Coach_Name;
    int DoB;
    String Addrece;
    String Experince;
    String NoofExperince;

    // Default Constructor
    PlayerDemo() {
        this.JursyNo = 0;
        this.name = "Not Given";
        this.age = 0;
        this.Coach_Name = "Not Given";
        this.DoB = 0;
        this.Addrece = "Not Given";
        this.Experince = "Not Given";
        this.gender = "Not Given";
    }

    // Full constructor
    PlayerDemo(int jursyNo, String name, double age, String gender, String coach_Name, int doB, String addrece,
               String experince, String noofExperince) {
        this.JursyNo = jursyNo;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.Coach_Name = coach_Name;
        this.DoB = doB;
        this.Addrece = addrece;
        this.Experince = experince;
        this.NoofExperince = noofExperince;
    }

//    void display() {
//        System.out.println("Player Jersey No: " + JursyNo);
//        System.out.println("Player Name: " + name);
//        System.out.println("Player Age: " + age);
//        System.out.println("Player Gender: " + gender);
//        System.out.println("Coach Name: " + Coach_Name);
//        System.out.println("Date of Birth: " + DoB);
//        System.out.println("Address: " + Addrece);
//        System.out.println("Experience: " + Experince);
//        System.out.println("Years of Experience: " + NoofExperince);
//    }
//    override 
    public String toString() {
        return "Player Details:\n" +
               "Jersey No: " + JursyNo +
               "\nName: " + name +
               "\nAge: " + age +
               "\nGender: " + gender +
               "\nCoach: " + Coach_Name +
               "\nDOB: " + DoB +
               "\nAddress: " + Addrece +
               "\nExperience: " + Experince +
               "\nYears of Experience: " + NoofExperince;
    }
}

// Subclass
class CricetPlayer extends PlayerDemo {
    int noOfWickets;
    int noOfRuns;
    int noOFLBW;
    int noOFHattriks;

    // Default constructor
    CricetPlayer() {
        super();
        this.noOfWickets = 0;
        this.noOfRuns = 0;
        this.noOFLBW = 0;
        this.noOFHattriks = 0;
    }

    // 4-parameter constructor
    CricetPlayer(int noOfWickets, int noOfRuns, int noOFLBW, int noOFHattriks) {
        super(); // Call base class constructor
        this.noOfWickets = noOfWickets;
        this.noOfRuns = noOfRuns;
        this.noOFLBW = noOFLBW;
        this.noOFHattriks = noOFHattriks;
    }

    // Full constructor
    CricetPlayer(int JursyNo, String name, double age, String gender, String Coach_Name, int DoB, String Addrece,
                 String Experince, String NoofExperince, int noOfWickets, int noOfRuns, int noOFLBW, int noOFHattriks) {
        super(JursyNo, name, age, gender, Coach_Name, DoB, Addrece, Experince, NoofExperince);
        this.noOfWickets = noOfWickets;
        this.noOfRuns = noOfRuns;
        this.noOFLBW = noOFLBW;
        this.noOFHattriks = noOFHattriks;
    }

//    void display() {
//        super.display();
//        System.out.println("No Of Runs: " + noOfRuns);
//        System.out.println("No Of Wickets: " + noOfWickets);
//        System.out.println("No Of LBWs: " + noOFLBW);
//        System.out.println("No Of Hattricks: " + noOFHattriks);
//    }
//  override
    public String toString() {
        return super.toString() +
               "\nNo of Runs: " + noOfRuns +
               "\nNo of Wickets: " + noOfWickets +
               "\nNo of LBWs: " + noOFLBW +
               "\nNo of Hattricks: " + noOFHattriks;
    }
}

//// Main class
// class Tushar {
//    public static void main(String[] args) {
//        PlayerDemo base1 = new PlayerDemo();
//        base1.display();
//        System.out.println();
//
//        PlayerDemo base2 = new PlayerDemo(1, "Tushar", 28, "Male", "Rahul Dravid", 1996, "Pune", "5 Years", "5");
//        base2.display();
//        System.out.println();
//
//        CricetPlayer cp1 = new CricetPlayer();
//        cp1.display();
//        System.out.println();
//
//        CricetPlayer cp2 = new CricetPlayer(10, 4500, 15, 5);
//        cp2.display();
//        System.out.println();
//
//        CricetPlayer cp3 = new CricetPlayer(18, "Virat", 34, "Male", "MS Dhoni", 1989, "Delhi", "12 Years", "12",
//                120, 10500, 25, 8);
//        cp3.display();
//    }
//}


 class Tushar {
    public static void main(String[] args) {
        PlayerDemo base1 = new PlayerDemo();
        PlayerDemo base2 = new PlayerDemo(1, "Tushar", 28, "Male", "Rahul Dravid", 1996, "Pune", "5 Years", "5");

        CricetPlayer cp1 = new CricetPlayer(120, 7500, 30, 5);
        CricetPlayer cp2 = new CricetPlayer(18, "Virat", 34, "Male", "MS Dhoni", 1989, "Delhi", "12 Years", "12",
                                            150, 10500, 35, 10);

        // Automatically calls toString()
        System.out.println(base1);
        System.out.println("\n" + base2);
        System.out.println("\n" + cp1);
        System.out.println("\n" + cp2);
    }
}
