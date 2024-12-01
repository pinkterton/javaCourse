package advanced.collections.vectorlist;

import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {
        Vector<String> toDoVector = new Vector<>(2, 3);
        System.out.println("Initial capacity of the vector: " + toDoVector.capacity());

        toDoVector.add("Cleaning the garden");
        toDoVector.add("Doing the dishes");
        toDoVector.add("Buying chemical stuff for bathroom");

        System.out.println("Capacity of the vector after adding 3 elements: " + toDoVector.capacity());
        System.out.println("Size of the vector after adding 3 elements: " + toDoVector.size());

        System.out.println("The first element of the vector is: " + toDoVector.firstElement());
        System.out.println("The last element of the vector is: " + toDoVector.lastElement());
    }
}
