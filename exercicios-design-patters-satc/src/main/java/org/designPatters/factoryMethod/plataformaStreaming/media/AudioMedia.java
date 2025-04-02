package org.designPatters.factoryMethod.plataformaStreaming.media;

public class AudioMedia implements Media {
    @Override
    public void play() {
        System.out.println("Executando Áudio...");
    }

    @Override
    public void stop() {
        System.out.println("Parando Áudio...");
    }
}