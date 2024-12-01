package intermediate.polymorphism.athlete;

import java.util.Random;

public class BaskteballPlayer extends Athlete {

    double freeThrowPrecentage;
    double pointsPerGame;


    public BaskteballPlayer(String name, String nickname, int yearOfBorn, String team, double freeThrowPrecentage, double pointsPerGame, int gamesPlayed) {
        super(name, nickname, yearOfBorn, team, gamesPlayed);
        this.freeThrowPrecentage = freeThrowPrecentage;
        this.pointsPerGame = pointsPerGame;
    }

    public void freeThrow() {
        Random randomNumberGenerator = new Random();
        if((randomNumberGenerator.nextDouble() * 100) > freeThrowPrecentage)
            System.out.println(super.getName()+ " failed to score free throw.");
        else
            System.out.println(super.getName()+ " scored free throw.");
    }

    @Override
    public void getBio() {
        super.getBio();
        System.out.println("Free throw precentage is " + freeThrowPrecentage + "%");
        System.out.println("Points per game is " + pointsPerGame);
    }

    @Override
    public void compete() {
        super.compete();
        freeThrow();
    }

    @Override
    public String getBodyType() {
        return "Tall and lean muscle.";
    }

    public double getFreeThrowPrecentage() {
        return freeThrowPrecentage;
    }

    public void setFreeThrowPrecentage(double freeThrowPrecentage) {
        this.freeThrowPrecentage = freeThrowPrecentage;
    }

    public double getPointsPerGame() {
        return pointsPerGame;
    }

    public void setPointsPerGame(double pointsPerGame) {
        this.pointsPerGame = pointsPerGame;
    }
}
