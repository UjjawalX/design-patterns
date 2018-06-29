public class EnemyShipFactory {
    public EnemyShip makeEnemyShip(String newShipType){
        EnemyShip enemyShip = null;
        if(newShipType.equals("U")){
            return new UFOEnemyShip();
        } else if("R".equals(newShipType)){
            return new RocketEnemyShip();
        } else if("B".equals(newShipType)) {
            return new BigUFOEnemyShip();
        } else {
            return null;
        }
    }
}
