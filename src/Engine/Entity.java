package src.Engine;

import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Entity
{
    // Appearence
    public boolean alive = true;
    public Rectangle rect = new Rectangle();
    
    // Methods
    public boolean is_colliding(Rectangle rect)
    {
        return this.rect.intersects(rect);
    }

    public void render(Graphics2D graphics) 
    {
        System.out.print("s");
    }

    public void destroy()
    {
        alive = false;
    }
}
