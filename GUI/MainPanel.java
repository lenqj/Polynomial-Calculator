package GUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Objects;

public class MainPanel extends JPanel {
    JTextField firstPolynomialTextField;
    JTextField secondPolynomialTextField;
    JTextField resultPolynomialTextField;
    JButton plusButton;
    JButton subtractButton;
    JButton multiplyButton;
    JButton divideButton;
    JButton differentiateButton;
    JButton integralButton;

    public MainPanel() {
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.PAGE_AXIS));
        contentPanel.setBorder(new EmptyBorder(20, 0, 20, 0));
        contentPanel.add(topPanel());
        contentPanel.add(new JPanel());
        contentPanel.add(new JPanel());
        contentPanel.add(bottomPanel());
        add(contentPanel);
    }
    public JPanel topPanel(){
        JPanel panel = new JPanel(new GridLayout(0,1));

        JPanel firstPolynomialPanel = new JPanel();
        JPanel secondPolynomialPanel = new JPanel();
        JPanel resultPolynomialPanel = new JPanel();

        firstPolynomialPanel.setLayout(new BoxLayout(firstPolynomialPanel, BoxLayout.X_AXIS));
        secondPolynomialPanel.setLayout(new BoxLayout(secondPolynomialPanel, BoxLayout.X_AXIS));
        resultPolynomialPanel.setLayout(new BoxLayout(resultPolynomialPanel, BoxLayout.X_AXIS));

        JLabel firstPolynomialLabel = new JLabel("First Polynomial: ");
        JLabel secondPolynomialLabel = new JLabel("Second Polynomial: ");
        JLabel resultPolynomialLabel = new JLabel("Result Polynomial: ");

        firstPolynomialPanel.add(firstPolynomialLabel);
        secondPolynomialPanel.add(secondPolynomialLabel);
        resultPolynomialPanel.add(resultPolynomialLabel);

        firstPolynomialTextField = new JTextField(15);
        secondPolynomialTextField = new JTextField(15);
        resultPolynomialTextField = new JTextField(15);

        firstPolynomialPanel.add(firstPolynomialTextField);
        secondPolynomialPanel.add(secondPolynomialTextField);
        resultPolynomialPanel.add(resultPolynomialTextField);

        panel.add(firstPolynomialPanel);
        panel.add(secondPolynomialPanel);
        panel.add(resultPolynomialPanel);

        return panel;
    }
    public JPanel bottomPanel(){
        JPanel panel = new JPanel(new GridLayout(0,2));

        plusButton = new JButton(new ImageIcon(Objects.requireNonNull(getClass().getResource("\\images\\plus.png"))));
        subtractButton = new JButton(new ImageIcon(Objects.requireNonNull(getClass().getResource("\\images\\minus.png"))));
        multiplyButton = new JButton(new ImageIcon(Objects.requireNonNull(getClass().getResource("\\images\\multiply.png"))));
        divideButton = new JButton(new ImageIcon(Objects.requireNonNull(getClass().getResource("\\images\\divide.png"))));
        differentiateButton = new JButton(new ImageIcon(Objects.requireNonNull(getClass().getResource("\\images\\differential.png"))));
        integralButton = new JButton(new ImageIcon(Objects.requireNonNull(getClass().getResource("\\images\\integral.png"))));

        panel.add(plusButton);
        panel.add(subtractButton);
        panel.add(multiplyButton);
        panel.add(divideButton);
        panel.add(differentiateButton);
        panel.add(integralButton);

        return panel;
    }
    public String getFirstPolynomialTextField() {
        if(!firstPolynomialTextField.getText().equals("")) {
            return firstPolynomialTextField.getText();
        }else{
            return "no input";
        }
    }
    public String getSecondPolynomialTextField() {
        if(!secondPolynomialTextField.getText().equals("")) {
            return secondPolynomialTextField.getText();
        }else{
            return "no input";
        }
    }
    public void setResultPolynomialTextField(String resultPolynomialTextField) { this.resultPolynomialTextField.setText(resultPolynomialTextField); }
    public void addPlusButtonListener(ActionListener lis){
        plusButton.addActionListener(lis);
    }
    public void addSubstractButtonListener(ActionListener lis){
        subtractButton.addActionListener(lis);
    }
    public void addMultiplyButtonListener(ActionListener lis){
        multiplyButton.addActionListener(lis);
    }
    public void addDivideButtonListener(ActionListener lis){
        divideButton.addActionListener(lis);
    }
    public void addDifferentiateButtonListener(ActionListener lis){
        differentiateButton.addActionListener(lis);
    }
    public void addIntegralButtonListener(ActionListener lis){
        integralButton.addActionListener(lis);
    }
}
