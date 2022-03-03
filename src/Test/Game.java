package src.Test;

import src.Engine.*;

import javax.swing.Box;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;

public class Game extends JPanel implements ActionListener
{
    Timer timer;
    Runtime runtime;

    Shape background;

    Player player;

    Shape box;

    public Game()
    {
        setFocusable(true);
        setDoubleBuffered(true);

        timer = new Timer(5, this);
        runtime = Runtime.getRuntime();

        timer.start();

        addKeyListener(new keyboard());

        background = new Shape(new Rectangle(0, 0, 640, 480), Color.GRAY);

        box = new Shape(new Rectangle(100, 0, 50, 50), Color.black);

        player = new Player(new Rectangle(0, 0, 80, 80));
        player.load("Player.png");
    }

    @Override
    public void paint(Graphics g)
    {
        Graphics2D graphics = (Graphics2D) g;

        background.render(graphics);

        player.render(graphics);

        box.render(graphics);

        graphics.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        player.physics_update();
        
        if (player.is_colliding(box.rect))
        {
            System.exit(0);
        }

        repaint();
    }

    private class keyboard extends KeyAdapter
    {
        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();

            player.key_pressed(key);
        }

        @Override
        public void keyReleased(KeyEvent e) {
            int key = e.getKeyCode();

            player.key_released(key);
        }
    }
}
