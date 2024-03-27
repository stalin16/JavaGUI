import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrameKeyListenerInterface  extends keyListenerInterface implements KeyListener {
    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    MyFrameKeyListenerInterface(){
        label.setBounds(0,0,100,100);
        label.setOpaque(true);
        label.setBackground(Color.red);

        frame.add(label);
        frame.addKeyListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()){
            case 'a': label.setLocation(label.getX()-100,label.getY());
                break;
            case 'w': label.setLocation(label.getX(), label.getY()-100);
                break;
            case 's': label.setLocation(label.getX(),label.getY()+100);
                break;
            case 'd': label.setLocation(label.getX()+100,label.getY());
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case 37: label.setLocation(label.getX()-100,label.getY());
            break;
            case 38: label.setLocation(label.getX(), label.getY()-100);
            break;
            case 40: label.setLocation(label.getX(),label.getY()+100);
            break;
            case 39: label.setLocation(label.getX()+100,label.getY());
            break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
