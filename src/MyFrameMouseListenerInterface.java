import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrameMouseListenerInterface extends mouseListenerInterface implements MouseListener {
    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    MyFrameMouseListenerInterface(){
        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        label.addMouseListener(this);

        frame.addMouseListener(this);
        frame.add(label);
        frame.setSize(200,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Click Mouse");
        label.setBackground(Color.yellow);

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Press Mouse");
        label.setBackground(Color.gray);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Release Mouse");
        label.setBackground(Color.black);

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Enter Mouse");
        label.setBackground(Color.orange);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Exit Mouse");
        label.setBackground(Color.blue);

    }
}
