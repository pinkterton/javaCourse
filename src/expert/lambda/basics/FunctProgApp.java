package expert.lambda.basics;

import java.util.Scanner;

public class FunctProgApp {
    public static void main(String[] args) {
        WelcomeMessageService welcomeMessageService = new WelcomeMessageService();
        Scanner userStatusScanner  = new Scanner(System.in);
        String userStatus = userStatusScanner.nextLine();

        Greeter greeter;
        if ("guest".equals(userStatus)) {
            greeter = () -> System.out.println("Welcome to our application. Please Create an account or log in.");
        } else if ("loggedIn".equals(userStatus)) {
            greeter = () -> System.out.println("Welcome back.");
        } else {
            greeter = () -> System.err.println("Unknown user status!");
        }

        welcomeMessageService.greet(greeter);


    }
}

