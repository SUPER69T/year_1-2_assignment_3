package employee;

public record LeaveRecord(int ID, int totalLeaves, int leavesTaken) {
    public String leaves_Remaining(){
        double remaining = totalLeaves - leavesTaken;
        return String.format("%.2f", remaining);

    }

    @Override
    public String toString(){
        return "ID: " + ID + ", remaining leave days: " + leaves_Remaining() + ".";
    }
}
