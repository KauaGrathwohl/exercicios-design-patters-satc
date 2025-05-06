package org.designPatters.bridge.exercicio01.abstractions;

public abstract class MediaPlayer {
    protected MediaAPI api;

    public MediaPlayer(MediaAPI api) {
        this.api = api;
    }

    public abstract void play();
    public abstract void pause();
    public abstract void stop();
}
