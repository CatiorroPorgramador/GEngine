package src.Tests;

import src.Engine.Character;
import src.Engine.Vector2;
import src.Engine.Sprite;
import src.Engine.Shape;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.event.ActionListener;
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
        setTitle("title");
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

        Shape a;

        Shape background;

        Character player;

        public test_game()
        {
            rt = Runtime.getRuntime();
            this.timer = new Timer(5, this);
            timer.start();

            setFocusable(true);
            setDoubleBuffered(true);

            addKeyListener(new keyboard());
            a = new Shape(Color.gray, new Rectangle(0, 0, 640, 480));
            background = new Shape(Color.BLUE, new Rectangle(100, 0, 50, 50));
        
            player = new Character(new Rectangle(10, 10, 50, 50));
            player.load("Player.png");
        }

        public void paint(Graphics g)
        {
            Graphics2D graphics = (Graphics2D) g;

            a.render(graphics);

            background.render(graphics);

            player.render(graphics);

            graphics.dispose();
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            player.physics_update();

            if (player.rect.intersects(background.rect))
            {
                System.out.println("x");
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
