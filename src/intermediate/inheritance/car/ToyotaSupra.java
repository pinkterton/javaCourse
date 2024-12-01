package intermediate.inheritance.car;

public class ToyotaSupra extends Car {
    public ToyotaSupra(String color, byte numberOfVehicleOwners, short power, short horsePower, short cubicCapacity, int price, int mileage, boolean isDamage) {
        super("Toyota Supra", color, numberOfVehicleOwners, power, horsePower, cubicCapacity, price, mileage, isDamage);
    }

    @Override
    public void startTheEngine() {
        System.out.println("Toyota Supra engine is started");
    }
}
