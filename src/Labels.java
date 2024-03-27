import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Labels {
    public static void main(String[] args) {
        JLabel label = new JLabel();
        Border border = BorderFactory.createLineBorder(Color.green,3);


        label.setText("Good morning!");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.gray);
        label.setFont(new Font("MV Boli", Font.ITALIC, 20));
        label.setBackground(Color.DARK_GRAY);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(0,0 , 250, 250);

        JFrame frame = new JFrame();
        //frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        //frame.setLayout(null);
        frame.add(label);
        frame.setResizable(false);
        frame.pack();
    }
}
