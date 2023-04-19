package grades;
import utils.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class GradesApplication {
    static Input input = new Input();
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student student10 = new Student("tom@github.com", new ArrayList<>());
        Student student11 = new Student("william@github.com", new ArrayList<>());
        Student student12 = new Student("suzie@github.com", new ArrayList<>());
        Student student13 = new Student("sophie@github.com", new ArrayList<>());

        student10.addGrade(89);
        student10.addGrade(90);
        student10.addGrade(100);
        student10.addGrade(56);

        student11.addGrade(99);
        student11.addGrade(98);
        student11.addGrade(99);
        student11.addGrade(100);

        student12.addGrade(90);
        student12.addGrade(98);
        student12.addGrade(99);
        student12.addGrade(100);

        student13.addGrade(69);
        student13.addGrade(98);
        student13.addGrade(79);
        student13.addGrade(100);

        students.put(student10.getName(), student10);
        students.put(student11.getName(), student11);
        students.put(student12.getName(), student12);
        students.put(student13.getName(), student13);

        System.out.printf("""
                          Welcome!
                          Here are the GitHub usernames of our students:
                          |%s|    |%s|    |%s|    |%s|
                          """, student10.getName(), student11.getName(), student12.getName(), student13.getName());

        String userContinue = "y";
        while (true) {
            if (!userContinue.equalsIgnoreCase("y")) {
                System.out.println("Thank you.");
                break;
            }
            String userChoice = input.getString("Which student would you like to see more information on?");
            if (!students.containsKey(userChoice)) {
                System.out.println("No students with that username could be found");
            } else {
                Student selectedStudent = students.get(userChoice);
                System.out.printf("username: %s%ngrade average: %.2f%n", selectedStudent.getName(), selectedStudent.getGradeAverage(selectedStudent.grades));
            }
            userContinue = input.getString("Would you like to continue? [y/N]");
        }
    }
}