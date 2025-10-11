package employee;

public record AttendanceRecord(int ID, int totalWorkingDays, int daysPresent) {
    public String work_Presence_calc(){
        double presence_Percent = 100 * ((double)daysPresent / totalWorkingDays);
        return String.format("%.2f", presence_Percent);

    }

    @Override
    public String toString(){
        return "ID: " + ID + ", presence percent: " + work_Presence_calc() + ".";
    }
}
