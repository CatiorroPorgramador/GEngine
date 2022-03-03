package src.Test;

import java.awt.Rectangle;

import src.Engine.Character;

import java.awt.event.KeyEvent;

public class Player extends Character
{
    public int speed = 5;

    public Player(Rectangle rect) {
        super(rect);
    }

    @Override
    public void update() {
        
    }

    // Methods
    @Override
    public void key_pressed(int key) {
        if (key == KeyEvent.VK_A)
            movement_direction.x = -5;
        
        else if (key == KeyEvent.VK_D)
            movement_direction.x = 5;
    }

    @Override
    public void key_released(int key) {
        if (key == KeyEvent.VK_A)
            movement_direction.x = 0;
        
        else if (key == KeyEvent.VK_D)
            movement_direction.x = 0;
    }
}
