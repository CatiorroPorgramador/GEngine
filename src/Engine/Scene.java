package src.Engine;

import java.awt.Graphics2D;

public class Scene
{
    public String name;

    // Constructor
    public Scene(String name)
    {
        this.name = name;
    }

    public Scene()
    {
        this.name = "No Name Scene";
    }

    // Methods
    public void init()
    {
        System.out.println("Scene "+this.name);
    }

    public void update()
    {

    }

    public void render(Graphics2D graphics) 
    {

    }
}
