package beginner.controlflow;

public class ControlFlowApp {

    public static void main(String[] args) {
        boolean isDamaged = true;
        String carColor = "purple";
        char energyEfficiencyCategory = 'A';


        if (isDamaged) {
            System.out.println("Damaged car!!!");
        } else {
            System.out.println("Accident free car");
        }

        if (carColor.equals("red")) {
            System.out.println("This car is red");
        } else if (carColor.equals("blue")) {
            System.out.println("This car is blue");
        } else if (carColor.equals("green")) {
            System.out.println("This car is green");
        } else {
            System.out.println("I have no idea what's the color of the car.");
        }

        switch (energyEfficiencyCategory) {
            case 'A':
            case 'B':
                System.out.println("Low energy consumption");
                break;
            case 'G':
                System.out.println("High energy consumption");
                break;
            default:
                System.out.println("Not defined category");

        }


        {
            //int numberOfBastards = 5;
            {
                int numberOfBastards = 5;
                numberOfBastards++;
            }
            //System.out.println(numberOfBastards + " - there are BASTARDS!");
        }


    }

}
