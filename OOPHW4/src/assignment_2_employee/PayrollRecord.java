//written by daniel rosman 211765565
package assignment_2_employee;

// Record class representing a payroll record with id, salary, bonus, and tax
public record PayrollRecord(int id, double salary, double bonus, double tax) {

    // Method to calculate the total salary after adding the bonus and subtracting the tax
    public double calculateTotalSalary() {
        return salary + bonus - tax;
    }

    // Override the toString method to provide a formatted string representation of the payroll record
    @Override
    public String toString() {
        return "PayrollRecord - id:" + id + ", salary:" + salary + ", bonus:" + bonus + ", tax:" + tax + ", totalSalary:" + calculateTotalSalary() ;
    }
}
