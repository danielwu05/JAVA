import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Create a Scanner object to read from the console
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine(); // Read a full line of text

        System.out.print("How old are you? ");
        int age = scanner.nextInt(); // Read an integer

        System.out.println("My name is " + name + ", I'm " + age + " years old.");

        if (name.equals("Yuvin Marasini") && age==4) {
            System.out.println("You are the youngest person ever!");
        }

        // Close the scanner to release resources
        scanner.close();
    }
}