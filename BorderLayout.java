
import java.awt.*;
import javax.swing.*;
public class BorderLayout  extends JFrame{
    public BorderLayout()
    {
        super("This is border layout");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new java.awt.BorderLayout());

        JLabel label1=new JLabel("First Lbel");
        add(label1, java.awt.BorderLayout.CENTER);


    }
    public static void main(String[]args){
        BorderLayout name=new BorderLayout();
        name.setVisible(true);


    }
}
