package grades;
import java.util.HashMap;

public interface Attendance{
    public void recordAttendance(String date, String value);
    public double getAttendanceAvg(HashMap<String,String> attendance);
}
