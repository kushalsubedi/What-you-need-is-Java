import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class CalculatorFrame extends JFrame {
    private JTextField inputField1;
    private JTextField inputField2;
    private JTextField outputField;

    public CalculatorFrame() {
        setTitle("Calculator");
        setSize(400, 400);
        setLayout(new FlowLayout());  // Use a layout manager, for example, FlowLayout
        setVisible(true);
        JLabel label = new JLabel("0");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton addButton = new JButton("+");
        addButton.setBounds(50, 100, 95, 30);
        addButton.setText("Add");
                      
        JButton subtractButton = new JButton("-");
        subtractButton.setBounds(50, 100, 95, 30);
        subtractButton.setText("Subtract");
        inputField1 = new JTextField("Num1", 50);
        inputField1.setBounds(50, 100, 95, 30);
        inputField2 = new JTextField("Num2", 50);
        inputField2.setBounds(50, 100, 95, 30);
        outputField = new JTextField("Output", 50);
        outputField.setEditable(false);
        addButton.addActionListener(e -> {
            int input1 = Integer.parseInt(inputField1.getText());
            int input2 = Integer.parseInt(inputField2.getText());
            int output = input1 + input2;
            outputField.setText("" + output);
        });

        subtractButton.addActionListener(e -> {
            int input1 = Integer.parseInt(inputField1.getText());
            int input2 = Integer.parseInt(inputField2.getText());
            int output = input1 - input2;
            outputField.setText("" + output);
        });

        add(label);
        add(inputField1);
        add(inputField2);
        add(outputField);
        add(addButton);
        add(subtractButton);
    }
  
  
}

