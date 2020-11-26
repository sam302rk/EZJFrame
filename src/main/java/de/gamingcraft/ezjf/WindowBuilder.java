package de.gamingcraft.ezjf;

import java.awt.*;

public class WindowBuilder {

    private String title;
    private int width=500, height=500, x=0, y=0;
    private Image icon = null;
    private boolean resizable = true;
    private ITheme theme = null;

    public WindowBuilder(String title) {
        this.title = title;
    }

    public WindowBuilder(String title, ITheme theme) {
        this.title = title;
        this.theme = theme;
    }

    public WindowBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public WindowBuilder setWidth(int width) {
        this.width = width;
        return this;
    }

    public WindowBuilder setHeight(int height) {
        this.height = height;
        return this;
    }

    public WindowBuilder setIcon(Image icon) {
        this.icon = icon;
        return this;
    }

    public WindowBuilder setResizable(boolean resizable) {
        this.resizable = resizable;
        return this;
    }

    public WindowBuilder setTheme(ITheme theme) {
        this.theme = theme;
        return this;
    }

    public WindowBuilder setX(int x) {
        this.x = x;
        return this;
    }

    public WindowBuilder setY(int y) {
        this.y = y;
        return this;
    }

    public Window build() {
        return new Window(title, width, height, x, y, icon, resizable, theme);
    }
}
