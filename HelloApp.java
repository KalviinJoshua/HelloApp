public class HelloApp {
    public static void main(String[] args) {

        String message;

        // Default case
        if (args.length == 0) {
            message = "Hello, World!";
        } else {
            // Use String.join()
            String names = String.join(", ", args);
            message = "Hello, " + names + "!";
        }

        System.out.println(message);
    }
}