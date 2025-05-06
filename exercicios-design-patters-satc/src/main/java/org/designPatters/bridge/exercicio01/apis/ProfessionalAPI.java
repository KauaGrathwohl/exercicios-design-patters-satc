package org.designPatters.bridge.exercicio01.apis;

public class ProfessionalAPI implements MediaAPI {
    public void play(String mediaType) {
        System.out.println("[ProfessionalAPI] ▶️ Execução de alta fidelidade: " + mediaType + ".");
    }
    public void pause(String mediaType) {
        System.out.println("[ProfessionalAPI] ⏸ Frame preciso pausado.");
    }
    public void stop(String mediaType) {
        System.out.println("[ProfessionalAPI] ⏹ Limpeza de buffer e parada.");
    }
}
