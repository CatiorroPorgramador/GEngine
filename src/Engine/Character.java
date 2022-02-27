package src.Engine;

import java.awt.Rectangle;

public class Character extends Sprite
{
    public Vector2 movement_direction = new Vector2();

    public Rectangle rect = new Rectangle(0, 0, 50, 50);

    public Character(Rectangle rect)
    {
        super(rect);

        this.rect = rect;
    }

    public void physics_update()
    {
        rect.x += movement_direction.x;
        rect.y += movement_direction.y;
    }

    public void key_pressed(int key) {}

    public void key_released(int key) {}
}