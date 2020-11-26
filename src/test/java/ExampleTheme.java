import de.gamingcraft.ezjf.ITheme;

import java.awt.*;

public class ExampleTheme implements ITheme {
    @Override
    public String name() {
        return "Example";
    }

    @Override
    public Color background() {
        return Color.WHITE;
    }

    @Override
    public Color foreground() {
        return Color.BLACK;
    }

    @Override
    public Color menubar_background() {
        return Color.WHITE;
    }

    @Override
    public Color menubar_foreground() {
        return Color.BLACK;
    }
}
