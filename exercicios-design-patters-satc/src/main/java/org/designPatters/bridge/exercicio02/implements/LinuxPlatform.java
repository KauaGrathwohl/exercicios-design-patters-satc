package org.designPatters.bridge.exercicio02.implements;

public class LinuxPlatform implements RenderingPlatform {
    public void renderCircle() {
        System.out.println("Rendering a Circle on Linux.");
    }

    public void renderRectangle() {
        System.out.println("Rendering a Rectangle on Linux.");
    }

    public void renderTriangle() {
        System.out.println("Rendering a Triangle on Linux.");
    }
}
