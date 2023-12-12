
import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

        import javax.swing.JButton;

public class ColorButtonActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton sourceButton = (JButton) e.getSource();
        Color backgroundColor = sourceButton.getBackground();
        sourceButton.getRootPane().getContentPane().setBackground(backgroundColor);
    }
}
