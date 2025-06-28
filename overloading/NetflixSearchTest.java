package overloading;

public class NetflixSearchTest {
    public static void main(String[] args) {
        NetflixSearch search = new NetflixSearch();

        search.search("Dark");
        search.search("Dark", "Sci-Fi");
        search.search("Dark", "Sci-Fi", 2017);
    }
}
