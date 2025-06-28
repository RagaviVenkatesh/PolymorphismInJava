package overriding;

public class MobilePlayer extends NetflixPlayer {
    @Override
    public void play(String title) {
        System.out.println("Playing '" + title + "' on mobile 📱 (low data mode)");
    }
}
