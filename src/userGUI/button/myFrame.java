package userGUI.button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class myFrame extends JFrame implements ActionListener {

    JButton button;
    myFrame() {

        ImageIcon icon = new ImageIcon("goofy.png");
        button = new JButton();

        button.setBounds(100, 250, 100, 50);
        button.setText(":3");
        button.addActionListener(this);
        button.setFont(new Font("Comic Sans",Font.ITALIC,22));
        button.setForeground(Color.GREEN);
        button.setBackground(Color.darkGray);
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            Random random = new Random();
            System.out.println("Opa sai do lugar kkkkk");

            int randX = random.nextInt(0,300);
            int randY = random.nextInt(0,300);
            int randHeight = random.nextInt(10,300);
            int randWidth = random.nextInt(10,300);

            button.setBounds(randX, randY, randWidth, randHeight);
        }
    }

}
