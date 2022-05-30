package src.Engine;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Keyboard extends KeyAdapter
{
    int atual_key = 0x0;

    public boolean is_key_pressed(int key)
    {
        return (atual_key == key);
    }

    public void update() {}

    @Override
    public void keyPressed(KeyEvent e)
    {
        int key = e.getKeyCode();
        
        atual_key = key;
    }
}
