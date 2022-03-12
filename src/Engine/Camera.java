package src.Engine;

import java.awt.Graphics2D;

public class Camera
{
    public Camera()
    {
        
    }

    public <type> void follow_object(type object, Graphics2D graphics)
    {
        graphics.translate(100, 0);
    }
}
