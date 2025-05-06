package org.designPatters.bridge.exercicio01.abstractions;

public class PodcastPlayer extends MediaPlayer {
    public PodcastPlayer(MediaAPI api) {
        super(api);
    }

    public void play() {
        api.play("podcast");
    }

    public void pause() {
        api.pause("podcast");
    }

    public void stop() {
        api.stop("podcast");
    }
}
