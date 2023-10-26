package GUI;

import Logic.Operations;
import Model.Polynomial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listeners {
    public static class PlusButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Operations.inputCheck(View.mainPanel.getFirstPolynomialTextField(), "First Polynomial - bad input", View.mainPanel);
            Operations.inputCheck(View.mainPanel.getSecondPolynomialTextField(), "Second Polynomial - bad input", View.mainPanel);
            Polynomial p1 = Operations.getPolynomial(View.mainPanel.getFirstPolynomialTextField());
            Polynomial p2 = Operations.getPolynomial(View.mainPanel.getSecondPolynomialTextField());
            Polynomial p3 = Operations.addPolynomial(p1, p2);
            View.mainPanel.setResultPolynomialTextField(p3.toString());
        }
    }
    static class SubtractButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Operations.inputCheck(View.mainPanel.getFirstPolynomialTextField(), "First Polynomial - bad input", View.mainPanel);
            Operations.inputCheck(View.mainPanel.getSecondPolynomialTextField(), "Second Polynomial - bad input", View.mainPanel);
            Polynomial p1 = Operations.getPolynomial(View.mainPanel.getFirstPolynomialTextField());
            Polynomial p2 = Operations.getPolynomial(View.mainPanel.getSecondPolynomialTextField());
            Polynomial p3 = Operations.subtractPolynomial(p1, p2);
            View.mainPanel.setResultPolynomialTextField(p3.toString());
        }
    }
    static class MultiplyButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Operations.inputCheck(View.mainPanel.getFirstPolynomialTextField(), "First Polynomial - bad input", View.mainPanel);
            Operations.inputCheck(View.mainPanel.getSecondPolynomialTextField(), "Second Polynomial - bad input", View.mainPanel);
            Polynomial p1 = Operations.getPolynomial(View.mainPanel.getFirstPolynomialTextField());
            Polynomial p2 = Operations.getPolynomial(View.mainPanel.getSecondPolynomialTextField());
            Polynomial p3 = Operations.multiplyPolynomial(p1, p2);
            View.mainPanel.setResultPolynomialTextField(p3.toString());
        }
    }
    static class DivideButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }
    static class DifferentiateButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            View.checkPanel.setVisibleCheckPanel(true);
            View.checkPanel.setTitle("Differentiate Calculator");
            View.checkPanel.setFlag(0);
        }
    }
    static class IntegralButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            View.checkPanel.setVisibleCheckPanel(true);
            View.checkPanel.setTitle("Integral Calculator");
            View.checkPanel.setFlag(1);
        }
    }
    static class FirstPolynomialCheckBoxListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            View.checkPanel.setVisibleCheckPanel(false);
            View.checkPanel.clearFirstPolynomialCheckBox();
            Operations.inputCheck(View.mainPanel.getFirstPolynomialTextField(), "First Polynomial - bad input", View.mainPanel);
            Polynomial p1 = Operations.getPolynomial(View.mainPanel.getFirstPolynomialTextField());
            Polynomial p2;
            if(View.checkPanel.getFlag() == 0) {
                p2 = Operations.differentiatePolynomial(p1);
            }else{
                p2 = Operations.integralPolynomial(p1);
            }
            View.mainPanel.setResultPolynomialTextField(p2.toString());
        }
    }
    static class SecondPolynomialCheckBoxListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            View.checkPanel.setVisibleCheckPanel(false);
            View.checkPanel.clearSecondPolynomialCheckBox();
            Operations.inputCheck(View.mainPanel.getSecondPolynomialTextField(), "Second Polynomial - bad input", View.mainPanel);
            Polynomial p1 = Operations.getPolynomial(View.mainPanel.getSecondPolynomialTextField());
            Polynomial p2;
            if(View.checkPanel.getFlag() == 0) {
                p2 = Operations.differentiatePolynomial(p1);
            }else{
                p2 = Operations.integralPolynomial(p1);
            }
            View.mainPanel.setResultPolynomialTextField(p2.toString());
        }
    }
}
