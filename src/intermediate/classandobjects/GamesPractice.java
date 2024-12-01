package intermediate.classandobjects;

public class GamesPractice {
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

    public GamesPractice(byte windowsRequirement, byte memoryRequirement, byte directxVersion, byte storageNeed, short graphicsNeed, short processorNeed, short price, int steamID, int allReviews, boolean stillAvailable) {
        this.windowsRequirement = windowsRequirement;
        this.memoryRequirement = memoryRequirement;
        this.directxVersion = directxVersion;
        this.storageNeed = storageNeed;
        this.graphicsNeed = graphicsNeed;
        this.processorNeed = processorNeed;
        this.price = price;
        this.steamID = steamID;
        this.allReviews = allReviews;
        this.stillAvailable = stillAvailable;
    }

    public void compatibleWithYourPc(byte memoryRequirement, byte directxVersion,short graphicsNeed, short processorNeed){
        if(memoryRequirement < 8)
            System.out.println("Memory requirement is less than 8.");
        else if (directxVersion <= 9)
            System.out.println("Directx version is less than 9.");
        else if (graphicsNeed < 950)
            System.out.println("Graphics need is less than 950");
        else if (processorNeed < 2500)
            System.out.println("Processor need is less than 2500");
        else
            System.out.println("Your PC setup is compatible with the game's system requirements.");

    }
}
