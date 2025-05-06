package org.designPatters.bridge.exercicio01;

public class BridgeExercicio01Executor {
    public static void main(String[] args) {
        MediaAPI basic = new BasicAPI();
        MediaAPI premium = new PremiumAPI();
        MediaAPI pro = new ProfessionalAPI();

        MediaPlayer music = new MusicPlayer(basic);
        MediaPlayer video = new VideoPlayer(premium);
        MediaPlayer podcast = new PodcastPlayer(pro);
        MediaPlayer audiobook = new AudiobookPlayer(premium);

        music.play();
        music.pause();
        music.stop();

        System.out.println();

        video.play();
        video.pause();
        video.stop();

        System.out.println();

        podcast.play();
        podcast.pause();
        podcast.stop();

        System.out.println();

        audiobook.play();
        audiobook.pause();
        audiobook.stop();
    }
}
