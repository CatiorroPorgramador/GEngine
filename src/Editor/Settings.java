package src.Editor;

import java.awt.GridLayout;

import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Settings extends JPanel
{
    public Settings()
    {
        setLayout(new GridLayout(8, 8));
        add(new JButton("Play"));
        add(new JTextField("5"));
        add(new JRadioButton("Visible"));
        
    }
    
}
