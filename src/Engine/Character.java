package src.Engine;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

public class Character extends Sprite
{
    public Vector2 movement_direction = new Vector2();

    public Rectangle rect = new Rectangle(0, 0, 50, 50);

    // Constructor
    public Character(Rectangle rect)
    {
        super(rect);

        this.rect = rect;
    }

    // Methods
    public void physics_update()
    {
        rect.x += movement_direction.x;
        rect.y += movement_direction.y;
    }

    public void render_collision(Graphics2D graphics, Color color)
    {
        graphics.setColor(color);
        graphics.fillRect(this.rect.x, this.rect.y, this.rect.width, this.rect.height);
    }

    // Abstract Methods
    public void update(){}

    public void key_pressed(int key){}
    public void key_released(int key){}
}