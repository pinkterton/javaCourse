package intermediate.classandobjects;

public class BasketballApp {

    public static void main(String[] args) {
        BaskteballPlayer kobe = new BaskteballPlayer("Kobe Bryant", "Black Mamba", 1978, "Lakers", 83.7, 25.0, 1346);
        BaskteballPlayer jordan = new BaskteballPlayer("Michael Jordan", "MJ", 1963, "Chicago Bulls", 83.5, 30.1, 1072);
        BaskteballPlayer magic = new BaskteballPlayer("Earvin Johnson", "Magic", 1959, "Lakers", 84.8, 19.5, 906);

        BaskteballPlayer[] baskteballPlayers = new BaskteballPlayer[3];
        baskteballPlayers[0] = kobe;
        baskteballPlayers[1] = jordan;
        baskteballPlayers[2] = magic;

        for (BaskteballPlayer player : baskteballPlayers) {
            player.freeThrow();
        }
    }
}
