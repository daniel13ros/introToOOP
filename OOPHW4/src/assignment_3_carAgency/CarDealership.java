//written by daniel rosman 211765565
package assignment_3_carAgency;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Class representing the car dealership system with functionalities to manage cars and employees
public class CarDealership {

    // Main method to start the application
    public static void main(String[] args) {
        runMenu(); // Run the menu to interact with the user

    }

    // Method to display the menu and handle user choices
    public static void runMenu() {
        String soldFilePath = "src/assignment_3_carAgency/Sold.txt";
        String carDealershipFilePath = "src/assignment_3_carAgency/CarDealership.txt";
        ArrayList<Car> loadedCars = (ArrayList<Car>) readCarsFile();
        ArrayList<Employee> loadedEmployees = (ArrayList<Employee>) readEmployeesFile();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Display list of employees");
            System.out.println("2. Display unsold cars");
            System.out.println("3. Sell a car");
            System.out.println("4. Add a car");
            System.out.println("5. Exit");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                //Case 1 show the list of employee sorted
                case 1:
                    sortArrayListDescending(loadedEmployees);
                    for (Employee e : loadedEmployees) {
                        System.out.println(e);
                        System.out.println("----------------------------");
                    }
                    break;

                //Case 2 show the list of unsold cars
                case 2:
                    System.out.println("List of unsold cars:");
                    for (Car c : loadedCars) {
                        System.out.println(c);
                        System.out.println("----------------------------");
                    }
                    break;

                //Case 3 sell car by chosen employee
                case 3:
                    System.out.println("Select an employee by ID:");
                    for (Employee e : loadedEmployees) {
                        System.out.println(e);
                        System.out.println("----------------------------");
                    }
                    String employeeId = scanner.nextLine();
                    Employee selectedEmployee = null;
                    for (Employee e : loadedEmployees) {
                        if (e.getId().equals(employeeId)) {
                            selectedEmployee = e;
                            break;
                        }
                    }
                    if (selectedEmployee == null) {
                        System.out.println("Invalid employee ID.");
                        break;
                    }

                    System.out.println("Select a car by number:");
                    for (Car c : loadedCars) {
                        System.out.println(c);
                        System.out.println("----------------------------");
                    }
                    String carNumber = scanner.nextLine();
                    Car selectedCar = null;
                    for (Car c : loadedCars) {
                        if (c.getCarNumber().equals(carNumber)) {
                            selectedCar = c;
                            break;
                        }
                    }
                    if (selectedCar == null) {
                        System.out.println("Invalid car number.");
                        break;
                    }

                    try {
                        selectedEmployee.sellCar(selectedCar, soldFilePath);
                        loadedCars.remove(selectedCar);
                        System.out.println("Car sold successfully!");
                    } catch (IOException e) {
                        System.out.println("Error selling car: " + e.getMessage());
                    }
                    break;

                //Case 4 add new car
                case 4:
                    try {
                        System.out.println("Adding a new car:");
                        System.out.print("Enter Car Number (6 digits): ");
                        String newCarNumber = scanner.nextLine();
                        System.out.print("Enter Manufacturing Year (between 2017 and 2023): ");
                        int newManufacturingYear = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter Manufacturer: ");
                        String newManufacturer = scanner.nextLine();
                        System.out.print("Enter Mileage: ");
                        int newMileage = scanner.nextInt();
                        System.out.print("Enter Price: ");
                        double newPrice = scanner.nextDouble();
                        Car newCar = new Car(newCarNumber, newManufacturingYear, newManufacturer, newMileage, newPrice);
                        loadedCars.add(newCar);
                        System.out.println("Car added successfully!");
                    } catch (Exception e) {
                        System.out.println("Error adding car: " + e.getMessage());
                    }
                    break;
                //Case 5 save all the sold cars into Sold.txt file and close the program
                case 5:
                    try (BufferedWriter carWriter = new BufferedWriter(new FileWriter(carDealershipFilePath))) {
                        for (Car c : loadedCars) {
                            carWriter.write(String.format("%s %d %s %d %.2f%n", c.getCarNumber(), c.getManufacturingYear(), c.getManufacturer(), c.getMileage(), c.getPrice()));
                        }
                    } catch (IOException e) {
                        System.out.println("Error saving cars: " + e.getMessage());
                    }
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        }
    }

    //This method is scanning the CarDealership.txt file and adding each car details into cars ArrayList  and return the ArrayList
    public static List<Car> readCarsFile() {
        String carDealershipFilePath = "src/assignment_3_carAgency/CarDealership.txt";
        ArrayList<Car> cars = new ArrayList<>();
        try (BufferedReader carReader = new BufferedReader(new FileReader(carDealershipFilePath))) {
            String line;
            while ((line = carReader.readLine()) != null) {
                try {
                    String[] parts = line.split(" ");
                    String carNumber = parts[0];
                    int manufacturingYear = Integer.parseInt(parts[1]);
                    String manufacturer = parts[2];
                    int mileage = Integer.parseInt(parts[3]);
                    double price = Double.parseDouble(parts[4]);

                    Car car = new Car(carNumber, manufacturingYear, manufacturer, mileage, price);
                    cars.add(car);
                } catch (Exception e) {
                    System.out.println("Warning: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading car file: " + e.getMessage());
        }
        return cars;
    }

    //This method is scanning the Employee.txt file and adding each employee details into employees ArrayList  and return the ArrayList
    public static List<Employee> readEmployeesFile() {
        String employeeFilePath = "src/assignment_3_carAgency/Employee.txt";
        ArrayList<Employee> employees = new ArrayList<>();
        try (BufferedReader employeeReader = new BufferedReader(new FileReader(employeeFilePath))) {
            String line;
            while ((line = employeeReader.readLine()) != null) {
                try {
                    String[] parts = line.split(" ");
                    String name = parts[0];
                    String id = parts[1];
                    int salesNumber = Integer.parseInt(parts[2]);
                    Employee employee = new Employee(name, id, salesNumber);
                    employees.add(employee);
                } catch (Exception e) {
                    System.out.println("Warning: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading employee file: " + e.getMessage());
        }
        return employees;
    }

    //This method sorts generic ArrayList with comparable of collections
    public static <T extends Comparable<T>> void sortArrayListDescending(ArrayList<T> list) {
        Collections.sort(list, Collections.reverseOrder());
    }
}
