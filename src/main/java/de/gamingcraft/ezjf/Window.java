package de.gamingcraft.ezjf;

import javax.swing.*;
import java.awt.*;

public class Window {
    JFrame frame;
    ITheme theme;

    public Window(String title, int width, int height, int x, int y, Image icon, boolean resizable, ITheme theme) {
        frame = new JFrame(title);

        frame.setSize(width, height);
        frame.setLocation(x, y);

        frame.setIconImage(icon);
        frame.setResizable(resizable);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(null);

        frame.pack();

        this.theme = theme;
        frame.setBackground(this.theme.background());

        frame.setVisible(true);
    }

    public Window(String title, int width, int height, int x, int y, Image icon, ITheme theme) {
        frame = new JFrame(title);

        frame.setSize(width, height);
        frame.setLocation(x, y);

        frame.setIconImage(icon);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(null);

        this.theme = theme;
        frame.setBackground(this.theme.background());

        frame.pack();
        frame.setVisible(true);
    }

    public Window(String title, int width, int height, int x, int y, ITheme theme) {
        frame = new JFrame(title);

        frame.setSize(width, height);
        frame.setLocation(x, y);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(null);

        this.theme = theme;
        frame.setBackground(this.theme.background());

        frame.pack();
        frame.setVisible(true);
    }

    public Window(String title, int width, int height, ITheme theme) {
        frame = new JFrame(title);

        frame.setSize(width, height);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(null);

        this.theme = theme;
        frame.setBackground(this.theme.background());

        frame.pack();
        frame.setVisible(true);
    }

    public void add(JComponent component) {
        component.setBackground(theme.background());
        component.setForeground(theme.foreground());
        frame.add(component);
    }

    public void setMenu(JMenuBar mb) {
        mb.setBackground(theme.menubar_background());
        mb.setForeground(theme.menubar_foreground());
        frame.setJMenuBar(mb);
    }

}
