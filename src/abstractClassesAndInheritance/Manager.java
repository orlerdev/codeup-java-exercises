package abstractClassesAndInheritance;
public class Manager extends Employee {
    public Manager(String name, String department) {
        super(name, department);
    }
    public Manager() {
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
    public String work() {
        return "Manages personnel";
    }
}
