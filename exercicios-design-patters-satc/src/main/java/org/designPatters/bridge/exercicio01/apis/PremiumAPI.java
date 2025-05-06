package org.designPatters.bridge.exercicio01.apis;

public class PremiumAPI implements MediaAPI {
    public void play(String mediaType) {
        System.out.println("[PremiumAPI] 🎵 Reprodução otimizada de " + mediaType + ".");
    }
    public void pause(String mediaType) {
        System.out.println("[PremiumAPI] ⏸ Pausa suave de " + mediaType + ".");
    }
    public void stop(String mediaType) {
        System.out.println("[PremiumAPI] ⏹ Encerrando com cache salvo.");
    }
}
