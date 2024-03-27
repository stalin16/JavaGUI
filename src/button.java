import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class button {
    static JButton btn = new JButton();
    static JLabel label = new JLabel();
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        btn.setBounds(200,100,200,100);
//        btn.addActionListener(e -> System.out.println("poo"));
        btn.setText("Im am button");
        btn.setFocusable(false);

        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(btn);
    }

}
