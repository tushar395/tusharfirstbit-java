

// Abstract base class
abstract class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee Id: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Base Salary: ₹" + salary);
    }

    // Abstract method for calculating salary
    abstract void calsal();
}

// Subclass - Admin
class Admin extends Employee {
    String adminLevel;

    Admin(int id, String name, double salary, String adminLevel) {
        super(id, name, salary);
        this.adminLevel = adminLevel;
    }

    void display() {
        System.out.println("Admin Details:");
        super.display();
        System.out.println("Admin Level: " + adminLevel);
    }

    void calsal() {
        double bonus = 0.10 * salary;
        double total = salary + bonus;
        System.out.println("Admin Bonus: ₹" + bonus);
        System.out.println("Total Salary (with Bonus): ₹" + total);
    }
}

// Subclass - HR
class HR extends Employee {
    String region;

    HR(int id, String name, double salary, String region) {
        super(id, name, salary);
        this.region = region;
    }

    void display() {
        System.out.println("HR Details:");
        super.display();
        System.out.println("HR Region: " + region);
    }

    void calsal() {
        double allowance = 5000;
        double total = salary + allowance;
        System.out.println("HR Region Allowance: ₹" + allowance);
        System.out.println("Total Salary (with Allowance): ₹" + total);
    }
}

// Subclass - SalesManager
class SalesManager extends Employee {
    int targetAchieved;

    SalesManager(int id, String name, double salary, int targetAchieved) {
        super(id, name, salary);
        this.targetAchieved = targetAchieved;
    }

    void display() {
        System.out.println("Sales Manager Details:");
        super.display();
        System.out.println("Target Achieved: " + targetAchieved);
    }

    void calsal() {
        double incentive = 100 * targetAchieved;
        double total = salary + incentive;
        System.out.println("Sales Incentive: ₹" + incentive);
        System.out.println("Total Salary (with Incentive): ₹" + total);
    }
}

// Subclass - AreaSalesManager (inherits from SalesManager)
class AreaSalesManager extends SalesManager {
    String area;

    AreaSalesManager(int id, String name, double salary, int targetAchieved, String area) {
        super(id, name, salary, targetAchieved);
        this.area = area;
    }

    void display() {
        System.out.println("Area Sales Manager Details:");
        super.display();
        System.out.println("Area: " + area);
    }

    void calsal() {
        double incentive = 100 * targetAchieved;
        double areaBonus = 3000;
        double total = salary + incentive + areaBonus;
        System.out.println("Sales Incentive: ₹" + incentive);
        System.out.println("Area Bonus: ₹" + areaBonus);
        System.out.println("Total Salary (with Incentive + Area Bonus): ₹" + total);
    }
}

// Main class
class Demo {
    public static void main(String[] args) {
        Admin a1 = new Admin(101, "Tushar", 50000, "Junior Engineer");
        HR h1 = new HR(1002, "Sneha", 55000, "West Region");
        SalesManager s1 = new SalesManager(1003, "Ravi", 65000, 120);
        AreaSalesManager ar1 = new AreaSalesManager(1004, "Meera", 75000, 130, "North-East India");

        System.out.println();
        a1.display();
        a1.calsal();

        System.out.println();
        h1.display();
        h1.calsal();

        System.out.println();
        s1.display();
        s1.calsal();

        System.out.println();
        ar1.display();
        ar1.calsal();
    }
}
