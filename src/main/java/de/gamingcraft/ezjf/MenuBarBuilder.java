package de.gamingcraft.ezjf;

import javax.swing.*;

public class MenuBarBuilder {

    JMenuBar menuBar = new JMenuBar();

    public MenuBarBuilder(String[][] menus, ITheme theme) {
        for (String[] m : menus) {
            JMenu menu = new JMenu(m[0]);

            menu.setForeground(theme.text());
            menu.setBackground(theme.background());

            for (String sub : m) {
                if(!sub.equalsIgnoreCase(m[0])) {
                    JMenuItem mi = new JMenuItem(sub);

                    mi.setForeground(theme.text());
                    mi.setBackground(theme.background());
                    menu.add(mi);
                }
            }
            
            menuBar.add(menu);
        }
    }

    public JMenuBar build() {
        return menuBar;
    }
}
