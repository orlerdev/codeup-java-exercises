package grades;
import java.util.HashMap;
import java.util.Map;

import static grades.StudentRollCall.*;

public class StudentAttendance implements Attendance{
    public HashMap<String, String> attendance;

    @Override
    public void recordAttendance(String date, String value){
        attendance.put(date, value);
    }

    @Override
    public double getAttendanceAvg(HashMap<String, String> attendance){
        int missedDays = 0;
        int totalDays = attendance.size();
        for(Map.Entry<String, String> date : attendance.entrySet()){
            if (date.getValue().equalsIgnoreCase("a")){
                missedDays++;
            }
        }
        return (double) (totalDays - missedDays) / totalDays;
    }
}
