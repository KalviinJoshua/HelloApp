public class HelloApp {
    public static void main(String[] args) {

        String message;

        // Default case
        if (args.length == 0) {
            message = "Hello, World!";
        } else {
            StringBuilder nameBuilder = new StringBuilder();

            // Enhanced for loop
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Remove trailing ", "
            String names = nameBuilder.substring(0, nameBuilder.length() - 2);

            message = "Hello, " + names + "!";
        }

        System.out.println(message);
    }
}