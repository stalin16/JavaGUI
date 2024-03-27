import javax.swing.*;
import java.awt.*;

public class MyBorderLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout()); // No need to cast
        frame.setVisible(true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.RED);
        panel2.setBackground(Color.BLUE);
        panel3.setBackground(Color.CYAN);
        panel4.setBackground(Color.ORANGE);
        panel5.setBackground(Color.PINK);

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));


        frame.add(BorderLayout.NORTH, panel1);
        frame.add(BorderLayout.SOUTH, panel2);
        frame.add(BorderLayout.EAST, panel3);
        frame.add(BorderLayout.WEST, panel4);
        frame.add(BorderLayout.CENTER, panel5);
    }
}
