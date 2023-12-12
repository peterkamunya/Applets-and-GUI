import javax.swing.*;
import java .awt.*;
public class Gui2 extends JFrame {
    public Gui2(){
        super("Second Giu application");
        setSize(500,500);
        getContentPane().setBackground(Color.GREEN);

        setLayout(new GridLayout (2,3));

        JPanel Panel1=new JPanel();
        Panel1.setLayout(new GridLayout(2,3));
        Panel1.setBackground(Color.BLUE);
        JPanel Panel2=new JPanel();
        Panel2.setLayout(new FlowLayout());
        Panel2.setBackground(Color.GREEN);
        JLabel lb1=new JLabel("Name");
        JLabel lb1Adm=new JLabel();
        JTextField txtName=new JTextField("Name");
        JTextField txtADm=new JTextField("ADmission");

        add(Panel1);
        add(Panel2);

        Panel1.add(lb1Adm);
        Panel1.add(lb1Adm);
        Panel1.add( txtName);
        Panel1.add( txtADm);
        //Creating button
        JButton BtnDispaly=new JButton("Dispaly");
        JButton Btnclear=new JButton("Clear");
        JButton BtnExit=new JButton("Exit");

        Panel2.add(BtnDispaly);
        Panel2.add(Btnclear);
        Panel2.add(BtnExit);
        setVisible(true);




    }
    public static void main(String[]args){
        new Gui2();
    }
}
