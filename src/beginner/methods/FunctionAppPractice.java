package beginner.methods;

public class FunctionAppPractice {
    public static void main(String[] args) {

        char energy = 'g';
        System.out.println(getEnergyEfficiency(energy));
        getCarDescription("Porsche", 1996, "Great");
    }

    static String getEnergyEfficiency(char energy) {
        switch (energy) {
            case 'A':
            case 'a':
                return "A - very low";
            case 'B':
            case 'b':
                return "B - low";
            case 'C':
            case 'c':
                return "C - normal";
            case 'D':
            case 'd':
                return "D - above normal";
            case 'E':
            case 'e':
                return "E - high";
            case 'F':
            case 'f':
                return "F - very high";
            case 'G':
            case 'g':
                return "G - extremely high";
            default:
                return "Invalid input";
        }
    }

    static void getCarDescription(String model, int productionYear, String condition) {
        System.out.println("The car is a " + model);
        System.out.println("The car was made in " + productionYear);
        System.out.println("Car's condition" + condition);
    }

}
