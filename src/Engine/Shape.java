package src.Engine;

import java.awt.Graphics2D;
import java.awt.Rectangle;

import java.awt.Color;

public class Shape extends Entity
{
    // Appearance
    public Color color = Color.BLACK;

    // Constructor
    public Shape(Rectangle rect, Color color)
    {
        this.rect = rect;
        this.color = color;
    }
    
    // Methods
    @Override
    public void render(Graphics2D graphics) 
    {
        graphics.setColor(this.color);
        graphics.fillRect(rect.x, rect.y, rect.width, rect.height);
    }
}
