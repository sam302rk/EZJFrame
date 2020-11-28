import de.gamingcraft.ezjf.MenuBarBuilder;
import de.gamingcraft.ezjf.Window;
import de.gamingcraft.ezjf.WindowBuilder;

import javax.swing.*;

public class Example {
    public static void main(String[] args) {

        boolean useBuilder = false;
        Window window;

        try {
            useBuilder = Boolean.parseBoolean(args[0]);
        } catch (Exception e) {
            System.out.println("Missing Argument: shouldUseBuilder (Boolean)");
        }

        if(!useBuilder) {
            window = new Window("Hello World!", 500, 500, new ExampleTheme());
        } else {
            window = new WindowBuilder("Hello World!", new ExampleTheme()).setWidth(500).setHeight(500).setResizable(false).build();
        }

        JMenuBar jmb = new MenuBarBuilder(new String[][] {
                new String[] {"File", "Select Theme", "Settings", "Exit"},
                new String[] {"Edit", "Undo", "Redo", "Cut", "Copy", "Paste", "Delete", "Find", "Replace"},
                new String[] {"Help", "Help", "Check for updates", "About"}
        }, new ExampleTheme()).build();
        window.setMenu(jmb);

        window.add(new JButton("Hello World!"));

    }
}
