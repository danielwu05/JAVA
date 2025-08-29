package teste;
import java.util.Scanner;

public class estudo11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double ammount;

        System.out.print("Enter the principal ammount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        ammount = principal*Math.pow(1+rate/timesCompounded,timesCompounded*years);
        System.out.print("The ammount after " +years +" is: $ " + ammount);

        scanner.close();
    }
}
