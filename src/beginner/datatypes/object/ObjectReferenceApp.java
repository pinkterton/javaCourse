package beginner.datatypes.object;

public class ObjectReferenceApp {

    public static void main(String[] args) {
        Byte numberOfSeats = 5;
        Short horsePower = 392;
        Integer price = 14999;
        Long registrationNumber = 244245112313123L;

        Float fuelConsumptionCombined = 15.5F;
        Double fuelConsumptionPrecise = 15.531313231312312312314;

        Boolean isDamaged = true;
        Character energyEfficiencyCategory = 'G';

        String carModel = "DodgeChallenger SRT 392";
        String carModelNew = new String("DodgeChallenger SRT 392");
 
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("Horsepower: " + horsePower);
        System.out.println("Price: $" + price.floatValue());
        System.out.println("Registration: " + registrationNumber);
        System.out.println("Combined fuel consumption: " + fuelConsumptionCombined);
        System.out.println("Precise fuel consumption: " + fuelConsumptionPrecise.intValue());
        System.out.println("This car is damaged: " + isDamaged);
        System.out.println("Energy efficiency category: " + energyEfficiencyCategory + "\n");

        System.out.println("The car model: " + carModel);
        System.out.println("The car model with uppercase: " + carModel.toUpperCase());
        System.out.println("Car mode; and car model with new keyword are equals: " + carModel.equals(carModelNew));
        System.out.println("The car with new keyword: " + carModelNew);

    }

}
