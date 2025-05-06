package org.designPatters.bridge.exercicio02.abstractions;

public class VectorDrawing extends Drawing {
    public VectorDrawing(RenderingPlatform platform) {
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
