public class EnemyShip {
    private String name;
    private double speed;
    private double directionX;
    private double directionY;
    private double amtDamage;
    public String getName(){ return name;}
    public void setName(String newName){name = newName;}
    public double getDamage(){return amtDamage;}
    public void setDamage(double damage){amtDamage = damage;}
    public void followHeroShip(){
        System.out.println(getName()+"is following the hero ship");
    }
    public void displayEnemyShip(){
        System.out.println(getName()+"is on the screen");
    }
    public void enemyShipShoots(){
        System.out.println(getName()+ "attacks and does and "+getDamage()+" damages to hero");
    }
}
