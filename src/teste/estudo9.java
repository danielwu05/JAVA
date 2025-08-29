package teste;
import java.util.Scanner;

public class estudo9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r;
        double c;
        double a;
        double v;

        System.out.println("Enter the radius: ");
        r = scanner.nextDouble();

        c = 2 * Math.PI * r;
        a = Math.PI * Math.pow(r,2);
        v = 4.0 / 3.0 * Math.PI * Math.pow(r,3);

        System.out.printf("\nCircumference: %.1f",c);
        System.out.printf("\nArea: %.1f",a);
        System.out.printf("\nVolume: %.1f",v);

    }


}
