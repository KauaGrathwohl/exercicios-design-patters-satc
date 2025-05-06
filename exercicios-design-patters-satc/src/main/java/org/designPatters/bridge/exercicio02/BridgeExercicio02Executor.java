package org.designPatters.bridge.exercicio02;

public class BridgeExercicio02Executor {
    public static void main(String[] args) {
        // Plataformas

        RenderingPlatform windows = new WindowsPlatform();
        RenderingPlatform linux = new LinuxPlatform();
        RenderingPlatform macos = new MacOSPlatform();
        RenderingPlatform android = new AndroidPlatform();

        // Formatos de desenho

        Drawing vectorDrawingWindows = new VectorDrawing(windows);
        Drawing bitmapDrawingLinux = new BitmapDrawing(linux);
        Drawing drawing3D = new 3DDrawing(android);

        System.out.println("### Vector Drawing on Windows ###");
        vectorDrawingWindows.drawCircle();
        vectorDrawingWindows.drawRectangle();
        vectorDrawingWindows.drawTriangle();

        System.out.println("\n### Bitmap Drawing on Linux ###");
        bitmapDrawingLinux.drawCircle();
        bitmapDrawingLinux.drawRectangle();
        bitmapDrawingLinux.drawTriangle();

        System.out.println("\n### 3D Drawing on Android ###");
        drawing3D.drawCircle();
        drawing3D.drawRectangle();
        drawing3D.drawTriangle();
    }
}
