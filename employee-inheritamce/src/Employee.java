// Base class
class Employee {
    int empId;
    String name;
    double salary;

    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
    }
}

// Subclass 1 - Admin
class Admin extends Employee {
    String adminLevel;

    Admin(int empId, String name, double salary, String adminLevel) {
        super(empId, name, salary);
        this.adminLevel = adminLevel;
    }

    void display() {
        System.out.println("Admin Details:");
        super.display();
        System.out.println("Admin Level: " + adminLevel);
    }
}

// Subclass 2 - HR
class HR extends Employee {
    String region;

    HR(int empId, String name, double salary, String region) {
        super(empId, name, salary);
        this.region = region;
    }

    void display() {
        System.out.println("HR Details:");
        super.display();
        System.out.println("Region: " + region);
    }
}

// Subclass 3 - SalesManager
class SalesManager extends Employee {
    int targetAchieved;

    SalesManager(int empId, String name, double salary, int targetAchieved) {
        super(empId, name, salary);
        this.targetAchieved = targetAchieved;
    }

    void display() {
        System.out.println("Sales Manager Details:");
        super.display();
        System.out.println("Target Achieved: " + targetAchieved + " units");
    }
}

// Subclass of SalesManager - AreaSalesManager
class AreaSalesManager extends SalesManager {
    String areaCovered;

    AreaSalesManager(int empId, String name, double salary, int targetAchieved, String areaCovered) {
        super(empId, name, salary, targetAchieved);
        this.areaCovered = areaCovered;
    }

    void display() {
        System.out.println("Area Sales Manager Details:");
        super.display();
        System.out.println("Area Covered: " + areaCovered);
    }
}

// Main class with main method
 class EmployeeDemo {
    public static void main(String[] args) {
        Admin admin = new Admin(1001, "Tushar", 60000, "Senior Admin");
        HR hr = new HR(1002, "Sneha", 55000, "West Region");
        SalesManager sm = new SalesManager(1003, "Ravi", 65000, 120);
        AreaSalesManager asm = new AreaSalesManager(1004, "Meera", 75000, 130, "North-East India");

        System.out.println();
        admin.display();

        System.out.println();
        hr.display();

        System.out.println();
        sm.display();

        System.out.println();
        asm.display();
    }
}
