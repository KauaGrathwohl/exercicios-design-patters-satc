package org.designPatters.terceiraListaExercicios.plataformaStreaming.factory;

import org.designPatters.terceiraListaExercicios.plataformaStreaming.media.AudioMedia;
import org.designPatters.terceiraListaExercicios.plataformaStreaming.media.Media;
import org.designPatters.terceiraListaExercicios.plataformaStreaming.media.PodcastMedia;
import org.designPatters.terceiraListaExercicios.plataformaStreaming.media.VideoMedia;

public class MediaFactoryImpl implements MediaFactory {
    @Override
    public Media createMedia(String type) {
        switch (type.toLowerCase()) {
            case "audio":
                return new AudioMedia();
            case "video":
                return new VideoMedia();
            case "podcast":
                return new PodcastMedia();
            default:
                throw new IllegalArgumentException("Invalid media type: " + type);
        }
    }
}