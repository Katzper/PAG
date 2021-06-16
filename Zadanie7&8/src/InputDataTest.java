import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputDataTest {

    public static boolean isNum(String s) {
        try {
            Double.parseDouble(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        var mainFrame = new JFrame("Input data");
        var openInputFrameButton = new JButton("Input");
        openInputFrameButton.setBounds(150,50,100, 40);

        var inputFrame = new JFrame("Input");
        var okButton = new JButton("OK");
        var cancelButton = new JButton("Cancel");
        okButton.setBounds(50, 100, 100, 40);
        cancelButton.setBounds(250, 100, 100, 40);

        var resultFrame = new JFrame("Output");
        var l = new JLabel("Invalid value");
        l.setBounds(75, 0, 200, 40);

        openInputFrameButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                inputFrame.setVisible(true);
            }
        });

        var textField = new JTextField(20);
        textField.setBounds(100, 50, 200, 40);

        mainFrame.add(openInputFrameButton);
        mainFrame.setSize(400,200);
        mainFrame.setLayout(null);
        mainFrame.setVisible(true);

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isNum(textField.getText())) {
                    l.setText(textField.getText());
                } else {
                    l.setText("Invalid value");
                }
                resultFrame.setVisible(true);
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputFrame.setVisible(false);
            }
        });

        inputFrame.setSize(400, 200);
        inputFrame.setLayout(null);
        inputFrame.add(textField);
        inputFrame.add(okButton);
        inputFrame.add(cancelButton);

        resultFrame.setSize(200, 100);
        resultFrame.setLayout(null);
        resultFrame.add(l);

    }
}