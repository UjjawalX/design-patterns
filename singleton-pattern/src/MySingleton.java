import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MySingleton {
    private static MySingleton onlyInstance = null;

    String scrabbleLetters[] = {"a", "c", "d", "r", "s", "z", "g", "u", "e", "a", "c", "d", "r", "s", "z", "g", "u", "e", "a", "c", "d", "r", "s", "z", "g", "u", "e", "a", "c", "d", "r", "s", "z", "g", "u", "e"};

    List<String> letterList = new LinkedList<>(Arrays.asList(scrabbleLetters));

    static boolean firstThread = true;


    public MySingleton() {
    }

    public static MySingleton getInstance() {

        if (firstThread) {
            firstThread = false;
            Thread.currentThread();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        synchronized (MySingleton.class) {
            if (onlyInstance == null) {
                onlyInstance = new MySingleton();
                Collections.shuffle(onlyInstance.letterList);
            }
        }


        return onlyInstance;
    }

    public List<String> getLetterList() {
        return onlyInstance.letterList;
    }

    public List<String> getTiles(int howManyTiles) {
        List<String> tilesToSend = new LinkedList<>();
        for (int i = 0; i <= howManyTiles; i++) {
            tilesToSend.add(onlyInstance.letterList.remove(0));
        }
        return tilesToSend;
    }
}
