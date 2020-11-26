package de.gamingcraft.ezjf;

import javax.swing.*;

public class MenuBarBuilder {

    JMenuBar menuBar = new JMenuBar();

    public MenuBarBuilder(String[][] menus) {
        for (String[] m : menus) {
            JMenu menu = new JMenu(m[0]);

            for (String sub : m) {
                if(!sub.equalsIgnoreCase(m[0])) {
                    menu.add(new JMenuItem(sub));
                }
            }
            
            menuBar.add(menu);
        }
    }

    public JMenuBar build() {
        return menuBar;
    }
}
