package src.Tests;

import src.Engine.Character;
import src.Engine.Sprite;
import src.Engine.Shape;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;

public class GameTest extends JFrame
{
    Sprite player;
    
    public GameTest()
    {
        add(new test_game());
        setTitle("Test Game Engine - Shape, Character and Collision");
        setSize(new Dimension(640, 480));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GameTest();
    }

    class test_game extends JPanel implements ActionListener
    {
        Runtime rt;
        Timer timer;

        Shape background;
        Shape enemy;

        Character player;

        public test_game()
        {
            // Game Loop Settings
            rt = Runtime.getRuntime();
            this.timer = new Timer(5, this);
            timer.start();

            addKeyListener(new keyboard());

            // Game Video Settings
            setFocusable(true);
            setDoubleBuffered(true);

            // Objects
            background = new Shape(Color.GRAY, new Rectangle(0, 0, 640, 480));

            enemy = new Shape(Color.BLUE, new Rectangle(100, 0, 60, 60));

            player = new Character(new Rectangle(10, 10, 50, 50));
            player.load("Player.png");
        }

        public void paint(Graphics g)
        {
            Graphics2D graphics = (Graphics2D) g;

            background.render(graphics);

            enemy.render(graphics);

            player.render(graphics);

            graphics.dispose();
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            player.physics_update();

            if (player.rect.intersects(enemy.rect))
            {
                enemy.rect.x = 640;
            }

            repaint();
        }

        class keyboard extends KeyAdapter
        {
            @Override
            public void keyPressed(KeyEvent e)
            {
                if (e.getKeyCode() == KeyEvent.VK_D)
                    player.movement_direction.x = 1;
                
                else if (e.getKeyCode() == KeyEvent.VK_A)
                    player.movement_direction.x = -1;
            }

            @Override
            public void keyReleased(KeyEvent e)
            {
                if (e.getKeyCode() == KeyEvent.VK_D)
                    player.movement_direction.x = 0;
                
                else if (e.getKeyCode() == KeyEvent.VK_A)
                    player.movement_direction.x = 0;
            }
        }
    }
}
