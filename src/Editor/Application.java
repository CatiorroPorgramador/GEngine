package src.Editor;

import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenu;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Color;

public class Application extends JFrame
{
    // JMenuBar & JMenu
    JMenuBar menu_bar = new JMenuBar();

    JMenu menu_project = new JMenu("Project");
    JMenuItem menu_project_save = new JMenuItem("Save Project");
    JMenuItem menu_project_open = new JMenuItem("Open Project");
    JMenuItem menu_project_quit = new JMenuItem("Quit");

    JMenu menu_editor = new JMenu("Editor");
    JMenuItem menu_editor_themes = new JMenuItem("Themes");
    JMenuItem menu_editor_quit = new JMenuItem("Quit");

    // Tabs in frame
    JTabbedPane tabs = new JTabbedPane();
    JPanel view_2d = new JPanel();

    // Constructor  
    public Application()
    {
        // Add bar in frame
        setJMenuBar(menu_bar);

        menu_bar.add(menu_project);
        menu_project.add(menu_project_save);
        menu_project.add(menu_project_open);
        menu_project.add(menu_project_quit);

        menu_bar.add(menu_editor);
        menu_editor.add(menu_editor_themes);
        menu_editor.add(menu_editor_quit);

        // Tabs in frame
        add(BorderLayout.CENTER, tabs);

        view_2d.setBackground(Color.BLACK);
        tabs.add("2D View", new _2DView());

        add(BorderLayout.WEST, new Inspector());

        add(BorderLayout.EAST, new JScrollPane(new Settings()));

        //add(view_2d);

        // Window
        setTitle("GEngine 0.1");
        setSize(new Dimension(640, 480));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Application();
    }
}