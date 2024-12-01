package advanced.collections.arraylist;

import java.util.ArrayList;

public class WebShopApp {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();


        products.add(new Product("Fidget spinner", 3.99, "It's fun."));
        products.add(new Product("Earbud", 39.99, "Extremely clear sound. Waterproof"));
        products.add(new Product("Earbud", 39.99, "Extremely clear sound. Waterproof"));

        products.add(1,new Product("Gloves", 5.99, "For gardens"));

        products.remove(2);
       //products.remove(new Product("Earbud", 39.99, "Extremely clear sound. Waterproof"));

        products.set(0, new Product("Rober duck", 5.99, "fun"));

        System.out.println(products);
        System.out.println();

        for (Product product : products) {
            System.out.println(product);
        }

        System.out.println();
        System.out.println("The third element on the list:");
        System.out.println(products.get(2));

        System.out.println();
        System.out.println(products.size() + " products can be found on the list");

    }
}
