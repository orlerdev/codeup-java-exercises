package grades;
import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student{
    protected static Input input = new Input();
    protected String name;
    protected String githubUsername;
    protected HashMap<String, String> attendance;
    protected ArrayList<Integer> grades;

    //CONSTRUCTORS
    public Student(){}
    public Student(String name, String githubUsername, HashMap<String, String> attendance, ArrayList<Integer> grades){
        this.name = name;
        this.githubUsername = githubUsername;
        this.attendance = new HashMap<>();
        this.grades = new ArrayList<>();
    }

    //GETTERS
    public String getName(){
        return name;
    }
    public String getGithubUsername(){
        return githubUsername;
    }

    public ArrayList<Integer> getGrades(){
        return grades;
    }

    //SETTERS
    public void setName(String name){
        this.name = name;
    }

    //GRADE METHODS
    public void addGrades(int[] studentGrades){
        for (int grade : studentGrades){
            grades.add(grade);
        }
    }

    public double getGradeAverage(ArrayList<Integer> grades){
        double total = 0;
        for(Integer grade : grades){
            total += grade;
        }
        return total / grades.size();
    }



    public void showAllGrades(){
        System.out.printf("""
                          %s has the following grades:
                          %s
                          with an average of %.2f
                          """, name, grades.toString(), getGradeAverage(grades));
    }

    //ATTENDANCE METHODS
    protected void recordAttendance(String date, String value){
        attendance.put(date, value);
    }

    public double getAttendancePercentage(HashMap<String,String> attendance){
        int missedDays = 0;
        int totalDays = attendance.size();
        for(Map.Entry<String,String> date : attendance.entrySet()){
            if(date.getValue().equalsIgnoreCase("a")){
                missedDays++;
            }
        }
        return (double) (totalDays - missedDays) / totalDays;
    }

    public ArrayList<String> missedDates(HashMap<String,String> attendance){
        ArrayList<String> days = new ArrayList<>();
        for(Map.Entry<String,String> date : attendance.entrySet()){
            if(date.getValue().equalsIgnoreCase("a")){
                days.add(date.getKey());
            }
        }
        return days;
    }



    protected void setStudentAttendance(){
        while (true){
            String attendanceDate = input.getString("Enter the date using the following format: 2017-10-03%n");
            String attendanceStatus = input.getString("""
                                                      Enter the student's status for the day:
                                                      P if present
                                                      A if absent
                                                      %n""");
            recordAttendance(attendanceDate, attendanceStatus.toUpperCase());
            String userQuit = input.getString("Would you like to add another day? [y/N]%n");
            if (!userQuit.equalsIgnoreCase("y")){
                System.out.println("Thank you.");
                break;
            }
        }
    }

    public void showAllStudentData(){
        System.out.printf("""
                          
                          Name: %s
                          GitHub username: %s
                          Grade average: %.2f
                          All grades: %s
                          Attendance percentage: %.2f
                          Missed days: %s
                          """, name, githubUsername, getGradeAverage(grades), grades.toString(), getAttendancePercentage(attendance), missedDates(attendance));
    }

}
