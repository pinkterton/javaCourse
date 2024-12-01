package beginner.operators;

public class OperatorsApp {

    public static void main(String[] args) {

        String carModel = "Porsche 911";
        int price = 14999;
        int moneyInTheBank = 100000;
        boolean isDamaged = true;

        System.out.println("Price of a " + carModel + ": " + price + " UAH");

        int increasedPrice = price + 1000;
        System.out.println("The increased price of a " + carModel + ": " + increasedPrice + " UAH");
        int decreasedPrice = price - 1000;
        System.out.println("The decreased price of a " + carModel + ": " + decreasedPrice + " UAH");
        int twoCarsPrice = price * 2;
        System.out.println("Two " + carModel + ": " + twoCarsPrice + " UAH");
        int porscheYouCanBuy = moneyInTheBank / price;
        System.out.println("You can buy " + porscheYouCanBuy + " "+ carModel);
        int moneyRemaining = moneyInTheBank % price;
        System.out.println("Money we'd remain after buying " + porscheYouCanBuy + " " + carModel + ": " + moneyRemaining + " UAH");
        System.out.println();

        int priceNegative = -14999;
        int priceNegativeWithPlusSign = +priceNegative;
        System.out.println("Negative price with plus sign : " + priceNegativeWithPlusSign + " UAH");
        int priceNegativeWithMinusSign = -priceNegative;
        System.out.println("Negative price with minus sign : " + priceNegativeWithMinusSign + " UAH");
        int priceOneUahPriceIncrease = ++price;
        System.out.println("Price after 1 uah price increase : " + priceOneUahPriceIncrease + " UAH");
        int priceOneUahPriceDecrease = --price;
        System.out.println("Price after 1 uah price decrease : " + priceOneUahPriceDecrease + " UAH");
        System.out.println("This car is damaged: " + !isDamaged);
        System.out.println();

        System.out.println("Car's price equals the money in the bank: " + (price == moneyInTheBank));
        System.out.println("Car's price doesn't equal the money in the bank: " + (price != moneyInTheBank));
        System.out.println("Car's price is greater than the money in the bank: " + (price > moneyInTheBank));
        System.out.println("Car's price is less than the money in the bank: " + (price < moneyInTheBank));
        System.out.println("Car's price is greater than or equals the money in the bank: " + (price >= moneyInTheBank));
        System.out.println("Car's price is less than or equals the money in the bank: " + (price <= moneyInTheBank));
        System.out.println("The carModel variable's datatype is String: " + (carModel instanceof String));
        System.out.println();

        String damagedText = isDamaged ? "The car is damaged" : "The car is not damaged";
        System.out.println(damagedText);
        System.out.println();

        String worthSeeingText = !isDamaged || price <=20000 ? "It's worth seeing the car" : "It isn't worth seeing the car";
        System.out.println(worthSeeingText);
        String worthRepairingText = isDamaged && price <=10000 ? "It's worth repairing the car" : "It isn't worth repairing the car";
        System.out.println(worthRepairingText);

        price += 1000;
        System.out.println("Price increased: " + price + " UAH");
        price -= 2000;
        System.out.println("Price increased: " + price + " UAH");
        price *= 2;
        System.out.println("Price multiplied: " + price + " UAH");
//        price /= 2;
//        System.out.println("Price divided: " + price + " UAH");
        price %= 10000;
        System.out.println("Price remained: " + price + " UAH");

    }
}
