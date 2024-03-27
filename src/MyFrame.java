import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        JFrame frame = new JFrame();
        this.setSize(420,420);
        this.setVisible(true);
        this.setTitle("JFrame title goes here");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.gray);



    }

}
