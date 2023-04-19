package abstractClassesAndInheritance;
public class Main {
    public static void main(String[] args) {
        Employee dev1 = new Developer();
        Employee manager1 = new Manager();
        Formatter fmt = new ConsoleFormatter();

        Employee[] searchResults = {dev1, manager1};

        fmt.display(dev1);
        for (Employee employee : searchResults) {
            fmt.display(dev1);
        }


    }
}

