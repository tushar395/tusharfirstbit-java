public class WeeklyTemperature {
    public static void main(String[] args) {
        // Array to store temperature values for 7 days
        int[] temperatures = {30, 32, 31, 33, 29, 28, 30};

        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        // Printing temperature for each day
        for (int i = 0; i < temperatures.length; i++) {
            System.out.println(days[i] + ": " + temperatures[i] + "°C");
        }
    }
}
