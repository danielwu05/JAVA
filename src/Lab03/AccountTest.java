package Lab03;

public class AccountTest {
    public static void main(String[] args) {



        Account account1 = new Account();
        Account account2 = new Account();
        Account account3 = new Account();


        account1.setID(90);
        account1.setName("Lebron James");
        account1.setSaldo(90000.90);
        account1.setLimit(100.00);

        account2.setID(13);
        account2.setName("Luiz Inácio da Silva");
        account2.setSaldo(99999999999999999.99);
        account2.setLimit(1000000000000000000000.99);

        account3.setID(22);
        account3.setName("Jair Messias Bolsonaro");
        account3.setSaldo(999999999999999999999.999);
        account3.setLimit(100000000000000000000000000000000.99);

        account1.printAccInfo();
        account2.printAccInfo();
        account3.printAccInfo();

    }


}
