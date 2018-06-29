import java.util.List;

public class ScrabbleTest {
    public static void main(String[] args) {
        MySingleton newInstance1 = MySingleton.getInstance();
        System.out.println("Instance Id  1 : " + System.identityHashCode(newInstance1));
        System.out.println(newInstance1.getLetterList());
        List<String> playerOneTiles = newInstance1.getTiles(7);
        System.out.println("Player 1 : "+playerOneTiles);
        System.out.println(newInstance1.getLetterList());
        MySingleton newInstance2 = MySingleton.getInstance();
        System.out.println("Instance Id  2 : " + System.identityHashCode(newInstance2));
        System.out.println(newInstance1.getLetterList());
        List<String> playerTwoTiles = newInstance1.getTiles(7);
        System.out.println("Player 2 : "+playerOneTiles);
        System.out.println(newInstance2.getLetterList());
    }
}
