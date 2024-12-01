package intermediate.polymorphism.car;

public class CarsApp {

    public static void main(String[] args) {
        DodgeChallenger bluedodgeChallenger = new DodgeChallenger("blue", (byte)5, (short)425, (short)313, (short)9700, 150000, 1500, true);
        System.out.println(bluedodgeChallenger.getCarName() + "'s price is " + bluedodgeChallenger.getPrice());
        bluedodgeChallenger.setPrice(35000);
        System.out.println(bluedodgeChallenger.getCarName() + "'s new price is " + bluedodgeChallenger.getPrice());
        System.out.println("The car is in city mode.");
        bluedodgeChallenger.startElectricEngine();
        System.out.println("The car has " + bluedodgeChallenger.getMileage() + " miles");
        bluedodgeChallenger.drive(140.6);
        System.out.println("After driving the car, it has " + bluedodgeChallenger.getMileage() + " miles");

        System.out.println("-----------------------------------------------");
        ToyotaSupra blackToyotaSupra = new ToyotaSupra("black", (byte)1, (short)413, (short)3223, (short)9700, 150000, 1500, true);
        System.out.println(blackToyotaSupra.getCarName() + "'s price is " + blackToyotaSupra.getPrice());
        blackToyotaSupra.setPrice(35000);
        System.out.println(blackToyotaSupra.getCarName() + "'s new price is " + blackToyotaSupra.getPrice());
        blackToyotaSupra.startTheEngine();
        System.out.println("The car has " + blackToyotaSupra.getMileage() + " miles");
        blackToyotaSupra.drive(100);
        System.out.println("After driving the car, it has " + blackToyotaSupra.getMileage() + " miles");


    }
}
