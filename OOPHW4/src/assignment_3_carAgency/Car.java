//written by daniel rosman 211765565
package assignment_3_carAgency;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// Class representing a car with attributes and methods for price calculation and selling
public class Car {

    // Attributes
    private String carNumber;
    private int manufacturingYear;
    private String manufacturer;
    private int mileage;
    private double price;

    // Constructor to initialize car details with validation
    public Car(String carNumber, int manufacturingYear, String manufacturer, int mileage, double price) throws IllegalArgumentException {
        if (carNumber.length() != 6 || carNumber.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("Car number must be 6 digits.");
        }
        if (manufacturingYear < 2017 || manufacturingYear > 2023) {
            throw new IllegalArgumentException("Manufacturing year must be between 2017 and 2023.");
        }
        if (mileage < 0) {
            throw new IllegalArgumentException("Mileage must be non-negative.");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be positive.");
        }
        if (manufacturer == null || manufacturer.isEmpty()) {
            throw new IllegalArgumentException("Manufacturer cannot be empty.");
        }

        this.carNumber = carNumber;
        this.manufacturingYear = manufacturingYear;
        this.manufacturer = manufacturer;
        this.mileage = mileage;
        this.price = price;
    }

    // Getters
    public String getCarNumber() {
        return carNumber;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getMileage() {
        return mileage;
    }

    public double getPrice() {
        return price;
    }

    // Method to calculate the price after applying a percentage reduction
    public double priceAfterCalculate(int percentage){
        double toDecrease=price*((double) percentage /100);
        double newPrice=price-toDecrease;
        if(toDecrease>5000){
            throw new IllegalArgumentException("The reduction price is above 5000");
        }
        if (newPrice<0){
            throw new IllegalArgumentException("The new price is negative");
        }
        return newPrice;
    }

    // Method to write the car details to a file
    public void sellCar(String filePath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(String.format("%s %d %s %d %.2f%n", carNumber, manufacturingYear, manufacturer, mileage, price));
        }
    }

    // Override toString method to provide a formatted string representation of the car
    @Override
    public String toString() {
        return String.format("Car Number: %s, Manufacturing Year: %d, Manufacturer: %s, Mileage: %d, Price: %.2f",
                carNumber, manufacturingYear, manufacturer, mileage, price);
    }
}
