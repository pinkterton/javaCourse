package intermediate.defautvalues;

public class Car {
    private byte numberOfSeats;
    private short horsepower;
    private int price;
    private long registrationNumber;

    private float fuelConsumption;
    private double preciseFuelConsumption;

    private boolean isDamaged;
    private char energyEfficiencyCategory;
    private String color;

    private Boolean hasElectricEngine;
    private Engine engine;

    public void getDetails() {
        System.out.println("Price: €" + price);
        System.out.println("The car is damaged: " + isDamaged);
        System.out.println("Registration number: " + registrationNumber);
        System.out.println("Energy efficiency: " + energyEfficiencyCategory);
        System.out.println("Number of seats: " + numberOfSeats);
    }
}
