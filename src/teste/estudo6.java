package teste;
import java.util.Scanner;

public class estudo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age;
        String name;
        boolean isStudent;

        System.out.println("Enter your name: ");
        name = scanner.nextLine();

        if (name.isEmpty()){
            System.out.println("You didn't enter your name.");
        }
        else{
            System.out.println("Hello " + name + "!");
        }

        System.out.println("Enter your age: ");
        age = scanner.nextInt();


        if (age >=65){
            System.out.println("You are a senior.");
        }
        else if (age >=18){
            System.out.println("You are an adult.");
        }
        else if (age ==0){
            System.out.println("You are a baby.");
        }
        else if (age <0){
            System.out.println("You have not been born yet.");
        }




        System.out.println("Are you a student?(True/False): ");
        isStudent = scanner.nextBoolean();


        if (isStudent){
            System.out.println("You are a student!");
        }
        else{
            System.out.println("You are not a student!");
        }




        scanner.close();
    }
}
