package teste;
import java.sql.SQLOutput;
import java.util.Scanner;

public class estudo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.println("Enter an adjective: ");
        adjective1 = scanner.nextLine();
        System.out.println("Enter a noun: ");
        noun1 = scanner.nextLine();
        System.out.println("Enter an adjective: ");
        adjective2 = scanner.nextLine();
        System.out.println("Enter a verb ending with -ing: ");
        verb1 = scanner.nextLine();
        System.out.println("Enter an adjective: ");
        adjective3 = scanner.nextLine();

        System.out.println("Today i went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a "+ noun1 + ".");
        System.out.println(noun1 + " was " +adjective2+ " and " +verb1+ "!" );
        System.out.println("It was " + adjective3 +"!");

        scanner.close();
    }
}
