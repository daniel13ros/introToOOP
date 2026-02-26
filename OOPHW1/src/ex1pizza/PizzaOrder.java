//211765565 daniel rosman

package ex1pizza;

import java.util.Arrays;
import java.util.Objects;

public class PizzaOrder {
    // Private fields representing the customer's name and the pizzas in the order
    private String firstName;
    private String lastName;
    private static final int MAXPIZAAS=3;
    private  Pizza[]pizzas;
    private int numOfPizzas;

    // Constructor - initializes the customer's name and prepares the pizzas array
    public PizzaOrder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pizzas = new Pizza[MAXPIZAAS];
        this.numOfPizzas = 0;
    }

    // Method to add a pizza to the order
    public void addPizza(int size,boolean cheeseTopping ,boolean olivesTopping ,boolean onionTopping) throws Exception {
        if (this.numOfPizzas<MAXPIZAAS){
            pizzas[numOfPizzas++]=new Pizza(size,cheeseTopping,olivesTopping,onionTopping);
        }else {
            throw new Exception("cannot add more the 3 pizzas");
        }
    }

    // Method to calculate the total cost of the order
    public int calcTotal(){
        int cost=0;
        if(pizzas.length==0){
            return cost;
        }
        for (int i=0;i<pizzas.length;i++){
            if(pizzas[i]!=null){
                cost+=pizzas[i].calcCost();
            }else break;

        }
        return cost;
    }

    // Method to print the receipt for the customer
    public void tab(){
        System.out.println("Customer name - " + firstName + " " + lastName);
        for (int i = 0; i < numOfPizzas; i++) {
            System.out.println(pizzas[i]+" : pizza price "+pizzas[i].calcCost());
        }
        System.out.println("================================");
        System.out.println("Total sum - " + calcTotal());
        System.out.println(" ");
    }

    // Method to return the string representation of the pizza order
    @Override
    public String toString() {
        return "PizzaOrder -" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pizzas=" + Arrays.toString(pizzas) +
                ", numOfPizzas=" + numOfPizzas ;
    }

    // Method to check equality between two pizza orders
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PizzaOrder that = (PizzaOrder) o;
        return numOfPizzas == that.numOfPizzas && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Arrays.equals(pizzas, that.pizzas);
    }


}
