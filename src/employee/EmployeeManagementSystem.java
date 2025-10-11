package employee;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        EmployeeRecord Richard_rec = new EmployeeRecord(933, "Richard", 36, "CPU_optimization", "promotion lvl.2");
        EmployeeRecord Tommy_rec = new EmployeeRecord(162, "Tommy", 24, "Resource_management", "promotion lvl.1");
        PayrollRecord Richard_payroll_rec = new PayrollRecord(933, 200, 150, 75);
        PayrollRecord Tommy_payroll_rec = new PayrollRecord(162, 110, 60, 20);
        LeaveRecord Richard_leave_rec = new LeaveRecord(933, 21, 12);
        LeaveRecord Tommy_leave_rec = new LeaveRecord(162, 14, 3);
        AttendanceRecord Richard_attendance_rec = new AttendanceRecord(933, 200, 195);
        AttendanceRecord Tommy_attendance_rec = new AttendanceRecord(162, 250, 247);
        System.out.println("Richard_rec: " + Richard_rec);
        System.out.println("Tommy_rec: " + Tommy_rec);
        System.out.println("Richard_payroll_rec: " + Richard_payroll_rec);
        System.out.println("Tommy_payroll_rec: " + Tommy_payroll_rec);
        System.out.println("Richard_leave_rec: " + Richard_leave_rec);
        System.out.println("Tommy_leave_rec: " + Tommy_leave_rec);
        System.out.println("Richard_attendance_rec" + Richard_attendance_rec);
        System.out.println("Tommy_attendance_rec" + Tommy_attendance_rec);
    }
}
