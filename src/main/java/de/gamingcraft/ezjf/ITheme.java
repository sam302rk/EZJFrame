package de.gamingcraft.ezjf;

import java.awt.*;

public interface ITheme {
    String name();

    /* ------------------------------------------------------- */

    Color background();
    Color foreground();

    /* ------------------------------------------------------- */

    default Color menubar_background() {return Color.WHITE;}
    default Color menubar_foreground() {return Color.BLACK;}
}
