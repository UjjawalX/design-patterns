import java.util.Scanner;

public class WorldWar {
    public static void main(String[] args) {
        EnemyShipFactory enemyShipFactory = new EnemyShipFactory();
        EnemyShip enemyShip = null;
        System.out.println("Please enter enemyShip. (   U/R/N )");
        Scanner userIn = new Scanner(System.in);
        if (userIn.hasNextLine()) {
            String typeOfShip = userIn.nextLine();
            enemyShip = enemyShipFactory.makeEnemyShip(typeOfShip);
            if (enemyShip != null) {
                doStuffEnemy(enemyShip);
            } else System.out.println("Please enter  U/R/N ");
        }
    }

    public static void doStuffEnemy(EnemyShip anEnemyShip) {
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }
}
