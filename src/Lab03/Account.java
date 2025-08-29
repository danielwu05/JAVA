package Lab03;

public class Account {
    private int ID;
    private String name;
    private double saldo;
    private double limit;


    public int getID () {
        return ID;
    }
    public String getName () {
        return name;
    }
    public double getSaldo () {
        return saldo;
    }
    public double getLimit () {
        return limit;
    }


    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }




    public void printAccInfo() {
        System.out.println("ID do mano: " +ID);
        System.out.println("Nome do mano: " +name);
        System.out.println("Saldo do mano: " +saldo);
        System.out.println("limite do mano: " +limit);
        System.out.println("---------------------------------------------------------");
    }
}