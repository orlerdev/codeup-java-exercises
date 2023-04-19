package grades;
import java.util.ArrayList;
import java.util.HashMap;

public class StudentRollCall extends Student{
    protected static HashMap<String, Student> students = new HashMap<>();
    protected static ArrayList<String> studentNames = new ArrayList<>();
    protected static Student tom = new Student("Tom", "tom@github.com", new HashMap<>(), new ArrayList<>());
    protected static Student william = new Student("William", "william@github.com", new HashMap<>(), new ArrayList<>());
    protected static Student suzie = new Student("Suzie", "suzie@github.com", new HashMap<>(), new ArrayList<>());
    protected static Student sophie = new Student("Sophie", "sophie@github.com", new HashMap<>(), new ArrayList<>());
}
