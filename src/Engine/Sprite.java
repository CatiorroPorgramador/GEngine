package src.Engine;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Sprite extends Entity
{
    // Appearance
    public BufferedImage texture = null;
    public int frame, hframes, vframes;    // ..., Horizontal Frames, Vertical Frames
    float angle;
    
    // Constructor
    public Sprite(Rectangle rect)
    {
        this.rect = rect;
        hframes = 1;
        vframes = 1;
        frame = 0;
        angle = 90f;
    }

    // Methods
    public void load(String texture_filename)
    {
        try
        {
            texture = ImageIO.read(new File(texture_filename));
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
    public BufferedImage get_frame()
    {
        return texture.getSubimage(
            frame*texture.getWidth()/hframes, 0, texture.getWidth(null)/hframes,
            texture.getHeight(null)/vframes
        );
    }

    @Override
    public void render(Graphics2D graphics)
    {
        if (texture != null)
            graphics.drawImage(this.get_frame(), rect.x, rect.y, rect.width, rect.height, null);
        else
        {
            graphics.setColor(Color.BLUE);
            graphics.fillRect(rect.x, rect.y, rect.width, rect.height);
        }
    }
}
