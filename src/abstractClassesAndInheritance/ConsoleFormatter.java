package abstractClassesAndInheritance;
public class ConsoleFormatter implements Formatter {
    public String display(Employee employee) {
        return "\n name: " + employee.getName() +
               "\n email: " + employee.getDepartment();
    }
}
