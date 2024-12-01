package advanced.enumcoding;

public class PizzaApp {
    public static void main(String[] args) {
        System.out.println("Available sizes:");
        for(PizzaSize pizza : PizzaSize.values()) {
            System.out.println("- " + pizza.getPizzaSizeText());
        }
        System.out.println();

        Pizza pizzaOrder = new Pizza("Margareta", PizzaSize.MEDIUM);
        System.out.println("I ordered the following pizza:");
        System.out.println("Name: " + pizzaOrder.getName());
        System.out.println("Size: " + pizzaOrder.getPizzaSize().getPizzaSizeText());
        System.out.println("Price: " + pizzaOrder.getPrice());
    }
}
