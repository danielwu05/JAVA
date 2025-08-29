package teste;
import java.util.Scanner;

public class estudo14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight conversions program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.print("Choose an option: ");
        choice=scanner.nextInt();

        if(choice==1){
            System.out.println("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = 0.453592 * weight;
            System.out.printf("The new weight in kgs is: %.2f",newWeight);
        }
        else if(choice==2){
            System.out.println("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = 2.20462 * weight;
            System.out.printf("The new weight in lbs is: %.2f",newWeight);
        }
        else{
            System.out.println("That was not a valid choice");
        }

        scanner.close();
    }
}
