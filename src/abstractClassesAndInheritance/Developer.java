package abstractClassesAndInheritance;
public class Developer extends Employee implements WritesCode {
    public Developer(String name, String department) {
        super(name, department);
    }
    public Developer() {
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
    public String getDepartment() {
        return super.getDepartment();
    }
    @Override
    public void setDepartment(String department) {
        super.setDepartment(department);
    }
    public String work(){
        return "Writing code...";
    }

    public void drinkCoffee() {
        System.out.println("Drinking coffee");
    }
}
