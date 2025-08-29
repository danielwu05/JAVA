package teste;
import java.util.Scanner;

public class estudo13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String email;

        System.out.println("Enter your email: ");
        email=scanner.nextLine();

        if(email.contains("@")){
            String username;
            String domain;
            username = email.substring(0,email.indexOf("@"));
            domain = email.substring(email.indexOf("@")+1);
            System.out.println(username);
            System.out.println(domain);
        }
        else{
            System.out.println("email must contain @");
        }






        scanner.close();
    }
}
