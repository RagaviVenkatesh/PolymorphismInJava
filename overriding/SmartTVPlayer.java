package overriding;

public class SmartTVPlayer extends NetflixPlayer {
    @Override
    public void play(String title) {
        System.out.println("Playing '" + title + "' on Smart TV 📺 (HD mode)");
    }
}
