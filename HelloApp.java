public class HelloApp {
    public static void main(String[] args) {

        String message;

        // Check if arguments exist
        if (args.length > 0) {
            // Join all names with comma and space
            String names = String.join(", ", args);
            message = "Hello, " + names + "!";
        } else {
            // Default case
            message = "Hello, World!";
        }

        // Print result
        System.out.println(message);
    }
}