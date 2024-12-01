package beginner.methods;

public class FunctionApp {
    public static void main(String[] args) {
        sayHi();
        blackBoardPunishment(10);

        System.out.println("The price with 10% off: " + getTenPercentOfDiscountPrice(20000));

        System.out.println("The price with 50% off: " + getDiscountPrice(20000, 50));
        System.out.println("The price with 50% off: " + getDiscountPrice(20000.75, 60));

    }

    static void sayHi(){
        System.out.println("Hi!");
    }

    static void blackBoardPunishment(int repeatNumber){
        for (int i = 1; i <= repeatNumber; i++) {
            System.out.println("BEING RIGHT SUCKS");
        }
    }

    static double getTenPercentOfDiscountPrice(int price){
        return price * 0.9;
    }

    static double getDiscountPrice(int price, int percent) {
        return price * percent / 100.0;
    }

    static double getDiscountPrice(double price, int percent) {
        return price * percent / 100;
    }
}
