package beginner.datatypes.primitives;

public class PrimitivesTask {

    public static void main(String[] args) {
        byte windowsRequirement = 7;
        byte memoryRequirement = 3;
        byte directxVersion = 11;
        byte storageNeed = 45;

        short graphicsNeed = 960;
        short processorNeed = 2500;
        short price = 925;

        int steamID = 1449690;
        int allReviews = 15998;

        boolean stillAvailable = true;

        System.out.println("The Walking Dead: The Telltale Definitive Series");
        System.out.println("System requirements:\n");
        System.out.println("OS: Windows " + windowsRequirement + "64Bit");
        System.out.println("Memory: " + memoryRequirement + "GB RAM");
        System.out.println("DirectX: Version " + directxVersion);
        System.out.println("Storage: " + storageNeed + "GB available space");
        System.out.println("Graphics: Nvidia GeForce GTX " + graphicsNeed);
        System.out.println("Processor: Intel Core i5-" + processorNeed + "\n");
        System.out.println("Price: " + price + "UAH");
        System.out.println("Steam ID: " + steamID);
        System.out.println("All Reviews: " + allReviews);
        System.out.println("Still Available: " + stillAvailable);



    }
}
