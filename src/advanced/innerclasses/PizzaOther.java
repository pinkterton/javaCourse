package advanced.innerclasses;

import advanced.enumcoding.PizzaSize;

public class PizzaOther {
    private String name;
    private PizzaSize pizzaSize;
    private double price;

    public PizzaOther(String name, PizzaSize pizzaSize) {
        this.name = name;
        this.pizzaSize = pizzaSize;
        this.price = calculatePrice();
    }

    class PizzaSlice {
        public String calculatePizzaSliceArea() {
            switch (pizzaSize) {
                case SMALL:
                default:
                    return "SMALL SLICE";
                case MEDIUM:
                    return "MEDIUM SLICE";
                case LARGE:
                    return "LARGE SLICE";
            }

        }
    }

    public PizzaSlice sutPizzaSlice() {
        return new PizzaSlice();
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
