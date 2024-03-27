import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;

public class MyFrameComboBoxes extends comboBoxes implements ActionListener {
    JComboBox comboBox;
    MyFrameComboBoxes(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

//        String[] animals = {"dog", "cat", "bird"};
//        comboBox = new JComboBox(animals);
//        comboBox.addActionListener(this);
    //    comboBox.setEditable(true);
    //    comboBox.getItemCount();
        
        frame.add(comboBox);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==comboBox){
            System.out.println(comboBox.getSelectedItem());
        }
    }
}
