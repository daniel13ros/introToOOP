//211765565 daniel rosman

package ex1pizza;


public class Pizza {
    // Private fields representing the size of the pizza and its toppings
    private int size;
    private boolean cheeseTopping;
    private boolean olivesTopping;
    private boolean onionTopping;

    // Default constructor - creates a small pizza with no toppings
    public Pizza() {
        this.size = 0;
        this.cheeseTopping = false;
        this.olivesTopping = false;
        this.onionTopping = false;
    }

    // Constructor with parameters - creates a pizza with specified size and toppings , and throws exception if the size is illegal
    public Pizza(int size, boolean cheeseTopping, boolean olivesTopping, boolean onionTopping) throws Exception {
        if (size > 2 || size < 0) {
            throw new Exception("pizza size must be 0 , 1 , 2");
        }
        this.size=size;
        this.cheeseTopping = cheeseTopping;
        this.olivesTopping = olivesTopping;
        this.onionTopping = onionTopping;
    }

    // Copy constructor - creates a pizza by copying another pizza
    public Pizza(Pizza pizza) {
        this.size = pizza.size;
        this.cheeseTopping = pizza.cheeseTopping;
        this.olivesTopping = pizza.olivesTopping;
        this.onionTopping = pizza.onionTopping;
    }

    // Method to get the size of the pizza as a string
    public String getSize() {
        if (this.size == 0) {
            return "Small";
        }
        if (this.size == 1) {
            return "Medium";
        }
        if (this.size == 2) {
            return "Large";
        }
        return "0";
    }

    // Method to set the size of the pizza with validation
    public void setSize(int size) throws Exception {
        if (size > 2 || size < 0) {
            throw new Exception("pizza size must be 0 , 1 , 2");
        }
        this.size = size;
    }

    // Getter for cheese topping
    public boolean isCheeseTopping() {
        return cheeseTopping;
    }

    // Setter for cheese topping
    public void setCheeseTopping(boolean cheeseTopping) {
        this.cheeseTopping = cheeseTopping;
    }

    // Getter for olives topping
    public boolean isOlivesTopping() {
        return olivesTopping;
    }

    // Setter for olives topping
    public void setOlivesTopping(boolean olivesTopping) {
        this.olivesTopping = olivesTopping;
    }

    // Getter for onion topping
    public boolean isOnionTopping() {
        return onionTopping;
    }

    // Setter for onion topping
    public void setOnionTopping(boolean onionTopping) {
        this.onionTopping = onionTopping;
    }

    // Method to calculate the number of extra toppings
    public int getNumberOfExtras() {
        int numOfExtras = 0;
        if (this.cheeseTopping) {
            numOfExtras++;
        }
        if (this.onionTopping) {
            numOfExtras++;
        }
        if (this.olivesTopping) {
            numOfExtras++;
        }
        return numOfExtras;
    }

    // Method to calculate the cost of the pizza
    public int calcCost() {
        int cost = 0;
        int numOfExtra = getNumberOfExtras();
        if (this.size == 0) {
            cost = 35 + numOfExtra * 6;
        }
        if (this.size == 1) {
            cost = 45 + numOfExtra * 7;
        }
        if (this.size == 2) {
            cost = 60 + numOfExtra * 9;
        }
        return cost;
    }

    // Method to check equality between two pizzas
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return size == pizza.size && cheeseTopping == pizza.cheeseTopping && olivesTopping == pizza.olivesTopping && onionTopping == pizza.onionTopping;
    }

    public String checkTopping(){
        StringBuilder stringBuilder=new StringBuilder();
        if(cheeseTopping){
            stringBuilder.append(" + extra cheese topping ");
        }
        if(olivesTopping){
            stringBuilder.append(" + extra olives topping ");
        }
        if(onionTopping){
            stringBuilder.append(" + extra onion topping ");
        }
        if(stringBuilder.length()==0){
            stringBuilder.append(" (no topping)");
        }
        return stringBuilder.toString();
    }

    // Method to return the string representation of the pizza
    @Override
    public String toString() {
        return "Pizza " +
                "size- " + getSize() + checkTopping();
    }
}
