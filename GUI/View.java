package GUI;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {
    public static MainPanel mainPanel;
    public TitlePanel titlePanel;
    public static CheckPanel checkPanel;
    public JPanel contentPanel;
    public View() {
        setSize(470, 400);
        setTitle("Polynomial Calculator");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new MainPanel();
        titlePanel = new TitlePanel();
        checkPanel = new CheckPanel(this);

        contentPanel = new JPanel(new BorderLayout());
        contentPanel.add(BorderLayout.NORTH, titlePanel);
        contentPanel.add(BorderLayout.CENTER, mainPanel);

        addButtonsListeners();
        setContentPane(contentPanel);
    }
    public void addButtonsListeners(){
        mainPanel.addPlusButtonListener(new Listeners.PlusButtonListener());
        mainPanel.addSubstractButtonListener(new Listeners.SubtractButtonListener());
        mainPanel.addMultiplyButtonListener(new Listeners.MultiplyButtonListener());
        mainPanel.addDivideButtonListener(new Listeners.DivideButtonListener());
        mainPanel.addDifferentiateButtonListener(new Listeners.DifferentiateButtonListener());
        mainPanel.addIntegralButtonListener(new Listeners.IntegralButtonListener());
        checkPanel.addFirstPolynomialCheckBoxListener(new Listeners.FirstPolynomialCheckBoxListener());
        checkPanel.addSecondPolynomialCheckBoxListener(new Listeners.SecondPolynomialCheckBoxListener());
    }
}

