package src.Engine;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Sprite
{
    // Appearance
    public Image texture = null;
    public Rectangle rect = new Rectangle();

    public boolean alive = true;

    // Constructor
    public Sprite(Rectangle rect) 
    {
        this.rect = rect;
    }

    // Methods
    public void load(String texture_filename)
    {
        texture = new ImageIcon(texture_filename).getImage();
    }
    
    public void load_spritesheet(String texture_filename) {}
    
    public void render(Graphics2D graphics)
    {
        if (texture != null)
        {
            graphics.drawImage(this.texture, rect.x, rect.y, rect.width, rect.height, null);
        }
        
        else
        {
            graphics.setColor(Color.BLUE);
            graphics.fillRect(rect.x, rect.y, rect.width, rect.height);
        }
    }

    public boolean is_colliding(Rectangle rect)
    {
        return this.rect.intersects(rect);
    }

    public void destroy()
    {
        alive = false;
    }
}
