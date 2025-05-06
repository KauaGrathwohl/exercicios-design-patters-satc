package org.designPatters.bridge.exercicio02.implements;

public class AndroidPlatform implements RenderingPlatform {
    public void renderCircle() {
        System.out.println("Rendering a Circle on Android.");
    }

    public void renderRectangle() {
        System.out.println("Rendering a Rectangle on Android.");
    }

    public void renderTriangle() {
        System.out.println("Rendering a Triangle on Android.");
    }
}
