package org.designPatters.bridge.exercicio01.abstractions;

public class MusicPlayer extends MediaPlayer {
    public MusicPlayer(MediaAPI api) {
        super(api);
    }

    public void play() {
        api.play("música");
    }

    public void pause() {
        api.pause("música");
    }

    public void stop() {
        api.stop("música");
    }
}
