package src.Engine;

import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Scene extends JPanel implements ActionListener
{
    public Timer timer;
    public Runtime runtime;

    public Scene()
    {
        timer = new Timer(5, this);
        runtime = Runtime.getRuntime();

        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        
    }
}
