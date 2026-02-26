//written by daniel rosman 211765565
package assignment_2_employee;

// Record class representing a leave record with id, total leaves, and leaves taken
public record LeaveRecord(int id ,int totalLeaves, int leavesTaken) {

    // Method to calculate the remaining leaves
    public int calculateRemainingLeaves() {
        return totalLeaves - leavesTaken;
    }

    // Override the toString method to provide a formatted string representation of the leave record
    @Override
    public String toString() {
        return "LeaveRecord -" + "id:" + id + ", totalLeaves:" + totalLeaves + ", leaveTaken:" + leavesTaken;
    }
}
