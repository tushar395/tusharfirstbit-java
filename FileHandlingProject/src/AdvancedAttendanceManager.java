import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AdvancedAttendanceManager {
    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== Employee Attendance Manager =====");
            System.out.println("1. Check-In");
            System.out.println("2. Check-Out");
            System.out.println("3. View Today's Records");
            System.out.println("4. Search Across Days");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    recordAttendance("Check-In");
                    break;
                case 2:
                    recordAttendance("Check-Out");
                    break;
                case 3:
                    viewTodayRecords();
                    break;
                case 4:
                    searchAcrossDays();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice, try again!");
            }
        } while (choice != 5);
        System.out.println("<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3");
    }

    // Get today's file name based on date
    private static String getTodayFileName() {
        LocalDate today = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return "attendance_" + today.format(dtf) + ".txt";
    }

    // Record check-in or check-out
    private static void recordAttendance(String type) {
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        String fileName = getTodayFileName();

        try (FileWriter fw = new FileWriter(fileName, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
            String time = LocalDateTime.now().format(dtf);

            out.println(name + " " + type + " at " + time);
            System.out.println(type + " recorded successfully for " + name);

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
        System.out.println("<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3");
    }

    // View today's attendance file
    private static void viewTodayRecords() {
        String fileName = getTodayFileName();
        System.out.println("\n--- Attendance Records for Today ---");
        readFile(fileName);
        System.out.println("<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3");

    }

    // Search across multiple day files
    private static void searchAcrossDays() {
        System.out.print("Enter employee name to search: ");
        String searchName = sc.nextLine().toLowerCase();

        File currentDir = new File(".");
        File[] files = currentDir.listFiles((dir, name) -> name.startsWith("attendance_") && name.endsWith(".txt"));

        boolean foundAny = false;
        if (files != null) {
            for (File file : files) {
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    String line;
                    boolean foundInFile = false;
                    while ((line = br.readLine()) != null) {
                        if (line.toLowerCase().contains(searchName)) {
                            if (!foundInFile) {
                                System.out.println("\nFrom file: " + file.getName());
                                foundInFile = true;
                            }
                            System.out.println(line);
                            foundAny = true;
                        }
                    }
                } catch (IOException e) {
                    System.out.println("Error reading file: " + e.getMessage());
                }
            }
        }

        if (!foundAny) {
            System.out.println("No records found for: " + searchName);
        }
        System.out.println("<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3");

    }

    // Helper to read a file
    private static void readFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            boolean found = false;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                found = true;
            }
            if (!found) {
                System.out.println("No records found for today.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("No attendance file found for today.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        System.out.println("<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3<3");

    }
    
}
