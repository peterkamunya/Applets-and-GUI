
import javax.swing.JApplet;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.BorderLayout;

public class FullApplets  extends JApplet{
    public void init() {
        getContentPane().setBackground(Color.YELLOW);
        setLayout(new BorderLayout());
        JLabel lblApplet=new JLabel("An Applet Away keeps The doctor away");
        add(lblApplet,"Center");
    }
}
