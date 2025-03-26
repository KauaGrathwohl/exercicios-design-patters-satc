package org.designPatters.terceiraListaExercicios.plataformaStreaming.media;

public class PodcastMedia implements Media {
    @Override
    public void play() {
        System.out.println("Tocando Podcast...");
    }

    @Override
    public void stop() {
        System.out.println("Parando Podcast...");
    }
}