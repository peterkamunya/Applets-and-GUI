import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
public class ComradeFood extends JFrame  implements ActionListener {
    JLabel lblShow = new JLabel(("No food yet"));
    JPanel Panel = new JPanel();


    public ComradeFood() {
        super("COMRADE FOOD APPLICATIO");
        setSize(800, 600);

        JMenuItem tea = new JMenuItem("tea");
        tea.addActionListener(this);

        JMenuItem coffe = new JMenuItem("coffe");
        coffe.addActionListener(this);

        JMenuItem kangumu = new JMenuItem("Kangumu");
        kangumu.addActionListener(this);

        JMenuItem Chapati = new JMenuItem("Chapati");
        Chapati.addActionListener(this);

        JMenuItem egg = new JMenuItem("egg");
        egg.addActionListener(this);

        JMenu breakFast = new JMenu("breakFast");
        //breakfast menu being created//

        breakFast.add(tea);
        breakFast.add(coffe);
        breakFast.add(kangumu);
        breakFast.add(egg);
        //lunch menu items being created//
        JMenuItem Githeri = new JMenuItem("Githeri");
        Githeri.addActionListener(this);
        JMenuItem Ugali = new JMenuItem("Ugali");
        Ugali.addActionListener(this);
        JMenuItem sukuma = new JMenuItem("sukuma");
        sukuma.addActionListener(this);
        JMenuItem Mixyote = new JMenuItem("Mixyote");
        Mixyote.addActionListener(this);
        //creating lunch menu//
        JMenu Lunch = new JMenu("Lunch");
        Lunch.add(Githeri);
        Lunch.add(Ugali);
        Lunch.add(sukuma);
        Lunch.add(Mixyote);
        //supper items//
        JMenuItem Rice = new JMenuItem("Rice");
        Rice.addActionListener(this);
        JMenuItem Beans = new JMenuItem("Beans");
        Beans.addActionListener(this);
        JMenuItem Fish = new JMenuItem("Fish");
        Fish.addActionListener(this);

        JMenu Supper = new JMenu("Supper");
        Supper.add(Rice);
        Supper.add(Beans);
        Supper.add(Fish);


        JMenuBar mainMenu = new JMenuBar();
        mainMenu.add(breakFast);
        mainMenu.add(Lunch);
        mainMenu.add(Supper);

        setJMenuBar(mainMenu);
        setVisible(true);


    }

    public static void main(String[] args) {
        new ComradeFood();

    }

    public void actionPerformed(ActionEvent e) {
        String menuString = e.getActionCommand();
        if (menuString.equals("kangumu"))
        {
            lblShow.setText("BreakFast:Kangumu");
            Panel.setBackground(Color.BLUE);
        }
        else if(menuString.equals("coffe"))
        {
            lblShow.setText("BreakFast:coffee");
            Panel.setBackground(Color.pink);

        }
         else if (menuString.equals("tea"))
        {
            lblShow.setText("Breakfast:tea");
            Panel.setBackground(Color.yellow);
        }
    }
}
