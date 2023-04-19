package grades;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student{
    public String name;
    public String githubUsername;
//    public HashMap<String, String> attendance;
    public ArrayList<Integer> grades;

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
    public void recordAttendance(String date, String value){
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
