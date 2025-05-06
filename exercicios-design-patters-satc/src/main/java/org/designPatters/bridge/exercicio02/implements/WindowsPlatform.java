package org.designPatters.bridge.exercicio02.implements;

public class WindowsPlatform implements RenderingPlatform {
    public void renderCircle() {
        System.out.println("Rendering a Circle on Windows.");
    }

    public void renderRectangle() {
        System.out.println("Rendering a Rectangle on Windows.");
    }

    public void renderTriangle() {
        System.out.println("Rendering a Triangle on Windows.");
    }
}
