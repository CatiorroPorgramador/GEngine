package src.Test;

import javax.swing.JFrame;

public class App extends JFrame
{
    public App()
    {
        add(new Game());
        setTitle("GEngine 0.1 - Jogo teste");
        setSize(640, 480);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new App();
    }
}
