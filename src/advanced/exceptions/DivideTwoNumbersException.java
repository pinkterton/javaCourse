package advanced.exceptions;

public class DivideTwoNumbersException {
    public static void main(String[] args) {
        System.out.println(divide(30,2));
        System.out.println(divide(30,0));
        System.out.println("The job is finished!");

    }

    private static int divide(int a, int b) {

        try {
            if(b == 0 ){
                throw new ZeroDivisorException("The divisor can't be zero - Custom exception");
            }
            return a / b;
        } catch (ZeroDivisorException|NumberFormatException exception) {
            System.err.println("The divisor can't be zero");
            exception.printStackTrace();
            return 0;
        } catch (NullPointerException exception) {
            System.err.println("NullPointerException is thrown");
            return 0;
        } finally {
            System.out.println("Hey, I'm a very good tool to close files and database connections.");
        }
    }
}
