package intermediate.stringfunctions;

import java.util.Scanner;

public class StringFunctionsApp {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        String inputText = keyboardInput.nextLine();

        if(inputText.equals("Paris")) {
            System.out.println("Paris was typed in.");
        } else {
            System.out.println("Paris was not typed in.");
        }

        if(inputText.equalsIgnoreCase("Paris")) {
            System.out.println("Paris was typed in.");
        } else {
            System.out.println("Paris was not typed in.");
        }

        if (inputText.contains("Paris")) {
            System.out.println("The input text contains Par.");
        }

        if (inputText.isEmpty()) {
            System.out.println("The input text is empty.");
        }

        System.out.println("The input text's length is: " + inputText.length());
        System.out.println("The input text with upper case is: " + inputText.toUpperCase());
        System.out.println("The input text with lower case is: " + inputText.toLowerCase());

        if (inputText.startsWith("P") || inputText.startsWith("P")) {
            System.out.println("The input text starts with P and ends with P.");
        }

        System.out.println("The replaced text: " + inputText.replace("N", "D"));

    }
}
