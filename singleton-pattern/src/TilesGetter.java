import java.util.List;

public class TilesGetter implements Runnable {
    @Override
    public void run() {
        MySingleton newInstance1 = MySingleton.getInstance();
        System.out.println("Instance Id  1 : " + System.identityHashCode(newInstance1));
        System.out.println(newInstance1.getLetterList());
        List<String> playerOneTiles = newInstance1.getTiles(7);
        System.out.println("Player 1 : " + playerOneTiles);
        System.out.println("Got tiles");
    }
}
