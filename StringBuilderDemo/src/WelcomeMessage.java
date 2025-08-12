public class WelcomeMessage {
    public static void main(String[] args) {
        String userName = "Tushar";

        // Using StringBuilder to build a dynamic message
        StringBuilder message = new StringBuilder();

        message.append("Hello ").append(userName).append(", ");
        message.append("welcome back to the system! ");
        message.append("Hope you have a great day ahead.");

        // Output the final message
        System.out.println(message.toString());
    }
}
