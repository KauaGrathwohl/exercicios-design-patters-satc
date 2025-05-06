package org.designPatters.bridge.exercicio01;

public class AudiobookPlayer extends MediaPlayer {
    public AudiobookPlayer(MediaAPI api) {
        super(api);
    }

    public void play() {
        api.play("audiobook");
    }

    public void pause() {
        api.pause("audiobook");
    }

    public void stop() {
        api.stop("audiobook");
    }
}
