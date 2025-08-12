package studentmarks;

public class MarksCalculator {
    private int[] marks;

    public MarksCalculator(int[] marks) {
        this.marks = marks;
    }

    public int total() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum;
    }

    public float percentage() {
        return total() / (float) marks.length;
    }

    public String getResult() {
        return percentage() >= 40 ? "Pass" : "Fail";
    }
}
