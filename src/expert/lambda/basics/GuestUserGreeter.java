package expert.lambda.basics;

public class GuestUserGreeter implements Greeter {
    @Override
    public void perform() {
        System.out.println("Welcome to Guest User. Create account.");
    }
}
