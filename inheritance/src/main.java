class Student {
    int id;
    String name;
    int distance;
    static int count = 0;

    Student() {
        count++;
    }

    static int getCount() {
        return count;
    }

    void setId(int id) {
        this.id = id;
    }

    int getId() {
        return id;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setDistance(int distance) {
        this.distance = distance;
    }

    int getDistance() {
        return distance;
    }

    // 👉 toString for normal student
    public String toString() {
        return "Student ID: " + id + "\nName: " + name + "\nDistance from Home: " + distance + " km";
    }
}

// Inheriting Student class
class PlacedStudent extends Student {
    String companyName;
    String designation;

    PlacedStudent() {
        super();
        this.companyName = "Not Given";
        this.designation = "Not Assigned";
    }

    PlacedStudent(int id, String name, int distance, String companyName, String designation) {
        super(); // call parent constructor
        this.id = id;
        this.name = name;
        this.distance = distance;
        this.companyName = companyName;
        this.designation = designation;
    }

    // 👉 toString for placed student
    public String toString() {
        return super.toString() +
               "\nCompany: " + companyName +
               "\n.."
               + "+Designation: " + designation;
    }
}

// ✅ Correct Main Class
 class Tushar {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        System.out.println("Student count: " + Student.getCount());

        PlacedStudent ps1 = new PlacedStudent();
        PlacedStudent ps2 = new PlacedStudent(101, "Tushar", 12, "Infosys", "Developer");

        System.out.println("\nStudent count after placed students: " + Student.getCount());

        // 🔥 Automatically calls toString()
        System.out.println("\nPlaced Student Info:");
        System.out.println(ps2);
    }
}
