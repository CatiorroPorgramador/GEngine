package src.Engine;

import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Entity
{
    // Appearence
    public boolean alive, visible = true;

    public String name;

    public Rectangle rect = new Rectangle();
    
    // Methods
    public boolean is_colliding(Rectangle rect)
    {
        return this.rect.intersects(rect);
    }

    public void render(Graphics2D graphics) {}

    public void destroy()
    {
        alive = false;
    }
}
