import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myFrameColorChooser extends ColorChooser implements ActionListener {
    JFrame frame = new JFrame();
    JButton btn = new JButton();
    JLabel label = new JLabel();
    myFrameColorChooser(){

        btn = new JButton("Pick a color");
        btn.addActionListener(this);

        label = new JLabel();
        label.setBackground(Color.gray);
        label.setText("This is some text");
        label.setFont(new Font("MV Bola", Font.PLAIN, 100));
        label.setOpaque(true);

        frame.add(btn);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn){
            JColorChooser colorChooser = new JColorChooser();
            Color color = JColorChooser.showDialog(null,"Pick a color... I Guess", Color.BLACK);
            label.setForeground(color);
            label.setBackground(color);

        }
    }


}
