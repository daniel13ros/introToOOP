//211765565 daniel rosman

package ex1pizza;

public class CheckPizzaMain {
    public static void main(String[] args) throws Exception {
        //create pizzas
        Pizza pizza1 = new Pizza(0, true, true, false);
        Pizza pizza2 = new Pizza(pizza1);
        pizza2.setSize(2);
        Pizza pizza3 = new Pizza();
        //print pizzas and prices
        System.out.println("List of pizzas and their prices:");
        System.out.println("pizza 1: "+pizza1);
        System.out.println("Pizza costs :"+pizza1.calcCost());
        System.out.println("pizza 2: "+pizza2);
        System.out.println("Pizza costs :"+pizza2.calcCost());
        System.out.println("pizza 3: "+pizza3);
        System.out.println("Pizza costs :"+pizza3.calcCost());
        // change pizza 3 and print it
        pizza3.setCheeseTopping(true);
        pizza3.setOlivesTopping(true);
        System.out.println("Pizza 3 was changed.\nThe new pizza 3:\n"+pizza3);
        //compare all pizzas
        System.out.println("\nComparing pizzas:");
        if (pizza1.equals(pizza2)) System.out.println("pizza 1 = pizza 2");
        if (pizza1.equals(pizza3)) System.out.println("pizza 1 = pizza 3");
        if (pizza3.equals(pizza2)) System.out.println("pizza 2 = pizza 3");
    }
}
