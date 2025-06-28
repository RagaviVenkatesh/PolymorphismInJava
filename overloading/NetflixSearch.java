package overloading;

public class NetflixSearch {

    public void search(String title) {
        System.out.println("Searching for: " + title);
    }

    public void search(String title, String genre) {
        System.out.println("Searching for: " + title + " in genre: " + genre);
    }

    public void search(String title, String genre, int year) {
        System.out.println("Searching for: " + title + " in genre: " + genre + " released in: " + year);
    }
}
