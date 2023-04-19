package abstractClassesAndInheritance;
public class HTMLFormatter implements Formatter {
    public String display(Employee employee) {
        return String.format(
                "<div class=\"employee\"><h2>%s(%s)</h2></div>",
                employee.getName(), employee.getDepartment()
        );
    }
}
