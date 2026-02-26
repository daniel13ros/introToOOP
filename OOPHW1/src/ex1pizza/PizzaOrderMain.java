//211765565 daniel rosman

package ex1pizza;

public class PizzaOrderMain {
    public static void main(String[] args) throws Exception {
        //create order 1 and add 2 pizzas
        PizzaOrder order1 = new PizzaOrder("Haim", "Kohen");
        order1.addPizza(0, true, false, true);
        order1.addPizza(1, true, false, false);

        //create order 2 and add 3 pizzas
        PizzaOrder order2 = new PizzaOrder("Eyal", "Shani");
        order2.addPizza(2, true, true, true);
        order2.addPizza(2, true, true, true);
        order2.addPizza(2, true, true, true);

        //order 1 and 2 tabs
        order1.tab();
        order2.tab();

        //checks if the orders are equal
        if (order1.equals(order2)) {
            System.out.println("The orders are equal!!!");
        } else {
            System.out.println("The orders are NOT equal!!!");
        }
    }
}
