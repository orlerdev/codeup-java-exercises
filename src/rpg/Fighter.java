package rpg;
public class Fighter {
    private String name;
    private int hitPoints;
    private int maxDamage;
    private static int armorClass = 15;
    public static int totalFighters = 0;

    public Fighter() {
        totalFighters++;
    }
    public Fighter(String name, int hitPoints, int maxDamage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.maxDamage = maxDamage;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHitPoints() {
        return hitPoints;
    }
    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }
    public int getMaxDamage() {
        return maxDamage;
    }
    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public void printStats() {
        System.out.printf("%s has %d hitpoints and does a max damage of %d, with an armor class of %d%n", name, hitPoints, maxDamage, armorClass);
    }
}
