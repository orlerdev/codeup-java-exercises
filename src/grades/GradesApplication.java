package grades;
import java.io.*;

import com.opencsv.CSVWriter;
import utils.Input;

import java.util.*;

public class GradesApplication{
    static Input input = new Input();
    protected static HashMap<String, Student> students = new HashMap<>();
    protected static ArrayList<String> studentNames = new ArrayList<>();
    private final static String getPassword = "!!11Andrea";

    public static void main(String[] args){
        Student tom = new Student("Tom", "tom@github.com", new HashMap<>(), new ArrayList<>());
        Student william = new Student("William", "william@github.com", new HashMap<>(), new ArrayList<>());
        Student suzie = new Student("Suzie", "suzie@github.com", new HashMap<>(), new ArrayList<>());
        Student sophie = new Student("Sophie", "sophie@github.com", new HashMap<>(), new ArrayList<>());

        students.putIfAbsent(tom.name, tom);
        students.putIfAbsent(william.name, william);
        students.putIfAbsent(suzie.name, suzie);
        students.putIfAbsent(sophie.name, sophie);

        tom.addGrades(new int[]{89, 90, 100, 56});
        william.addGrades(new int[]{99, 98, 99, 100});
        sophie.addGrades(new int[]{69, 98, 79, 100});
        suzie.addGrades(new int[]{90, 98, 99, 100});

        tom.recordAttendance("2023-04-13", "P");
        tom.recordAttendance("2023-04-14", "P");
        tom.recordAttendance("2023-04-15", "A");
        tom.recordAttendance("2023-04-16", "A");
        tom.recordAttendance("2023-04-17", "A");
        tom.recordAttendance("2023-04-18", "A");
        tom.recordAttendance("2023-04-19", "P");

        william.recordAttendance("2023-04-13", "P");
        william.recordAttendance("2023-04-14", "P");
        william.recordAttendance("2023-04-15", "P");
        william.recordAttendance("2023-04-16", "A");
        william.recordAttendance("2023-04-17", "P");
        william.recordAttendance("2023-04-18", "A");
        william.recordAttendance("2023-04-19", "P");

        sophie.recordAttendance("2023-04-13", "P");
        sophie.recordAttendance("2023-04-14", "A");
        sophie.recordAttendance("2023-04-15", "P");
        sophie.recordAttendance("2023-04-16", "A");
        sophie.recordAttendance("2023-04-17", "P");
        sophie.recordAttendance("2023-04-18", "P");
        sophie.recordAttendance("2023-04-19", "P");

        suzie.recordAttendance("2023-04-13", "A");
        suzie.recordAttendance("2023-04-14", "P");
        suzie.recordAttendance("2023-04-15", "P");
        suzie.recordAttendance("2023-04-16", "P");
        suzie.recordAttendance("2023-04-17", "P");
        suzie.recordAttendance("2023-04-18", "P");
        suzie.recordAttendance("2023-04-19", "P");

        while (true){
            String userSelection = input.getString("""

                                                   Welcome!
                                                   Please select one of the following options:

                                                   1-   View all students
                                                   2-   View grade average for the class
                                                   3-   Enter attendance data for a student
                                                   4-   Enter grades for a student
                                                   5-   Print a CSV report of all students

                                                   Enter q or quit to exit the application.

                                                   """);

            if (userSelection.equalsIgnoreCase("q") || userSelection.equalsIgnoreCase("quit")){
                System.out.println("Thank you!");
                break;
            }
            if (userSelection.equalsIgnoreCase("1")){
                allStudentNames(students);
                showStudentData();
            }
            switch (userSelection){
                case "2" -> classAverage(students);
                case "3" -> setStudentAttendance();
                case "5" -> generateStudentInfoFile("studentInfo.csv");
            }
        }
    }

    //METHODS
    private static void allStudentNames(HashMap<String, Student> students){
        for(Map.Entry<String, Student> student : students.entrySet()){
            if (!studentNames.contains(student.getValue().name)){
                studentNames.add(student.getValue().getName());
            }
        }
        System.out.println(studentNames);
    }

    private static void showStudentData(){
        String userSelect = input.getString("""
                                            Enter the name of the student you would like more information for
                                            """);
        for(Map.Entry<String, Student> student : students.entrySet()){
            if (student.getValue().name.equalsIgnoreCase(userSelect)){
                student.getValue().showAllStudentData();
            }
        }
    }

    private static void setStudentAttendance(){
        String userSelect = input.getString("""
                                            Enter the name of the student you would like to add attendance data for.
                                            """);
        for(Map.Entry<String, Student> student : students.entrySet()){
            if (student.getValue().name.equalsIgnoreCase(userSelect)){
                student.getValue().setStudentAttendance();
            }
        }
    }

    private static void classAverage(HashMap<String, Student> students){
        ArrayList<Integer> classGrades = new ArrayList<>();
        for(Map.Entry<String, Student> student : students.entrySet()){
            classGrades.addAll(student.getValue().getGrades());
        }
        double total = 0;
        for(Integer grade : classGrades){
            total += grade;
        }
        System.out.println(total / classGrades.size());
    }

    private static void generateStudentInfoFile(String filePath){
        File file = new File(filePath);
        try {
            FileWriter outputFile = new FileWriter(file);
            CSVWriter writer = new CSVWriter(outputFile);
            String[] header = {"name", "github username", "grade average"};
            writer.writeNext(header);
            for(Map.Entry<String, Student> student : students.entrySet()){
                String[] data = {student.getValue().getName(), student.getValue().getGithubUsername(), String.valueOf(student.getValue().getGradeAverage(student.getValue().grades))};
                writer.writeNext(data);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private final static String jdbcInfo = "!!11Andrea";

}