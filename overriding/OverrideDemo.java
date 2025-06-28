package overriding;

public class OverrideDemo {
    public static void main(String[] args) {
        NetflixPlayer player;

        player = new MobilePlayer();  // Upcasting
        player.play("Dark");

        player = new SmartTVPlayer(); // Upcasting
        player.play("Breaking Bad");
    }
}
