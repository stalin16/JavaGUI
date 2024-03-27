import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myFrameCheckBox extends checkBoxes implements ActionListener {
    JButton btn;
    JCheckBox checkBox;
     myFrameCheckBox(){
        JFrame frame = new JFrame();
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        btn = new JButton();
        btn.setText("Submit");
        btn.setFocusable(false);
        btn.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.setText("Im not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas", Font.PLAIN, 35));

        frame.add(btn);
        frame.add(checkBox);
        frame.pack();
        frame.setVisible(true);
     }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn){
            System.out.println(checkBox.isSelected());
        }
    }
}
