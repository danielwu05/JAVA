package Lab02;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Teste {
    public static void main(String[] args) throws Exception {
        InputStreamReader stream = new InputStreamReader(System.in);

        BufferedReader in = new BufferedReader(stream);

        System.out.println("Informe uma String: ");

        String teste = in.readLine();

        System.out.println("A String lida foi: " + teste);

        System.out.println("Informe um inteiro: ");

        int numero = Integer.parseInt(in.readLine());

        System.out.println("O inteiro lido foi: " + numero);
    }
}
