package org.designPatters.terceiraListaExercicios.plataformaStreaming.service;

import org.designPatters.terceiraListaExercicios.plataformaStreaming.factory.MediaFactory;
import org.designPatters.terceiraListaExercicios.plataformaStreaming.factory.MediaFactoryImpl;
import org.designPatters.terceiraListaExercicios.plataformaStreaming.media.Media;

public class StreamingService {
    public static void main(String[] args) {
        MediaFactory mediaFactory = new MediaFactoryImpl();

        try {
            Media audio = mediaFactory.createMedia("audio");
            audio.play();
            audio.stop();

            Media video = mediaFactory.createMedia("video");
            video.play();
            video.stop();

            Media podcast = mediaFactory.createMedia("podcast");
            podcast.play();
            podcast.stop();

            // Exception

            Media invalid = mediaFactory.createMedia("Inválido");
            invalid.play();
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}