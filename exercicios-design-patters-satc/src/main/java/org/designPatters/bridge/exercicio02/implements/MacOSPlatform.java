package org.designPatters.bridge.exercicio02.implements;

public class MacOSPlatform implements RenderingPlatform {
    public void renderCircle() {
        System.out.println("Rendering a Circle on MacOS.");
    }

    public void renderRectangle() {
        System.out.println("Rendering a Rectangle on MacOS.");
    }

    public void renderTriangle() {
        System.out.println("Rendering a Triangle on MacOS.");
    }
}
