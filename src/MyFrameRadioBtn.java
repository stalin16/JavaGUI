import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrameRadioBtn extends radioBtn implements ActionListener {
    JRadioButton pizzaBtn;
    JRadioButton burgerBtn;
    JRadioButton hotdogBtn;
    MyFrameRadioBtn(){
        JFrame frame = new JFrame();
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        pizzaBtn = new JRadioButton("pizza");
        burgerBtn = new JRadioButton("burger");
        hotdogBtn = new JRadioButton("hotdog");

        ButtonGroup btnGroup = new ButtonGroup();
        btnGroup.add(pizzaBtn);
        btnGroup.add(burgerBtn);
        btnGroup.add(hotdogBtn);

        pizzaBtn.addActionListener(this);
        burgerBtn.addActionListener(this);
        hotdogBtn.addActionListener(this);

        frame.add(pizzaBtn);
        frame.add(burgerBtn);
        frame.add(hotdogBtn);
        frame.pack();
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==pizzaBtn){
            System.out.println("You ordered pizza");
        } else if (e.getSource()==burgerBtn) {
            System.out.println("You ordered burger");
        } else if (e.getSource()==hotdogBtn){
            System.out.println("you ordered hotdog");
        } else {
            System.out.println("You have not ordered yet!");
        }
    }
}
