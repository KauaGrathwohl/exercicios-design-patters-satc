package org.designPatters.bridge.exercicio02.abstractions;

public abstract class Drawing {
    protected RenderingPlatform platform;

    public Drawing(RenderingPlatform platform) {
        this.platform = platform;
    }

    public abstract void drawCircle();
    public abstract void drawRectangle();
    public abstract void drawTriangle();
}
