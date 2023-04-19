package grades;
import java.util.ArrayList;

public class Student {
    public String name;
    public ArrayList<Integer> grades;

    public Student(){}
    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage(ArrayList<Integer> grades) {
        double total = 0;
        for (Integer grade : grades) {
            total += grade;
        }
        return total / grades.size();
    }

}
