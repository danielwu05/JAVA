package teste;
import java.util.Scanner;

public class estudo8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.println("Enter the length of side A: ");
        a = scanner.nextDouble();
        System.out.println("Enter the length of side B: ");
        b = scanner.nextDouble();

        c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));

        System.out.println("The hypothenuse is "+c);

        scanner.close();

    }
}
