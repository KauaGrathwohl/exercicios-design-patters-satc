package org.designPatters.bridge.exercicio01.abstractions;

public class VideoPlayer extends MediaPlayer {
    public VideoPlayer(MediaAPI api) {
        super(api);
    }

    public void play() {
        api.play("vídeo");
    }

    public void pause() {
        api.pause("vídeo");
    }

    public void stop() {
        api.stop("vídeo");
    }
}
