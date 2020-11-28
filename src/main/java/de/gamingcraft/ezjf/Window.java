package de.gamingcraft.ezjf;

import javax.swing.*;
import java.awt.*;

public class Window {
    JFrame frame;
    ITheme theme;

    public Window(String title, int width, int height, int x, int y, Image icon, boolean resizable, ITheme theme) {
        frame = new JFrame(title);

        frame = generate(frame, width, height, theme);

        frame.setLocation(x, y);

        frame.setIconImage(icon);
        frame.setResizable(resizable);

        frame.pack();

        this.theme = theme;
        frame.setBackground(this.theme.background());

        frame.setVisible(true);
    }

    public Window(String title, int width, int height, int x, int y, Image icon, ITheme theme) {
        frame = new JFrame(title);

        frame = generate(frame, width, height, theme);
        frame.setLocation(x, y);
        frame.setIconImage(icon);

        this.theme = theme;
        frame.setBackground(this.theme.background());

        frame.pack();
        frame.setVisible(true);
    }

    public Window(String title, int width, int height, int x, int y, ITheme theme) {
        frame = new JFrame(title);

        frame = generate(frame, width, height, theme);

        frame.setLocation(x, y);


        this.theme = theme;
        frame.setBackground(this.theme.background());

        frame.pack();
        frame.setVisible(true);
    }

    public Window(String title, int width, int height, ITheme theme) {
        frame = new JFrame(title);

        frame = generate(frame, width, height, theme);

        this.theme = theme;
        frame.setBackground(this.theme.background());

        frame.pack();
        frame.setVisible(true);
    }

    private JFrame generate(JFrame frame, int width, int height, ITheme theme) {
        frame.setPreferredSize(new Dimension(width, height));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setLayout(null);

        frame.getContentPane().setBackground(theme.background());
        frame.getContentPane().setForeground(theme.text());

        return frame;
    }

    public void add(JComponent component) {
        component.setBackground(theme.component_background());
        component.setForeground(theme.text());
        component.setBounds(0, 0, 200, 35);
        frame.add(component);
    }

    public void add(JComponent component, int x, int y, int width, int height) {
        component.setBackground(theme.component_background());
        component.setForeground(theme.text());
        component.setBounds(x, y, width, height);
        frame.add(component);
    }

    public void setMenu(JMenuBar mb) {
        mb.setBackground(theme.menubar_background());
        mb.setForeground(theme.text());
        frame.setJMenuBar(mb);
        frame.pack();
    }

    public void showMessageBox(String title, String message, int messageType, Icon icon) {
        JOptionPane.showMessageDialog(frame, message, title, messageType, icon);
    }

    public void showMessageBox(String title, String message, int messageType) {
        JOptionPane.showMessageDialog(frame, message, title, messageType);
    }

}
