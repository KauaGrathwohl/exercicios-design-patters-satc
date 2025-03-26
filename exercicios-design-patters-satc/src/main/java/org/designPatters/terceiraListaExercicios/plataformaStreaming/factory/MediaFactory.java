package org.designPatters.terceiraListaExercicios.plataformaStreaming.factory;

import org.designPatters.terceiraListaExercicios.plataformaStreaming.media.Media;

public interface MediaFactory {
    Media createMedia(String type);
}