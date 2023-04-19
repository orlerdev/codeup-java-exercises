//package grades;
//import java.util.ArrayList;
//
//public class StudentTest {
//    public static void main(String[] args) {
//        Student student1 = new Student("Tom", new ArrayList<>());
//        Student student2 = new Student("Billy", new ArrayList<>());
//        Student student3 = new Student("Susie", new ArrayList<>());
//        Student student4 = new Student("Sophie", new ArrayList<>());
//        Student student5 = new Student("Antonia", new ArrayList<>());
//
//        student1.addGrade(89);
//        student1.addGrade(90);
//        student1.addGrade(100);
//        student1.addGrade(56);
//
//        student2.addGrade(99);
//        student2.addGrade(98);
//        student2.addGrade(99);
//        student2.addGrade(100);
//
//        student3.addGrade(90);
//        student3.addGrade(98);
//        student3.addGrade(99);
//        student3.addGrade(100);
//
//        student4.addGrade(69);
//        student4.addGrade(98);
//        student4.addGrade(79);
//        student4.addGrade(100);
//
//        student5.addGrade(100);
//        student5.addGrade(100);
//        student5.addGrade(99);
//        student5.addGrade(100);
//
//
//        double student1Average = student1.getGradeAverage(student1.grades);
//        double student2Average = student2.getGradeAverage(student2.grades);
//        double student3Average = student3.getGradeAverage(student3.grades);
//        double student4Average = student4.getGradeAverage(student4.grades);
//        double student5Average = student5.getGradeAverage(student5.grades);
//
//        System.out.printf("""
//                          %s has an average grade of %.2f%n
//                          """, student1.getName(), student1Average);
//        System.out.printf("""
//                          %s has an average grade of %.2f%n
//                          """, student2.getName(), student2Average);
//        System.out.printf("""
//                          %s has an average grade of %.2f%n
//                          """, student3.getName(), student3Average);
//        System.out.printf("""
//                          %s has an average grade of %.2f%n
//                          """, student4.getName(), student4Average);
//        System.out.printf("""
//                          %s has an average grade of %.2f%n
//                          """, student5.getName(), student5Average);
//    }
//}
