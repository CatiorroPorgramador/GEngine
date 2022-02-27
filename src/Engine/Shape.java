package src.Engine;

import java.awt.Graphics2D;
import java.awt.Rectangle;

import java.awt.Color;

public class Shape 
{
    // Appearance
    public Color color = Color.BLACK;
    public Rectangle rect = new Rectangle();

    // Constructor
    public Shape(Color color, Rectangle rect)
    {
        this.color = color;
        this.rect = rect;
    }

    public void init() {}

    public void update() {}

    public void render(Graphics2D graphics) 
    {
        graphics.setColor(this.color);
        graphics.fillRect(rect.x, rect.y, rect.width, rect.height);
    }
}
