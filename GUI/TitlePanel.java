package GUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class TitlePanel extends JPanel {

    private final JPanel contentPanel;
    public TitlePanel() {
        contentPanel = new JPanel();
        contentPanel.add(titlePanel());
        contentPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
        add(contentPanel);
    }
    public JPanel titlePanel(){
        JPanel panel = new JPanel();
        JLabel title = new JLabel("Polynomial Calculator");
        title.setFont(new Font("", 1, 20));
        panel.add(title);
        return panel;
    }




}
