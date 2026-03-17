public class HelloApp {

    public static void main(String[] args) {

        String name = (args.length > 0) ? args[0] : "World";

        System.out.println("Hello, " + name + "!");
    }
}