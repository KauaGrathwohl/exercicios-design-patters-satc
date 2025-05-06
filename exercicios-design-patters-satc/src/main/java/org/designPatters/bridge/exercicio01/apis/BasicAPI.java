package org.designPatters.bridge.exercicio01.apis;

public class BasicAPI implements MediaAPI {
    public void play(String mediaType) {
        System.out.println("[BasicAPI] Reproduzindo " + mediaType + "...");
    }
    public void pause(String mediaType) {
        System.out.println("[BasicAPI] Pausando " + mediaType + "...");
    }
    public void stop(String mediaType) {
        System.out.println("[BasicAPI] Parando " + mediaType + ".");
    }
}
