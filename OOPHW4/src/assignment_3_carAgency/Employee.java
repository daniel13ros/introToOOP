//written by daniel rosman 211765565
package assignment_3_carAgency;
import java.io.IOException;

// Class representing an employee with attributes and methods for sales and salary calculation
public class Employee implements Comparable<Employee> {

    //Attributes
    private String name;
    private String id;
    private int sales;

    // Constructor to initialize employee details with validation
    public Employee(String name, String id, int sales) throws IllegalArgumentException {
        if (name == null || !name.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Name must contain only letters.");
        }
        if (id.length() != 9 || !id.matches("\\d{9}")) {
            throw new IllegalArgumentException("ID must be exactly 9 digits.");
        }
        if (sales < 0) {
            throw new IllegalArgumentException("Sales number must be non-negative.");
        }

        this.name = name;
        this.id = id;
        this.sales = sales;
    }
    // Getters
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getSales() {
        return sales;
    }

    // Method to handle selling a car, which also updates the sales count
    public void sellCar(Car car, String filePath) throws IOException {
        car.sellCar(filePath);
        this.sales++;
    }

    // Method to calculate the salary based on base salary and sales bonus
    public double calculateSalary() {
        final double baseSalary = 6000;
        final double bonusPerSale = 100;
        return baseSalary + (sales * bonusPerSale);
    }

    // Method to compare employees based on their sales (used for sorting)
    public int compareTo(Employee other) {
        if (this.sales == other.sales) {
            return 0;
        } else if (this.sales < other.sales) {
            return -1;
        } else {
            return 1;
        }
    }

    // Override the toString method to provide a formatted string representation of the employee
    @Override
    public String toString() {
        return String.format("Employee name : %s, Employee ID:%s, Sales number :%d", name, id, sales);
    }
}
