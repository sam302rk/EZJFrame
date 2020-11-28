import de.gamingcraft.ezjf.ITheme;

import java.awt.*;

public class ExampleTheme implements ITheme {
    @Override
    public String name() {
        return "Theme";
    }

    @Override
    public Color text() {
        return Color.BLACK;
    }

    @Override
    public Color background() {
        return Color.WHITE;
    }

    @Override
    public Color menubar_background() {
        return Color.LIGHT_GRAY;
    }

    @Override
    public Color component_background() {
        return Color.LIGHT_GRAY;
    }
}
