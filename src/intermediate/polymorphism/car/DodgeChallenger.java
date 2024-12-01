package intermediate.polymorphism.car;

public class DodgeChallenger extends Car implements ElectricMode {

    public DodgeChallenger(String color, byte numberOfVehicleOwners, short power, short horsePower, short cubicCapacity,
                    int price, int mileage, boolean isDamage){
        super("Dodge Challenger", color, numberOfVehicleOwners, power, horsePower, cubicCapacity, price, mileage, isDamage);
    }


    @Override
    public void startTheEngine() {
        System.out.println("A Dodge Challenger engine is started.");
    }

    @Override
    public void startElectricEngine() {
        System.out.println("Dodge challenger electric engine is started.");
    }
}
