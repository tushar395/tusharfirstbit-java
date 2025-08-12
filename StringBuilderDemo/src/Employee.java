import java.util.Date;
class Employee {
    String name;
    Date joinDate;

    Employee(String name, Date joinDate) {
        this.name = name;
        this.joinDate = joinDate;
    }
}
 class EmployeeJoinLogger {
    public static void main(String[] args) {
        // Array of 3 employees
        Employee[] employees = new Employee[3];

        // Initializing employee data
        employees[0] = new Employee("Tushar", new Date(125, 7, 1)); // Year = 2025 - 1900, Month = 0-based
        employees[1] = new Employee("Sneha", new Date(125, 7, 3));
        employees[2] = new Employee("Aman", new Date(125, 7, 5));

        // Using StringBuilder to build the message
        StringBuilder logMessage = new StringBuilder();
        logMessage.append("Employee Joining Report:\n");
        
        for (Employee emp : employees) {
            logMessage.append("Name: ").append(emp.name)
                      .append(" | Date: ").append(emp.joinDate.getDate())
                      .append("-").append(emp.joinDate.getMonth() + 1)
                      .append("-").append(emp.joinDate.getYear() + 1900)
                      .append("\n");
        }
        // Final output
        System.out.println(logMessage.toString());
    }
}
