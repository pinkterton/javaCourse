package intermediate.classandobjects;

public class CarsApp {

    public static void main(String[] args) {
        DodgeChallenger bluedodgeChallenger = new DodgeChallenger("blue", (byte)5, (short)425, (short)313, (short)9700, 150000, 1500, true);
        bluedodgeChallenger.mileage = 0;
        bluedodgeChallenger.getDescription();
        bluedodgeChallenger.startTheEngine();

        System.out.println("-----------------------------------------------");
        DodgeChallenger orangeDodgeChallenger = new DodgeChallenger("orange", (byte)1, (short) 392, (short)492, (short)6700, 30000, 10000, false);
        orangeDodgeChallenger.getDescription();
        orangeDodgeChallenger.startTheEngine();

    }
}
