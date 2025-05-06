package org.designPatters.bridge.exercicio02.abstractions;

public class 3DDrawing extends Drawing {
    public 3DDrawing(RenderingPlatform platform) {
        super(platform);
    }

    public void drawCircle() {
        platform.renderCircle();
        System.out.println("... with 3D effect.");
    }

    public void drawRectangle() {
        platform.renderRectangle();
        System.out.println("... with 3D effect.");
    }

    public void drawTriangle() {
        platform.renderTriangle();
        System.out.println("... with 3D effect.");
    }
}
