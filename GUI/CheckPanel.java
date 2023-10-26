package GUI;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
public class CheckPanel extends JDialog{
    int flag;
    JCheckBox firstPolynomialCheckBox;
    JCheckBox secondPolynomialCheckBox;
    CheckPanel(JFrame frame){
        super(frame);
        flag = 0;
        setSize(200, 150);
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.PAGE_AXIS));
        contentPanel.setBorder(new EmptyBorder(20, 0, 20, 0));
        contentPanel.add(checkPanel());
        setContentPane(contentPanel);
    }
    public void setTitle(String title){
        super.setTitle(title);
    }
    public void setFlag(int value){
        this.flag = value;
    }
    public int getFlag(){
        return this.flag;
    }
    public JPanel checkPanel(){
        JPanel panel = new JPanel();

        JLabel firstPolynomialLabel = new JLabel("First Polynomial: ");
        JLabel secondPolynomialLabel = new JLabel("Second Polynomial: ");

        firstPolynomialCheckBox = new JCheckBox();
        secondPolynomialCheckBox = new JCheckBox();

        panel.add(firstPolynomialLabel);
        panel.add(firstPolynomialCheckBox);
        panel.add(secondPolynomialLabel);
        panel.add(secondPolynomialCheckBox);
        return panel;
    }
    public void setVisibleCheckPanel(boolean var){
        this.setVisible(var);
    }
    public void clearFirstPolynomialCheckBox(){
        firstPolynomialCheckBox.setSelected(false);
    }
    public void clearSecondPolynomialCheckBox(){
        secondPolynomialCheckBox.setSelected(false);
    }
    public void addFirstPolynomialCheckBoxListener(ActionListener lis){ firstPolynomialCheckBox.addActionListener(lis); }
    public void addSecondPolynomialCheckBoxListener(ActionListener lis){secondPolynomialCheckBox.addActionListener(lis); }
}
