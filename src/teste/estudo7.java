package teste;
import java.util.Random;
public class estudo7 {
    public static void main(String[] args) {
        Random random = new Random();

        int number1;
        int number2;
        int number3;
        double double1;
        boolean isHeads;

        number1 = random.nextInt(1,7);
        number2 = random.nextInt(1,7);
        number3 = random.nextInt(1,7);
        double1 = random.nextDouble(1,7);
        isHeads = random.nextBoolean();

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(double1);
        System.out.println(isHeads);
    }
}
