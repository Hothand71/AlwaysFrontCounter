import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AlwaysFrontCounter extends JFrame {

    private JLabel counterLabel;
    private JButton increaseButton;
    private JButton decreaseButton;
    private int counter = 0;

    public AlwaysFrontCounter() {
        setTitle("Yapışkan Notlar");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);

        counterLabel = new JLabel(String.valueOf(counter));
        counterLabel.setFont(new Font("Arial", Font.BOLD, 24));
        counterLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterLabel, BorderLayout.CENTER);

        increaseButton = new JButton("+");
        decreaseButton = new JButton("-");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(decreaseButton);
        buttonPanel.add(increaseButton);
        add(buttonPanel, BorderLayout.SOUTH);

        increaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter++;
                counterLabel.setText(String.valueOf(counter));
            }
        });

        decreaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter--;
                counterLabel.setText(String.valueOf(counter));
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                AlwaysFrontCounter frame = new AlwaysFrontCounter();
                frame.setVisible(true);
            }
        });

    }
}
