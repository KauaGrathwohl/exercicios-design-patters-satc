package org.designPatters.terceiraListaExercicios.plataformaStreaming.media;

public class VideoMedia implements Media {
    @Override
    public void play() {
        System.out.println("Executando Vídeo...");
    }

    @Override
    public void stop() {
        System.out.println("Parando Vídeo...");
    }
}