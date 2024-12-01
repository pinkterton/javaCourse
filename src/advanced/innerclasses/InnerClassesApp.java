package advanced.innerclasses;

import advanced.enumcoding.PizzaSize;

class Pizza {
    private String name;
    private PizzaSize pizzaSize;
    private double price;

    public Pizza(String name, PizzaSize pizzaSize) {
        this.name = name;
        this.pizzaSize = pizzaSize;
        this.price = calculatePrice();
    }

    private double calculatePrice() {
        switch (pizzaSize) {
            case SMALL:
            default:
                return 5.99;
            case MEDIUM:
                return 7.99;
            case LARGE:
                return 10.99;
        }
    }


    public String getName() {
        return name;
    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public double getPrice() {
        return price;
    }

}

public class InnerClassesApp {

    private static boolean isPizzaReady(int waitedInMinutes) {
        class Oven{
            public boolean isPizzaBakedProperly() {
                if (waitedInMinutes > 30)
                    return true;
                else
                    return false;
            }
        }
        Oven oven = new Oven();
        return oven.isPizzaBakedProperly();
    }

    public static void main(String[] args) {
        Pizza firstPizza = new Pizza("Margherita", PizzaSize.MEDIUM);
        System.out.println("Name: " + firstPizza.getName());

        Pizza secondPizza = new Pizza("Margherita", PizzaSize.MEDIUM){
            @Override
            public String getName() {
                return "Anonymous";
            }
        };
        System.out.println("Name: " + secondPizza.getName());


        if (isPizzaReady(40)) {
            System.out.println("The pizza is ready");
        }
        else {
            System.out.println("The pizza is not ready yet");
        }


    }
}
