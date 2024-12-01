package intermediate.encapsulation.athlete;

public class AthleteApp {

    public static void main(String[] args) {
        BaskteballPlayer kobe = new BaskteballPlayer("Kobe Bryant", "Black Mamba", 1978, "Lakers", 83.7, 25.0, 1346);
        kobe.setFreeThrowPrecentage(83.8);
        kobe.setPointsPerGame(25.5);
        BaskteballPlayer jordan = new BaskteballPlayer("Michael Jordan", "MJ", 1963, "Chicago Bulls", 83.5, 30.1, 1072);
        BaskteballPlayer magic = new BaskteballPlayer("Earvin Johnson", "Magic", 1959, "Lakers", 84.8, 19.5, 906);

        BaskteballPlayer[] baskteballPlayers = new BaskteballPlayer[3];
        baskteballPlayers[0] = kobe;
        baskteballPlayers[1] = jordan;
        baskteballPlayers[2] = magic;

        for (BaskteballPlayer player : baskteballPlayers) {
            System.out.println("---------------------------------------------");
            player.playGame();
            System.out.println("---------------------------------------------");
            player.getBio();
        }

        FootballPlayer tom = new FootballPlayer("Tom Brady", "Tom Terrific", 1977, "Tampa Bay", 285, 9998, 6377);
        tom.increaseCompletions(35);
        tom.increasePassingYards(17);
        FootballPlayer ed = new FootballPlayer("Ed Brady", "Ed Terrific", 1979, "Totanhem", 285, 9998, 6377);
        ed.setTeam("Minecraft");



        FootballPlayer[] footballPlayers = new FootballPlayer[2];
        footballPlayers[0] = tom;
        footballPlayers[1] = ed;

        for (FootballPlayer player : footballPlayers) {
            System.out.println("---------------------------------------------");
            player.playGame();
            System.out.println("---------------------------------------------");
            player.getBio();
        }

    }
}
