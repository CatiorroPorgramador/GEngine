package src.Engine;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Image;

import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

public class Sprite extends Entity
{
    // Appearance
    public Image texture = null;
    public int frame, hframes, vframes;    // ..., Horizontal Frames, Vertical Frames
    
    // Constructor
    public Sprite(Rectangle rect)
    {
        this.rect = rect;
        hframes = 1;
        vframes = 1;
    }

    // Methods
    public void load(String texture_filename)
    {
        texture = new ImageIcon(texture_filename).getImage();
    }
    
    public void load_spritesheet(String texture_filename, int hframes, int vframes) 
    {
        texture = new ImageIcon(texture_filename).getImage();
        this.hframes = hframes;
        this.vframes = vframes;

        BufferedImage a;

        
    }

    @Override
    public void render(Graphics2D graphics)
    {
        if (texture != null)
            graphics.drawImage(this.texture, rect.x, rect.y, rect.width, rect.height, null);
        else
        {
            graphics.setColor(Color.BLUE);
            graphics.fillRect(rect.x, rect.y, rect.width, rect.height);
        }
    }
}
