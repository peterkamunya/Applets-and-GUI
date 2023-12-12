import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KenyanFlagGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("I love Kenya");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel colorPanel = new JPanel();
        colorPanel.setLayout(new FlowLayout());

        JButton blackButton = createColorButton(Color.BLACK, "Black");
        JButton redButton = createColorButton(Color.RED, "Red");
        JButton greenButton = createColorButton(new Color(0, 144, 81), "Green");
        JButton whiteButton = createColorButton(Color.WHITE, "White");

        colorPanel.add(blackButton);
        colorPanel.add(redButton);
        colorPanel.add(greenButton);
        colorPanel.add(whiteButton);

        frame.add(colorPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private static JButton createColorButton(Color color, String label) {
        JButton button = new JButton(label);
        button.setBackground(color);

        /// Create an instance of the ColorButtonActionListener and attach it to the button
        ActionListener actionListener = new ColorButtonActionListener();
        button.addActionListener(actionListener);

        return button;
    }
}
