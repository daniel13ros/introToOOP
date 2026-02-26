//written by daniel rosman 211765565
package assignment_2_employee;

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        // Create instances of EmployeeRecord with sample data
        EmployeeRecord employeeRecord1 = new EmployeeRecord(1, "moshe", 21, "IT", "Developer");
        EmployeeRecord employeeRecord2 = new EmployeeRecord(2, "ben", 50, "HR", "Manager");

        // Create instances of PayrollRecord with sample data
        PayrollRecord payrollRecord1 = new PayrollRecord(1, 9000, 1500, 660);
        PayrollRecord payrollRecord2 = new PayrollRecord(2, 7000, 800, 540);

        // Create instances of LeaveRecord with sample data
        LeaveRecord leaveRecord1 = new LeaveRecord(1, 30, 5);
        LeaveRecord leaveRecord2 = new LeaveRecord(2, 30, 10);

        // Create instances of AttendanceRecord with sample data
        AttendanceRecord attendanceRecord1 = new AttendanceRecord(1, 220, 200);
        AttendanceRecord attendanceRecord2 = new AttendanceRecord(2, 220, 180);

        // Print the details of each employee record
        System.out.println("\n"+employeeRecord1);
        System.out.println(employeeRecord2+"\n");

        // Print the details of each payroll record
        System.out.println(payrollRecord1);
        System.out.println(payrollRecord2+"\n");

        // Print the details of each leave record
        System.out.println(leaveRecord1);
        System.out.println(leaveRecord2+"\n");

        // Print the details of each attendance record
        System.out.println(attendanceRecord1);
        System.out.println(attendanceRecord2);
    }
}
