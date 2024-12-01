package beginner.controlflow;

public class ControlFlowPractice {

    public static void main(String[] args) {
        String nameScholar = "Tomas Edison";


        System.out.println("Who is named as the inventor of the light bulb?");
        if (nameScholar.equals("Nikola Tesla")) {
            System.out.println("Nikola Tesla");
            System.out.println("You're wrong");
        } else if (nameScholar.equals("Marie Curie")) {
            System.out.println("Marie Curie");
            System.out.println("You're wrong");
        } else if (nameScholar.equals("Tomas Edison")) {
            System.out.println("Tomas Edison");
            System.out.println("You're right");
        } else if (nameScholar.equals("Robert Oppenheimer")) {
            System.out.println("Robert Oppenheimer");
            System.out.println("You're wrong");
        }

    }
}
