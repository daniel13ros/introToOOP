//written by daniel rosman 211765565
package assignment_2_employee;

// Record class representing an employee record with id, name, age, department, and designation
public record EmployeeRecord(int id, String name, int age, String department, String designation) {

    // Override the toString method to provide a formatted string representation of the employee record
    @Override
    public String toString() {
        return "EmployeeRecord - id:" + id + ", name:'" + name + "', age:" + age + ", department:'" + department + "', designation:'" + designation;
    }
}
