public class ScrabbleTestThreads {
    public static void main(String[] args) {
        new Thread(new TilesGetter()).start();
        new Thread(new TilesGetter()).start();

    }
}
