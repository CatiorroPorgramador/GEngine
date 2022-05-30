package src.Test;

import src.Engine.*;

import javax.swing.JFrame;

import java.awt.image.BufferStrategy;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Graphics2D;

public class App extends Canvas implements Runnable
{
    // Sprite
    Sprite sprite;

    // Constructor
    public App()
    {
        setPreferredSize(new Dimension(640, 480));

        sprite = new Sprite(new Rectangle(20, 20, 16*3, 28*3));
        sprite.load("sprite.png");
        sprite.hframes = 4;
        sprite.frame = 4;
    }

    public static void main(String[] args)
    {
        App app = new App();

        // Window
        JFrame jframe = new JFrame("Test Engine");
        jframe.add(app);
        jframe.setSize(new Dimension(640, 480));
        jframe.setLocationRelativeTo(null);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.pack();
        jframe.setVisible(true);

        // Thread
        new Thread(app).start();
    }

    // Methods
    public void init()
    {

    }

    public void update()
    {

    }

    public void render()
    {
        BufferStrategy bs = this.getBufferStrategy();

        if (bs == null)
        {
            System.out.println("'App->BufferStrategy' not exist!");
            this.createBufferStrategy(3);
            System.out.println("'App->BufferStrategy' Created!");
            return;
        }

        Graphics g = (Graphics) bs.getDrawGraphics();
        Graphics2D graphics = (Graphics2D) g;

        sprite.render(graphics);

        bs.show();
        graphics.dispose();
    }

    // Run
    @Override
    public void run()
    {
        init();

        while (true)
        {
            update();
            render();

            try
            {
                Thread.sleep(1000/60);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
