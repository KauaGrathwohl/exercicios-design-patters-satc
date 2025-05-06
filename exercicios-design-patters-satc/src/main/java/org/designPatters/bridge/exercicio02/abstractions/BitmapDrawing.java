package org.designPatters.bridge.exercicio02.abstractions;

public class BitmapDrawing extends Drawing {
    public BitmapDrawing(RenderingPlatform platform) {
        super(platform);
    }

    public void drawCircle() {
        platform.renderCircle();
    }

    public void drawRectangle() {
        platform.renderRectangle();
    }

    public void drawTriangle() {
        platform.renderTriangle();
    }
}
