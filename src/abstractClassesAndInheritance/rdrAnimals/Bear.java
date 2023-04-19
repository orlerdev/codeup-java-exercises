package abstractClassesAndInheritance.rdrAnimals;
public class Bear extends Animal implements Skinnable{
    public Bear(String name, String species, double weight, boolean isLegendary) {
        super(name, species, weight, isLegendary);
    }
    public Bear() {
        super();
    }
    @Override
    public String getName() {
        return super.getName();
    }
    @Override
    public void setName(String name) {
        super.setName(name);
    }
    @Override
    public String getSpecies() {
        return super.getSpecies();
    }
    @Override
    public void setSpecies(String species) {
        super.setSpecies(species);
    }
    @Override
    public double getWeight() {
        return super.getWeight();
    }
    @Override
    public void setWeight(double weight) {
        super.setWeight(weight);
    }
    @Override
    public boolean isLegendary() {
        return super.isLegendary();
    }
    @Override
    public void setLegendary(boolean legendary) {
        super.setLegendary(legendary);
    }
    public String skin() {
        if (isLegendary()) {
            return "Legendary Bear hide";
        }
        return "Bear hide";
    }
}
