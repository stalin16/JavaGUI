import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrameTextFields extends textFields implements ActionListener {
    JFrame frame = new JFrame();
    JButton btn;
    JTextField textField;
    MyFrameTextFields(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        btn = new JButton("Submit");
        btn.addActionListener(this);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolas", Font.PLAIN, 35));
        textField.setForeground(Color.GREEN);
        textField.setBackground(Color.BLACK);
        textField.setCaretColor(Color.WHITE);
        textField.setText("username");

        frame.add(btn);
        frame.add(textField);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== btn){
            System.out.println("Welcome "+textField.getText());
            btn.setEnabled(false);
            textField.setEditable(false);
        }
    }
}
