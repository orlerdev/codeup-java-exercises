package abstractClassesAndInheritance.rdrAnimals;
abstract class Animal {
    protected String name;
    protected String species;
    protected double weight;
    protected boolean isLegendary;

    public Animal() {}
    public Animal(String name, String species, double weight, boolean isLegendary) {
        this.name = name;
        this.species = species;
        this.weight = weight;
        this.isLegendary = isLegendary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public boolean isLegendary() {
        return isLegendary;
    }
    public void setLegendary(boolean legendary) {
        isLegendary = legendary;
    }
}
