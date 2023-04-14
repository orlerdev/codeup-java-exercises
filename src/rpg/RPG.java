package rpg;
public class RPG {
    public static void main(String[] args) {
        Fighter warrior = new Fighter();
        warrior.setName("Thor");
        warrior.setHitPoints(345);
        warrior.setMaxDamage(1000);
        warrior.printStats();

        Fighter mage = new Fighter("Loki", 285, 780);

        mage.printStats();
    }

}
