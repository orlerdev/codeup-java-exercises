package vehicles;
public class Vehicle {
    private String name;
    private int wheels;
    private int doors;
    private String turningType;

    public Vehicle() {}

    public Vehicle(String name, int wheels, int doors, String turningType) {
        this.name = name;
        this.wheels = wheels;
        this.doors = doors;
        this.turningType = turningType;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getWheels() {
        return wheels;
    }
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    public int getDoors() {
        return doors;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }
    public String getTurningType() {
        return turningType;
    }
    public void setTurningType(String turningType) {
        this.turningType = turningType;
    }
    public void makeNoise() {
        System.out.println("vroom");
    }

}
