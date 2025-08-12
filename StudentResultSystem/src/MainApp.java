import studentdata.Student;
import studentmarks.MarksCalculator;




public class MainApp {
    public static void main(String[] args) {
        Student s1 = new Student("Tushar", 101);
        s1.displayStudentInfo();

        int[] marks = {85, 78, 90, 88, 76};
        MarksCalculator calc = new MarksCalculator(marks);

        System.out.println("Total Marks: " + calc.total());
        System.out.println("Percentage: " + calc.percentage() + "%");
        System.out.println("Result: " + calc.getResult());
    }
}
