package intermediate.inheritance.car;

public class CarsApp {

    public static void main(String[] args) {
        DodgeChallenger bluedodgeChallenger = new DodgeChallenger("blue", (byte)5, (short)425, (short)313, (short)9700, 150000, 1500, true);
        bluedodgeChallenger.getDescription();
        bluedodgeChallenger.startTheEngine();

        System.out.println("-----------------------------------------------");
        ToyotaSupra blackToyotaSupra = new ToyotaSupra("black", (byte)1, (short)413, (short)3223, (short)9700, 150000, 1500, true);
        blackToyotaSupra.getDescription();
        blackToyotaSupra.startTheEngine();

    }
}
