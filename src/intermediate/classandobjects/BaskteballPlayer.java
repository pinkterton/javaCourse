package intermediate.classandobjects;

import java.util.Random;

public class BaskteballPlayer {

    String name;
    String nickname;
    int yearOfBorn;
    String team;

    double freeThrowPrecentage;
    double pointsPerGame;
    int gamesPlayed;

    public BaskteballPlayer(String name, String nickname, int yearOfBorn, String team, double freeThrowPrecentage, double pointsPerGame, int gamesPlayed) {
        this.name = name;
        this.nickname = nickname;
        this.yearOfBorn = yearOfBorn;
        this.team = team;
        this.freeThrowPrecentage = freeThrowPrecentage;
        this.pointsPerGame = pointsPerGame;
        this.gamesPlayed = gamesPlayed;
    }

    public void freeThrow() {
        Random randomNumberGenerator = new Random();
        if((randomNumberGenerator.nextDouble() * 100) > freeThrowPrecentage) {
            System.out.println(name + " failed to score free throw.");

        }
        else {
            System.out.println(name + " scored free throw.");
        }
    }
}
