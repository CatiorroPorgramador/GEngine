package src.Editor;

import java.awt.GridLayout;

import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Inspector extends JPanel
{
    public Inspector()
    {
        setLayout(new GridLayout(8, 8));
        add(new JRadioButton("FILTER"));
    }
}
