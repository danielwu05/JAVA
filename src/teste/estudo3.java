package teste;
import java.util.Scanner;

public class estudo3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); //Reset the buffer

        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();
        scanner.nextLine(); //Reset the buffer

        System.out.print("Are you a student?(True/False) ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("You are "+ age + " years old!" );
        System.out.println("Your GPA: " + gpa);

        if (isStudent){
            System.out.println("You are a Student!");
        }
        else{
            System.out.println("You are NOT a Student");
        }
        scanner.close();
    }
}
