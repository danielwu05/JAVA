package userGUI.displayMSG;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("enter your name");
        JOptionPane.showMessageDialog(null, "Hello "+ name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your age"));
        JOptionPane.showMessageDialog(null, "you are "+ age +" years old");
        if (age > 4) {
            JOptionPane.showMessageDialog(null,"You are not the youngest person ever");
        }


        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your Height: "));
        JOptionPane.showMessageDialog(null,"You are "+ height+ " tall");
        if (height > 180) {
            JOptionPane.showMessageDialog(null,"You are tall");
        }
    }
}
