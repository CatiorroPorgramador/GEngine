package src.Engine;

import java.awt.Graphics2D;
import java.awt.Rectangle;

import java.awt.Color;

public abstract class Shape
{
    // Appearance
    public Color color = Color.BLACK;
    public Rectangle rect = new Rectangle();

    public boolean alive = true;

    // Constructor
    public Shape(Color color, Rectangle rect)
    {
        this.color = color;
        this.rect = rect;
    }
    
    // Methods
    public abstract void init();

    public abstract void update();

    public void render(Graphics2D graphics) 
    {
        graphics.setColor(this.color);
        graphics.fillRect(rect.x, rect.y, rect.width, rect.height);
    }

    public void destroy()
    {
        alive = false;
    }

    public boolean is_colliding(Rectangle rect)
    {
        return this.rect.intersects(rect);
    }
}
