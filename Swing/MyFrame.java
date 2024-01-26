import java.awt.*;
import javax.swing.*; 
import java.awt.event.*;
import java.awt.Color;

public class MyFrame extends JFrame {
    MyFrame(){
        setTitle("My Frame");
        setSize(500, 500);
        setLocation(250, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        JLabel label = new JLabel("Hello World");
        label.setFont(new Font("Arial", Font.BOLD, 20));
        
        /* creating a panel 
         * What are Panels? 
         * Panels are used to group components together.
         * Panels do not have a title bar and thus cannot be moved around the screen.
         * Panels are added to frames.
         * Panels can be nested inside other panels.
         * */ 
        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.RED);
        redpanel.setBounds(0, 0, 10, 20);
        
        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.BLUE);
        bluepanel.setBounds(100, 0, 100, 100);

        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.GREEN);
        greenpanel.setBounds(0, 100, 200, 100);
        
        add(label);
        add(redpanel);
        add(bluepanel);
        add(greenpanel);

    }

}
