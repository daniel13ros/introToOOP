//written by daniel rosman 211765565
package assignment_2_employee;

// Record class representing an attendance record with id, total working days, and days present
public record AttendanceRecord(int id, int totalWorkingDays, int daysPresent) {

    // Method to calculate the attendance percentage
    public double calculateAttendancePercentage() {
        return (daysPresent / (double) totalWorkingDays) * 100;
    }

    // Override the toString method to provide a formatted string representation of the attendance record
    @Override
    public String toString() {
        return "AttendanceRecord - id:" + id + ", totalWorkingDays:" + totalWorkingDays + ", daysPresent:" + daysPresent + ", attendancePercentage:" + calculateAttendancePercentage() + "%";
    }
}
