import javax.swing.*;
import java.awt.*;

public class panels {
    public static void main(String[] args) {
        JLabel label = new JLabel();
        label.setText("Hello!");
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setHorizontalTextPosition(JLabel.RIGHT);
        label.setBounds(0,0,75,75);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);
        redPanel.setLayout(null);


        JPanel grayPanel = new JPanel();
        grayPanel.setBackground(Color.DARK_GRAY);
        grayPanel.setBounds(250,0,250,250);

        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);
        cyanPanel.setBounds(0,250,500,250);
        cyanPanel.setLayout(new BorderLayout());




        JFrame frame = new JFrame();
        redPanel.add(label);
        frame.add(redPanel);
        frame.add(grayPanel);
        frame.add(cyanPanel);

        frame.setSize(800,800);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
