package org.designPatters.factoryMethod.plataformaStreaming.factory;

import org.designPatters.factoryMethod.plataformaStreaming.media.Media;

public interface MediaFactory {
    Media createMedia(String type);
}